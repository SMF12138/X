<template>
    <div>
        <button @click="hello">内置事件的实现步骤 </button>
        <User></User>
    </div>
</template>
<script>
import User from "./components/User.vue";
export default {
    name: "App",
    methods:{
        hello(){
            console.log("我是爸爸");
        }
    },
    components: { User },
};
</script>
