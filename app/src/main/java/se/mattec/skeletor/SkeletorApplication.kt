package se.mattec.skeletor

import android.app.Application
import org.koin.android.ext.android.startKoin
import se.mattec.skeletor.koin.appModule
import timber.log.Timber

class SkeletorApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initTimber()
        initKoin()
    }

    private fun initTimber() {
        Timber.plant(Timber.DebugTree())
    }

    private fun initKoin() {
        startKoin(this, listOf(appModule(this)))
    }

}