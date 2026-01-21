<template>
    <div class="footer">
        <button class="small red button">清除已解决</button>
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
    computed: {
        resovledCount() {
            //     let count = 0;
            //     this.bugList.forEach((bug) => {
            //         if (bug.resolved) count++;
            //     });
            //     return count;
            // },
            // 下面使用ES6数组的reduce方法实现功能
            // 回调函数调用次数为数组总量，返回值是下一次回调的a参数，初始值设为0，b代表当前统计对象
            const count = this.bugList.reduce((a, b) => {
                return a + (b.resolved ? 1 : 0);
            }, 0);
            return count;
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
