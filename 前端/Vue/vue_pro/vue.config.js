const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  // 在编译时关闭检查语法
  lintOnSave: false,
  // 配置入口
  pages:{
    index:{
      entry:'src/main.js'
    }
  }
})
