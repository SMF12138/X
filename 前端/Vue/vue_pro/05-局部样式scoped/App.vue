<template>
    <div>
        <User></User>
        <Vip></Vip>
    </div>
</template>
<script>
import Vip from "./components/Vip.vue";
import User from "./components/User.vue";
export default {
    name: "App",
    components: { User, Vip },
};
</script>

<style>
    /*一般根组件添加的样式不加scoped，可作为全局样式使用*/
</style>