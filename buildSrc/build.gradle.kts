plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(GradlePlugins.dependencyUpdates)
    implementation(GradlePlugins.googleServices)
}

object GradlePluginVersion {
    const val dependencyUpdates = "0.42.0"
    const val googleServices = "4.3.14"
}

object GradlePlugins {
    const val dependencyUpdates = "com.github.ben-manes:gradle-versions-plugin:${GradlePluginVersion.dependencyUpdates}"
    const val googleServices = "com.google.gms:google-services:${GradlePluginVersion.googleServices}"
}
