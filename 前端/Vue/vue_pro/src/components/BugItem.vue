<template>
    <tr>
        <td>
            <input type="checkbox" :checked="bug.resolved" @change="modifyResolved(bug.id)" />
            <!-- 简单写法直接实现功能，但改父组件数据不建议使用 -->
            <!-- <input
                type="checkbox"
                v-model="bug.resolved"
            /> -->
        </td>
        <td>{{ bug.desc }}</td>
        <td>
            <button class="small red button" @click="deleteById(bug.id)">
                删除
            </button>
        </td>
    </tr>
</template>
<script>
export default {
    name: "BugItem",
    // 从父组件BugList中传入标记标签
    props: ["bug", "modofyResolvedCallback", "deleteByIdCallback"],
    methods: {
        modifyResolved(bugId) {
            this.modofyResolvedCallback(bugId);
        },
        deleteById(bugId) {
            this.deleteByIdCallback(bugId);
        },
    },
};
</script>
<style scoped>
button {
    background-color: #dc3545;
    color: #fff;
    padding: 6px 12px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

button:hover {
    background-color: #c82333;
}

input[type="checkbox"] {
    transform: scale(1.2);
}
</style>