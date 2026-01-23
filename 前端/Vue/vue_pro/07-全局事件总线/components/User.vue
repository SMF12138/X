<template>
	<div>
		<button @click="triggerEvent1">触发event1事件</button>
		<button @click="triggerEvent2">触发event2事件</button>
		<button @click="unbinding">解绑事件</button>
		<button @click="goodbye">再见</button>
		<Vip></Vip>
	</div>
</template>
<script>
	import Vip from './Vip.vue'
export default {
	name: "User",
	data() {
		return {
			name: "zhangsan",
			age: 20,
		};
	},
	components:{Vip},
	methods: {
		triggerEvent1() {
			// this.$emit方法用于触发自定义事件，同时可以将参数传递给父组件
			this.$emit("event1", this.name, this.age);
		},
		triggerEvent2() {
			// this.$emit方法用于触发自定义事件，同时可以将参数传递给父组件
			this.$emit("event2", this.name, this.age);
		},
		unbinding(){
			// 解绑可使用单个或数组形式，注意要在子组件解绑
			this.$off(['event1','event2']);
		},
		goodbye(){
			// 销毁当前组件
			this.destroy();
		}
	},
};
</script>
