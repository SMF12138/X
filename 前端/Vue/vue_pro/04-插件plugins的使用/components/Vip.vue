<template>
    <div>
        <h1>{{ msg }}</h1>
        <h1>{{ name }}</h1>
        <h1>{{ age }}</h1>
        <button @click="printInfo">打印会员信息</button>
        <button @click="cp">cp吗</button>
    </div>
</template>
<script>
// 局部混入
// import { mix1 } from "../mixin.js";
// import { mix2 } from "../mixin.js";
export default {
    name: "Vip",
    data() {
        return {
            msg: "会员信息",
            name: "李四",
            age: 21,
        };
    },
    // 设置数组接收多个混入
    // mixins: [mix1, mix2],
    // 混入机制不会覆盖原有函数
    methods: {
        cp() {
            console.log("cpnm");
            console.log("插件扩展的counter可以被VC访问", this.counter);
        },
    },
};
</script>
