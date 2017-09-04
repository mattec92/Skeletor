package se.mattec.skeletor.dagger

import se.mattec.skeletor.SkeletorApplication
import se.mattec.skeletor.views.activities.MainActivity

interface InjectionContainer {

    fun inject(obj: SkeletorApplication)

    fun inject(obj: MainActivity)

}