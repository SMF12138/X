<template>
    <div>
        <button @click.once="hello">内置事件的实现步骤</button>
        <!-- 给组件绑定自定义事件，需要定义代码触发事件 -->
        <!-- 自定义事件可用于向父组件传数据，父组件绑定，子组件触发 -->
        <User v-on:event1="doSome" @event2="doOther"></User>
        <!-- 简写 -->
        <User @event1.once="doSome" @event2="doOther"></User>
        <User ref="user"></User>
    </div>
</template>
<script>
import User from "./components/User.vue";
export default {
    name: "App",
    mounted() {
        // 绑定全局组件事件
        this.$bus.$on('eventx',this.test);
        // 手动绑定
        this.$refs.user.$on("event1", this.doSome);
        // 可用once修饰，只触发一次
        // this.$refs.user.$once("event2", this.doOther);
        // 如果回调函数是普通函数，那么this指向User组件实例，而不是App组件实例
        // this.$refs.user.$once("event2", function(){
        //     console.log(this);
        // });
        // 若使用箭头函数，this也指向App
        this.$refs.user.$once("event2", ()=>{
            console.log(this);
        });
    },
    methods: {
        hello() {
            console.log("我是爸爸");
        },
        // doSome(name, age) {
        //     // 接收子组件传来的参数
        //     console.log(name, age);
        // },
        // ES6的语法，...param可以看做数组
        doSome(name, ...param) {
            // 接收子组件传来的参数
            console.log(name, param);
        },
        doOther(name, ...param) {
            // 接收子组件传来的参数
            console.log(name, param);
        },
        test(name){
            console.log(name)
        }
    },
    components: { User },
};
</script>
