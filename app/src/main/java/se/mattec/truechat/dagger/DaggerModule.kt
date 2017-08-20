package se.mattec.truechat.dagger

import android.content.Context
import dagger.Module
import dagger.Provides
import se.mattec.truechat.TrueChatApplication
import javax.inject.Singleton

@Module
class DaggerModule(val application: TrueChatApplication) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context {
        return application
    }

    @Provides
    @Singleton
    fun provideTrueChatApplication(): TrueChatApplication {
        return application
    }

}