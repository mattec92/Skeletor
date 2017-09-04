package se.mattec.skeletor.dagger

import android.content.Context
import se.mattec.skeletor.SkeletorApplication

class Dagger {

    companion object {

        /**
         * Utility for getting the AppComponent from Application without casting.
         */
        fun component(context: Context): AppComponent {
            return (context.applicationContext as SkeletorApplication).appComponent
        }

    }

}