import dependencies.AppDependencies

plugins {
    id(AppPlugins.javaLibrary)
    id(AppPlugins.jvmKotlin)
}

dependencies {
    dependencies(
        AppDependencies.Coroutines.core,
        AppDependencies.Koin.bom,
        AppDependencies.Koin.core,
    )
}