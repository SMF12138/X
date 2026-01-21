<template>
    <div>
        <h1>{{ msg }}</h1>
        <h1>{{ name }}</h1>
        <h1>{{ age }}</h1>
        <button @click="printInfo">打印用户信息</button>
        <button @click="cp">cp吗</button>
    </div>
</template>
<script>
// 局部混入
// import { mix1 } from "../mixin.js";
// import { mix2 } from "../mixin.js";
// import { mix3 } from "../mixin.js";
export default {
    name: "User",
    // 如果是mounted函数则先执行混入，再执行原函数
    mounted(){
        console.log('何意味')
    },
    data() {
        return {
            msg: "用户信息",
            name: "张三",
            age: 20,
        };
    },
    // 设置数组接收多个混入
    // mixins: [mix1, mix2, mix3],
    // 混入机制不会覆盖原有函数
    methods: {
        cp() {
            console.log("cpnm");
        },
    },
};
</script>