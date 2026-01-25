<template>
    <div>
        <button @click="publishEnglish">发布我是爸爸</button>
    </div>
</template>
<script>
import pubsub from "pubsub-js";
export default {
    name: "B",
    methods: {
        publishEnglish() {
            // 发布时第一个参数订阅名要保持一致
            pubsub.publish('我是爸爸','我真的是爸爸')
        },
    },
};
</script>
