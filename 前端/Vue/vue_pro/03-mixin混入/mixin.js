// 混入机制，导出公共片段
export const mix1 = {
    methods: {
        printInfo() {
            console.log(this.name, "，", this.age);
        },
    },
};
// 混入机制不会覆盖原有函数
export const mix2 = {
    methods: {
        cp() {
            console.log("cpdd");
        },
    },
};
// 如果是mounted函数则先执行混入，再执行原函数
export const mix3 = {
    // 在全局变量中因为四个周期(VM+3VC)，会打印4次
    mounted() {
        console.log("mixin.js mounted...");
    },
};
