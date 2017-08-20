package se.mattec.truechat

import android.app.Application
import se.mattec.truechat.dagger.AppComponent
import se.mattec.truechat.dagger.DaggerAppComponent
import se.mattec.truechat.dagger.DaggerModule
import timber.log.Timber

class TrueChatApplication : Application() {

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