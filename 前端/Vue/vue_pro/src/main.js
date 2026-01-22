import Vue from "vue";
import App from "./App.vue";

//Vue.extend({})生成了组件构造函数
// const VucComponentConstructor = Vue.extend({});
// 获取共享的VC对象
// const globalvc = new VucComponentConstructor();
// 给原型对象扩展全局VC，使所有组件可以访问
// Vue.prototype.x = globalvc;
new Vue({
    render: (h) => h(App),
    // 用VM代替上面globalvc，注意要在beforeCreate中尽早使用，防止时序风险
    beforeCreate() {
        // Vue.prototype.x = this;
        // 全局总线专业写法
        Vue.prototype.$bus = this;
    },
}).$mount("#app");
