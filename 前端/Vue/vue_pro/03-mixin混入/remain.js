import Vue from 'vue'
import App from './App.vue'
Vue.config.productionTip = false
// 进行全局混入
import { mix1 } from "./mixin.js";
import { mix2 } from "./mixin.js";
import { mix3 } from "./mixin.js";
Vue.mixin(mix1)
Vue.mixin(mix2)
Vue.mixin(mix3)

new Vue({
    render: h => h(App),
}).$mount('#app')