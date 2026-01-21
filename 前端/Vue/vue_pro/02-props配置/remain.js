 // 引入了vue.js文件
import Vue from 'vue'
import App from './App.vue'
// 关闭生产提示信息
Vue.config.productionTip = false

new Vue({
    // template无法解析是因为使用的Vue为仅运行版本，因此使用render函数
    // render函数会自动传入一个createElement函数，这个函数可以用来创建元素
    // render(createElement) {
    //    return createElement('div', 'render函数');
    // }
    // 下面是简写形式，其中h相当于createElement函数
    render: h => h(App),
    // 挂载到app，相当于el配置项
}).$mount('#app')