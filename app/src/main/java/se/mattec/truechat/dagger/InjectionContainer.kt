package se.mattec.truechat.dagger

import se.mattec.truechat.TrueChatApplication
import se.mattec.truechat.views.activities.MainActivity

interface InjectionContainer {

    fun inject(obj: TrueChatApplication)

    fun inject(obj: MainActivity)

}