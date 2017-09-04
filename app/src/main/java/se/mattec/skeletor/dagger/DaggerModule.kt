package se.mattec.skeletor.dagger

import android.content.Context
import dagger.Module
import dagger.Provides
import se.mattec.skeletor.SkeletorApplication
import javax.inject.Singleton

@Module
class DaggerModule(val application: SkeletorApplication) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context {
        return application
    }

    @Provides
    @Singleton
    fun provideApplication(): SkeletorApplication {
        return application
    }

}