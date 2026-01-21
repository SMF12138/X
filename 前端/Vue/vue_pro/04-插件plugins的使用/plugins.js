export const p1 = {
	// 每个插件对象中必须有一个install方法，参数为Vue实例
	// 方法中也可有用户传入的其他参数，可实现独立功能
	install(Vue, a, b, c) {
		console.log("我是你爹");
		console.log(Vue);
		console.log(a, b, c);
		Vue.prototype.counter = 1000;
	},
};
 