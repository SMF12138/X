<template>
    <tr>
        <td>
            <input type="checkbox" :checked="bug.resolved" @change="modifyResolved(bug.id)" />
        </td>
        <td>
            <span v-show="!bug.editState" class="desc" @click="enterEdit(bug)">{{ bug.desc }}</span>
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
import pubsub from 'pubsub.js'
export default {
    name: "BugItem",
    props: ["bug", "modofyResolvedCallback", "deleteByIdCallback", "updateDescCallback"],
    methods: {
        modifyResolved(bugId) {
            pubsub.publish('modofyResolvedCallback', bugId);
        },
        deleteById(bugId) {
            pubsub.publish('deleteByIdCallback', bugId);
        },
        enterEdit(bug) {
            if (bug.hasOwnProperty('editState')) {
                bug.editState = true;
            } else {
                pubsub.publish(bug, 'editState', true);
            }
            this.$nextTick(function() {
                this.$refs.inputDesc.focus();
            })
        },
        updateDesc(bug, e) {
            let newDesc = e.target.value.trim();
            if (!newDesc) {
                return;
            };
            bug.desc = newDesc;
            pubsub.publish('updateDescCallback', bug);
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