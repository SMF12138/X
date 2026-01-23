<template>
    <tr>
        <td>
            <input type="checkbox" :checked="bug.resolved" @change="modifyResolved(bug.id)" />
        </td>
        <td>
            <span v-show="!bug.editState" class="desc" @click="enterEdit(bug)">{{ bug.desc }}</span>
            <!-- blur表示失去聚焦 -->
            <input ref="inputDesc" v-show="bug.editState" type="text" :value="bug.desc" @blur="updateDesc(bug, $event)"></input>
        </td>
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
    props: ["bug", "modofyResolvedCallback", "deleteByIdCallback", "updateDescCallback"],
    methods: {
        modifyResolved(bugId) {
            this.$bus.$emit('modofyResolvedCallback', bugId);
        },
        deleteById(bugId) {
            this.$bus.$emit('deleteByIdCallback', bugId);
        },
        // 传进去的bug就是当前被点击的那一行对应的对象
        enterEdit(bug) {
            // hasOwnProperty判断是否已有元素防止多次创建
            if (bug.hasOwnProperty('editState')) {
                bug.editState = true;
            } else {
                // 响应式添加才能被正常识别渲染
                this.$set(bug, 'editState', true);
            }
            this.$nextTick(function() {
                this.$refs.inputDesc.focus();
            })
        },
        updateDesc(bug, e) {
            if (!e.target.value.trim()) {
                return;
            }
            this.$bus.$emit('updateDescCallback', bug.id, e.target.value);
            bug.editState = false;
        }
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

.desc {
    cursor: pointer;
}
</style>