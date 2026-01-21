<template>
    <div class="header">
        <textarea
            cols="105"
            rows="4"
            v-model="desc"
            placeholder="请输入儿子的描述信息"
        ></textarea>
        <br />
        <button class="small green button" @click="saveBug">保存</button>
    </div>
</template>
<script>
export default {
    name: "BugHeader",
    data() {
        return {
            desc: "",
        };
    },
    props: ["saveBugCallback"],
    methods: {
        saveBug() {
            // trim去掉两端空字符，若为空串则结束
            if (!this.desc.trim()) {
                return;
            }
            // 用时间戳生成id
            let bugObj = { id: Date.now(), desc: this.desc, resolved: false };
            this.saveBugCallback(bugObj);
            this.desc = "";
        },
    },
};
</script>
<style scoped>
.header {
    background-color: #ffffff;
    padding: 15px;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    margin-bottom: 20px;
}

textarea {
    width: 100%;
    padding: 10px;
    font-size: 14px;
    border: 1px solid #ccc;
    border-radius: 5px;
    resize: vertical;
}

button {
    margin-top: 10px;
    background-color: #28a745;
    color: #fff;
    padding: 8px 15px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

button:hover {
    background-color: #218838;
}
</style>
