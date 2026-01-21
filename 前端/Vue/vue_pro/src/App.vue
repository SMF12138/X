<template>
    <div class="app-container">
        <BugHeader :saveBugCallback="saveBugCallback"></BugHeader>
        <BugList
            :bugList="bugList"
            :modofyResolvedCallback="modofyResolvedCallback"
            :deleteByIdCallback="deleteByIdCallback"
        ></BugList>
        <BugFooter :bugList="bugList"></BugFooter>
    </div>
</template>
<script>
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
    methods: {
        saveBugCallback(bug) {
            // 注意由于不能从子组件中修改数据，因此将子组件对象传入父组件进行修改(通过props将父函数传入子组件)
            this.bugList.unshift(bug);
        },
        modofyResolvedCallback(bugId) {
            this.bugList.forEach((bug) => {
                if (bug.id === bugId) {
                    bug.resolved = !bug.resolved;
                }
            });
        },
        deleteByIdCallback(bugId){
            this.bugList = this.bugList.filter((bug) => {
                return bug.id !== bugId 
            })
        }
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
