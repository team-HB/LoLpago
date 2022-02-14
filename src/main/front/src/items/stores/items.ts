import { acceptHMRUpdate, defineStore } from 'pinia'
import { Item } from '~/items/types/item'

export const useOrderStore = defineStore('item', () => {
  const savedItemId = ref(0)
  const savedItemName = ref('')
  const savedItemIsUnique = ref(false)
  const savedItemIsElusive = ref(false)

  function setCurrentItem(item: Item) {
    savedItemId.value = item.id
    savedItemName.value = item.name
    savedItemIsUnique.value = item.isUnique
    savedItemIsElusive.value = item.isElusive
  }

  return {
    savedItemId,
    savedItemName,
    savedItemIsUnique,
    savedItemIsElusive,
    setCurrentItem,
  }
})

if (import.meta.hot)
  import.meta.hot.accept(acceptHMRUpdate(useOrderStore, import.meta.hot))
