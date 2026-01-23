<template>
	<button @click="triggerEvent">触发事件，发送数据给爷爷</button>
</template>

<script>
export default {
	name: "Vip",

	data() {
		return {
			name: "jakcon",
		};
	},
	methods: {
		triggerEvent() {
			// 获取共享的VC对象并触发
			this.$bus.$emit("eventx", this.name);
		},
	},
};
</script>
