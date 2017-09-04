package se.mattec.skeletor

import android.app.Application
import se.mattec.skeletor.dagger.AppComponent
import se.mattec.skeletor.dagger.DaggerAppComponent
import se.mattec.skeletor.dagger.DaggerModule
import timber.log.Timber

class SkeletorApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initTimber()
        initDagger()
    }

    fun initTimber() {
        Timber.plant(Timber.DebugTree())
    }

    fun initDagger() {
        appComponent = DaggerAppComponent.builder()
                .daggerModule(DaggerModule(this))
                .build()
        appComponent.inject(this)
    }

}