<script setup lang="ts">
import { useUserStore } from '~/users/stores/user'
const { t } = useI18n()
const router = useRouter()
const userStore = useUserStore()

const name = ref(userStore.savedName)
const email = ref(userStore.savedEmail)
const activeTab = ref('0')
const multiline = ref(false)
const showBooks = ref(false)

const choosePlans = () => {
  if (name.value && email.value) {
    userStore.setNewName(name.value)
    userStore.setNewEmail(email.value)

    router.push(`/orders/${encodeURIComponent(name.value)}`)
  }
}
</script>

<template>
  <div class="max-w-md mx-auto">
    <v-title-lg>
      {{ t('intro.fill-up-form') }}
    </v-title-lg>

    <v-description
      m="y-5"
    >
      {{ t('no-data-saved') }}
    </v-description>

    <div class="py-4" />

    <section>
      <p>
        <o-button @click="activeTab = 1">
          Set Music
        </o-button>
      </p>
      <p>
        <o-switch v-model="showBooks">
          Show Books item
        </o-switch>
        <o-switch v-model="multiline">
          Multiline
        </o-switch>
      </p>
      <o-tabs v-model="activeTab" :multiline="multiline">
        <o-tab-item value="0" label="Pictures">
          Lorem ipsum dolor sit amet.
        </o-tab-item>

        <o-tab-item :value="1" label="Music">
          Lorem <br />
          ipsum <br />
          dolor <br />
          sit <br />
          amet.
        </o-tab-item>

        <o-tab-item value="2" :visible="showBooks" label="Books">
          What light is light, if Silvia be not seen? <br />
          What joy is joy, if Silvia be not by— <br />
          Unless it be to think that she is by <br />
          And feed upon the shadow of perfection? <br />
          Except I be by Silvia in the night, <br />
          There is no music in the nightingale.
        </o-tab-item>

        <o-tab-item value="3" label="Videos" icon="video" disabled>
          Nunc nec velit nec libero vestibulum eleifend. Curabitur pulvinar congue luctus. Nullam hendrerit iaculis augue vitae ornare. Maecenas vehicula pulvinar tellus, id sodales
          felis lobortis eget.
        </o-tab-item>
      </o-tabs>
    </section>
    <div>
      <label class="block mb-1" text="sm gray-500" for="inputName">{{ t('intro.whats-your-name') }}</label>
      <v-input
        id="inputName"
        v-model="name"
        typeof="text"
        placeholder="John Doe"
        :aria-label="t('intro.whats-your-name')"
      />
    </div>

    <div class="py-2" />

    <div>
      <label class="block mb-1" text="sm gray-500" for="inputEmail">{{ t('intro.whats-your-email') }}</label>
      <v-input
        id="inputEmail"
        v-model="email"
        typeof="email"
        placeholder="john@example.com"
        :aria-label="t('intro.whats-your-email')"
      />
    </div>

    <div class="mt-5">
      <VButton
        text="base"
        p="x-4 y-2"
        :disabled="!name || !email"
        data-test="btn-choose-plan"
        @click.self="choosePlans"
      >
        {{ t('button.choose-plans') }}
      </VButton>
    </div>

    <div class="mb-8">
      <VButtonText
        text="gray-500"
        font="semibold"
        p="x-4 y-2"
        @click.self="router.back()"
      >
        {{ t('button.back') }}
      </VButtonText>
    </div>
  </div>
</template>

<route lang="yaml">
meta:
  layout: home
</route>
