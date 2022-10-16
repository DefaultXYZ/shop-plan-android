import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    id(Plugins.androidApplication).version(Plugins.Version.androidGradle).apply(false)
    id(Plugins.androidLibrary).version(Plugins.Version.androidGradle).apply(false)
    id(Plugins.kotlin).version(Plugins.Version.kotlinAndroid).apply(false)
    id(Plugins.dependencyUpdates)
}

tasks.withType<DependencyUpdatesTask> {
    rejectVersionIf {
        !isLibraryVersionStable(candidate.version)
    }
}

fun isLibraryVersionStable(version: String): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.toUpperCase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    return stableKeyword || regex.matches(version)
}
