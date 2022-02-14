<script lang="ts">
export default {
  
  setup () {
    onMounted(() => {
      test
    })

    const state = reactive ({
      test : 'testssss'
    })

    const test = () => {
      state.test = 'xxx'
    }
  }
}


</script>

<template>
<div>{{test}}</div>
  
</template>
