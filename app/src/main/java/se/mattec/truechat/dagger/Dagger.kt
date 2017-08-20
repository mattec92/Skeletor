package se.mattec.truechat.dagger

import android.content.Context
import se.mattec.truechat.TrueChatApplication

class Dagger {

    companion object {

        /**
         * Utility for getting the AppComponent from TrueChatApplication without casting.
         */
        fun component(context: Context): AppComponent {
            return (context.applicationContext as TrueChatApplication).appComponent
        }

    }

}