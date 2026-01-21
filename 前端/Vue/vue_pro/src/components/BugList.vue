<template>
    <div>
        <table class="bug-table">
            <thead>
                <tr>
                    <th class="c1">全选<input type="checkbox" /></th>
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
                ></BugItem>
            </tbody>
        </table>
    </div>
</template>
<script>
import BugItem from "./BugItem.vue";
export default {
    name: "BugList",
    props: ["bugList", "modofyResolvedCallback", "deleteByIdCallback"],
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
