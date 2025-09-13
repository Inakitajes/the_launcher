package launcher.inakitajes.me.helper

import launcher.inakitajes.me.data.AppModel

interface AppFilterHelper {
    fun onAppFiltered(items:List<AppModel>)
}