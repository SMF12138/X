<template>
    <div></div>
</template>
<script>
import pubsub from "pubsub-js";
export default {
    name: "A",
    // mounted() {
    //     // 挂载完毕后订阅消息，订阅于pubsub对象时会返回一个pid供解绑使用
    //     this.pid = pubsub.subscribe("我是爸爸", function (massageName, message) {
    //         // massageName为消息名，message为具体信息
    //         console.log("消息名是: " + massageName + " 内容是: " + message);
    //     });
    // },
    mounted() {
        // 此处为保证this指向实例，应使用箭头函数捕获上层this(否则为Win或未定义)
        this.pid = pubsub.subscribe("我是爸爸", (massageName, message) => {
            console.log("消息名是: " + massageName + " 内容是: " + message);
        });
    },
    beforeDestroy() {
        // 组件销毁前要取消订阅，使用pid进行解绑
        pubsub.unsubscribe(this.pid);
    },
};
</script>
