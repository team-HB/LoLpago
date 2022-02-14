import Oruga from '@oruga-ui/oruga-next'
import { UserModule } from '~/types'

export const install: UserModule = ({ app }) => {
  app.use(Oruga)
  // Refer to
  // https://github.com/antfu/vite-ssg/blob/main/README.md#state-serialization
  // for other serialization strategies.
}
