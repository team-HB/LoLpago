<script setup lang="ts">
import { ref, useSlots, getCurrentInstance } from 'vue'
import { Item } from '../types/item'

// prop으로 뭘 받을까? id, name
const props = defineProps<{id: number}>()
// const props = withDefaults(defineProps<Props>(), {
//   isSelected: false,
// })
const slots = useSlots()

const item = ref<Item>()

const url = `http://localhost:8080/v1/${props.id}` // 기본url + item.id

async function getItem(url) {
  const info = await fetch(url)
  const json = await info.json()
  item.value = json
}

// fetch(url)
//   .then(response => response.json())
//   .then((response) => {
//     item.value = response
//   })
// .catch((err) => { })
// getCurrentInstance().render = () => slots.default({
//   item: item.value,
// })
</script>

<template>
  <slot :item="item" />
  <img src="cdn.lolchess.gg/upload/images/items/RecurveBow_1640058784.png" alt="item.name" data-item-id="578" width="48" class="rounded-1\/2">
</template>

<style>
  .rounded-1\/2 {
  border-radius: 50%;
}
</style>
