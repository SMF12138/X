import Vue from "vue";
import App from "./App.vue";

Vue.config.productionTip = false;

import { mix1 } from "./mixin.js";
import { mix2 } from "./mixin.js";
import { mix3 } from "./mixin.js";

Vue.mixin(mix1);
Vue.mixin(mix2);
Vue.mixin(mix3);

// 导入插件
import { p1 } from "./plugins.js";

// 使用插件，需要在创建Vue实例前
Vue.use(p1, 2, 3, 4);

new Vue({
    render: (h) => h(App),
}).$mount("#app");
