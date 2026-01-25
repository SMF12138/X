<template>
    <div class="app-container">
        <BugHeader @saveBugCallback="saveBugCallback"></BugHeader>
        <BugList
            :bugList="bugList"
            @selectAllCallback="selectAllCallback"
        ></BugList>
        <BugFooter
            :bugList="bugList"
            @clearResolvedCallback="clearResolvedCallback"
        ></BugFooter>
    </div>
</template>
<script>
import pubsub from "pubsub.js";
import BugHeader from "./components/BugHeader.vue";
import BugList from "./components/BugList.vue";
import BugFooter from "./components/BugFooter.vue";
export default {
    name: "App",
    data() {
        return {
            bugList: [
                { id: "001", desc: "张稀然", resolved: false },
                { id: "002", desc: "还是张稀然", resolved: true },
                { id: "003", desc: "竟然还是张稀然", resolved: false },
            ],
        };
    },
    mounted() {
        // 订阅消息，注意这里没有直接将函数写到第二个参数里，而是通过this调用
       pid1 =  pubsub.subscribe("modofyResolvedCallback", this.modofyResolvedCallback);
        pid1 = pubsub.subscribe("deleteByIdCallback", this.deleteByIdCallback);
        pid1 = pubsub.subscribe("updateDescCallback", this.updateDescCallback);
    },
    // 注意组件销毁前要给总线事件解绑
    beforeDestroy() {
        this.$bus.$off(
            ["modofyResolvedCallback", "deleteByIdCallback"],
            "updateDescCallback",
        );
    },
    beforeDestroy(){
        pubsub.unscribe.pid1;
        pubsub.unscribe.pid2;
        pubsub.unscribe.pid3;
    },
    methods: {
        saveBugCallback(bug) {
            this.bugList.unshift(bug);
        },
        // 注意第一个参数temp为订阅名，仅起到占位作用
        modofyResolvedCallback(temp, bugId) {
            this.bugList.forEach((bug) => {
                if (bug.id === bugId) {
                    bug.resolved = !bug.resolved;
                }
            });
        },
        deleteByIdCallback(temp, bugId) {
            this.bugList = this.bugList.filter((bug) => {
                return bug.id !== bugId;
            });
        },
        selectAllCallback(flag) {
            this.bugList.forEach((bug) => {
                bug.resolved = flag;
            });
        },
        clearResolvedCallback() {
            this.bugList = this.bugList.filter((bug) => {
                return !bug.resolved;
            });
        },
        updateDescCallback(temp, bugObj) {
            this.bugList.forEach((bug) => {
                if (bug.id === bugObj.id) {
                    bug.desc = bugObj.desc;
                    return;
                }
            });
        },
    },
    components: { BugHeader, BugList, BugFooter },
};
</script>
<style scoped>
.app-container {
    font-family: Arial, sans-serif;
    max-width: 1200px;
    margin: 0 auto;
    padding: 20px;
    background-color: #f5f5f5;
    border-radius: 8px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}
</style>
