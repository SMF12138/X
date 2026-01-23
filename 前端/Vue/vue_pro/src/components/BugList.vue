<template>
    <div v-show="bugList.length">
        <table class="bug-table">
            <thead>
                <tr>
                    <th class="c1">
                        全选<input
                            type="checkbox"
                            :checked="isAll"
                            @change="selectAll"
                        />
                        <!-- 也可通过getter，setter方法实现 -->
                        <!-- 全选<input
                            type="checkbox"
                            v-model="isAll"
                        /> -->
                    </th>
                    <th>儿子</th>
                    <th class="c2">操作</th>
                </tr>
            </thead>
            <tbody>
                <BugItem
                    v-for="bug of bugList"
                    :key="bug.id"
                    :bug="bug"
                    :modofyResolvedCallback="modofyResolvedCallback"
                    :deleteByIdCallback="deleteByIdCallback"
                    :updateDescCallback="updateDescCallback"
                ></BugItem>
            </tbody>
        </table>
    </div>
</template>
<script>
import BugItem from "./BugItem.vue";
export default {
    name: "BugList",
    props: [
        "bugList",
        "modofyResolvedCallback",
        "deleteByIdCallback",
        "selectAllCallback",
        "updateDescCallback"
    ],
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
            // const count = this.bugList.reduce((a, b) => {
            //     return a + (b.resolved ? 1 : 0);
            // }, 0);
            // return count;
            // 简写方式
            return this.bugList.reduce((a, b) => a + (b.resolved ? 1 : 0), 0);
        },
        isAll() {
            return (
                this.bugList.length === this.resovledCount &&
                this.bugList.length > 0
            );
        },
        // 通过setter取代methods函数中的selectAll
        // isAll: {
        //     get() {
        //         this.bugList.length === this.resovledCount &&
        //             this.bugList.length > 0;
        //     },
        //     set(value) {
        //         this.selectAllCallback(value);
        //     },
        // },
    },
    methods: {
        selectAll(e) {
            this.selectAllCallback(e.target.checked);
        },
    },
    components: { BugItem },
};
</script>
<style scoped>
.bug-table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px;
}

.bug-table th,
.bug-table td {
    padding: 10px;
    text-align: left;
}

.bug-table th {
    background-color: #f1f1f1;
}

.bug-table tr:nth-child(even) {
    background-color: #fafafa;
}

input[type="checkbox"] {
    transform: scale(1.2);
    margin-right: 10px;
}
</style>
