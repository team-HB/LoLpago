<script setup lang="ts">
import { ref } from 'vue'
import { Champion } from '~/champions/types/champion'

const champions = ref(Array<Champion>())
async function getChampions() { // const getChamps = async() => {
  const info = await fetch('http://localhost:7849/v1/champions/all')

  const response = await info.text()
  const data = await (response ? JSON.parse(response) : {})

  // const json = await data.json()
  champions.value = data
}
onMounted(getChampions)
</script>

<template>
  <h1>hello</h1>
  <div v-for="c in champions" :key="c.name">
    {{ c.name }}
  </div>
</template>

<route lang="yaml">
meta:
  layout: home
</route>
