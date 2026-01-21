< <template>
	<div>
		<h3>品牌:{{ brand }}</h3>
		<h3>价格:{{ xprice }}</h3>
		<h3>颜色:{{ color }}</h3>
		<button @click="add">价格加一</button>
	</div>
</template>
	<script>
	export default {
		name: "Car",
		// data() {
		// 	return {
		// 		brand: "宝马520",
		// 		price: "20",
		// 		color: "黑色",
		// 	};
		// },
		// 为了实现数据的灵活使用，因此采用props配置项
		// props: ["brand",  "price", "color"],
		// 或使用下面的方式进行类型限制
		// props: {
		//     brand: String,
		//     color: String,
		//     price: Number,

		// }
		// 第三种写法必须添加类型限制，默认值，也可添加必要性
		props: {
			brand: {
				type: String,
				required: true,
			},
			color: {
				type: String,
				default: "红色",
			},
			String,
			price: {
				type: Number,
				required: true,
			},
		},
		data() {
			return {
				// 设置中间变量
				xprice: this.price,
			}
		},
		methods: {
			add() {
				// 注意不要修改props中的值，子组件只拥有「使用权限」，没有「修改权限」，因此通过中间变量的形式来实现效果
				this.xprice++;
			},
		},
	};
</script>