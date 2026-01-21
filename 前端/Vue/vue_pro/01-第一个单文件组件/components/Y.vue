<template>
    <div>
        <h1>Y组件</h1>
        <Y1></Y1>
    </div>
</template>
<script>
// 组件导入
import Y1 from './Y1.vue';
// 组件导出
export default {
    // 注册组件，注意组件名药与导出的文件名一致
    components: { Y1 }
};
</script>