<template>
    <div>
        <h1 ref="hh">
            {{ msg }}
        </h1>
        <!-- 注意:price是通过v-bind传入的常量而非字符串 -->
        <Car brand="宝马520" color="屎色" :price="10"></Car>
        <hr />
        <!-- 对子组件进行ref标记，为了父组件的1获取 -->
        <Car brand="比亚迪汉" color="白色" :price="20" ref="car1"></Car>
        <hr />
        <!-- 注意这里未配置颜色，使用props中默认值 -->
        <Car brand="腾跃790" :price="1000000" ref="car2"></Car>
        <hr />
        <button @click="printCarInfo">打印汽车信息</button>
    </div>
</template>
<script>
import Car from "./components/Car.vue";
export default {
    name: "App",
    data() {
        return {
            msg: "汽车信息",
        };
    },
    methods:{
        printCarInfo(){
            // this.$refs可获取VC(即App)中多个标签
            console.log(this.$refs.car1);
            console.log(this.$refs.car1.brand);
            console.log(this.$refs.car1.price);
            console.log(this.$refs.car1.color);
            console.log(this.$refs.car2); 
            console.log(this.$refs.hh);
        }
    },
    components: { Car },
};
</script>