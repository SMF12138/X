// 定义一个Vue类
class Vue {
	// 定义构造函数constructor，传入JS对象{}
	// 其中options中有一个data配置项
	constructor(options) {
		// 获取data中所有的属性名，forEach遍历获取数组中每个属性名和当前索引
		// =>{对变量要做的操作}
		Object.keys(options.data).forEach((propertyName, index) => {
			// 属性名不能以$和_开头
			if (
				propertyName.charAt(0) != "_" &&
				propertyName.charAt(0) != "$"
			) {
				/* 
			 这里this表示当前new的对象(即VM)，同时也是代理对象
			 而实际Vue开发中会对options.data，即data:{}进行封装
			 将其封装成this._data，即目标对象
			 代理本质是对 data:{} 的代理，data:{} 是目标对象，Vue 实例是代理对象
			 只不过Vue实例内部包含着这个目标对象
			*/
				Object.defineProperty(this, propertyName, {
					get() {
						return options.data[propertyName];
					},
					set(val) {
						options.data[propertyName] = val;
					},
				});
			}
		});
		// 获取所有的方法名
		Object.keys(options.methods).forEach((methodName, index) => {
			console.log(methodName);
			this[methodName] = options.methods[methodName];
		});
	}
}
