<template>
    <div class="footer" v-show="bugList.length">
        <button class="small red button" @click="clearResolved">
            清除已解决
        </button>
        <span
            >当前儿子总量{{ bugList.length }}个，已解决{{
                resovledCount
            }}个</span
        >
    </div>
</template> 
<script>
export default {
    name: "BugFooter",
    props: ["bugList"],
    methods: {
        clearResolved() {
            this.$emit('clearResolvedCallback');
        },
    },
    computed: {
        resovledCount() {
            return this.bugList.reduce((a, b) => a + (b.resolved ? 1 : 0), 0);
        },
    },
};
</script>
<style scoped>
.footer {
    background-color: #ffffff;
    padding: 15px;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    margin-top: 20px;
    display: flex;
    justify-content: space-between;
    align-items: center;
}

button {
    background-color: #dc3545;
    color: #fff;
    padding: 8px 15px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

button:hover {
    background-color: #c82333;
}

span {
    font-size: 14px;
    color: #555;
}
</style>
