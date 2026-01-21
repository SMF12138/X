<template>
    <div>
        <h2>App组件</h2>
        <X></X>
        <Y></Y>
    </div>
</template>
<script>
import X from './components/X.vue'
import Y from './components/Y.vue'
export default {
    components: { X, Y }
}
</script>