package se.mattec.skeletor.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(DaggerModule::class))
interface AppComponent : InjectionContainer