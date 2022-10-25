import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    id(Plugins.androidApplication).version(Plugins.Version.androidGradle).apply(false)
    id(Plugins.androidLibrary).version(Plugins.Version.androidGradle).apply(false)
    id(Plugins.kotlin).version(Plugins.Version.kotlinAndroid).apply(false)
    id(Plugins.hilt).version(Plugins.Version.hilt).apply(false)
    id(Plugins.dependencyUpdates)
}

tasks.withType<DependencyUpdatesTask> {
    rejectVersionIf {
        !isLibraryVersionStable()
    }
}
