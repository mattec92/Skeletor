package se.mattec.skeletor.koin

import org.koin.dsl.module.module
import se.mattec.skeletor.SkeletorApplication

fun appModule(application: SkeletorApplication) = module {
    single { application }
}