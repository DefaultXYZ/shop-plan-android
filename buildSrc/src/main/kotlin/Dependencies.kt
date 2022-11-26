object Versions {
    // Libraries

    const val androidCore = "1.9.0"
    const val lifecycleRuntime = "2.5.1"
    const val activityCompose = "1.6.1"
    const val navigationCompose = "2.5.3"
    const val coroutines = "1.6.4"
    const val compose = "1.3.1"
    const val composeCompiler = "1.3.2"
    const val accompanist = "0.27.1"
    const val coil = "2.2.2"
    const val hilt = "2.44.2"
    const val hiltCompose = "1.0.0"
    const val firebase = "31.1.0"
    const val jodaTime = "2.12.1"
    const val timber = "5.0.1"

    // Tests

    const val junit = "4.13.2"
    const val mockito = "4.0.0"

    // Android Tests

    const val androidJunit = "1.1.4"
    const val espresso = "3.4.0"
}

private object Artifacts {
    // Libraries

    const val androidCore = "androidx.core:core-ktx"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx"
    const val activityCompose = "androidx.activity:activity-compose"
    const val navigationCompose = "androidx.navigation:navigation-compose"

    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android"
    const val coroutinesPlayServices = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services"

    const val composeUi = "androidx.compose.ui:ui"
    const val composeFoundation = "androidx.compose.foundation:foundation"
    const val composeMaterial = "androidx.compose.material:material"

    const val accompanistSystemUi = "com.google.accompanist:accompanist-systemuicontroller"

    const val coil = "io.coil-kt:coil-compose"

    const val hilt = "com.google.dagger:hilt-android"
    const val hiltCompose = "androidx.hilt:hilt-navigation-compose"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler"

    const val firebaseBom = "com.google.firebase:firebase-bom"
    const val firebaseAuth = "com.google.firebase:firebase-auth-ktx"
    const val firebaseStorage = "com.google.firebase:firebase-storage-ktx"
    const val firestore = "com.google.firebase:firebase-firestore-ktx"

    const val jodaTime = "joda-time:joda-time"
    const val timber = "com.jakewharton.timber:timber"

    // Tests

    const val junit = "junit:junit"
    const val mockito = "org.mockito.kotlin:mockito-kotlin"

    // Android Tests

    const val uiTest = "androidx.compose.ui:ui-test-junit4"
    const val uiTooling = "androidx.compose.ui:ui-tooling"
    const val androidJunit = "androidx.test.ext:junit"
    const val espresso = "androidx.test.espresso:espresso-core"
}

object Dependencies {
    // Libraries

    const val androidCore = "${Artifacts.androidCore}:${Versions.androidCore}"
    const val lifecycleRuntime = "${Artifacts.lifecycleRuntime}:${Versions.lifecycleRuntime}"
    const val activityCompose = "${Artifacts.activityCompose}:${Versions.activityCompose}"
    const val navigationCompose = "${Artifacts.navigationCompose}:${Versions.navigationCompose}"

    const val coroutines = "${Artifacts.coroutines}:${Versions.coroutines}"
    const val coroutinesPlayServices = "${Artifacts.coroutinesPlayServices}:${Versions.coroutines}"

    const val composeUi = "${Artifacts.composeUi}:${Versions.compose}"
    const val composeFoundation = "${Artifacts.composeFoundation}:${Versions.compose}"
    const val composeMaterial = "${Artifacts.composeMaterial}:${Versions.compose}"

    const val accompanistSystemUi = "${Artifacts.accompanistSystemUi}:${Versions.accompanist}"

    const val coil = "${Artifacts.coil}:${Versions.coil}"

    const val hilt = "${Artifacts.hilt}:${Versions.hilt}"
    const val hiltCompose = "${Artifacts.hiltCompose}:${Versions.hiltCompose}"
    const val hiltCompiler = "${Artifacts.hiltCompiler}:${Versions.hilt}"

    const val firebaseBom = "${Artifacts.firebaseBom}:${Versions.firebase}"
    const val firebaseAuth = Artifacts.firebaseAuth
    const val firebaseStorage = Artifacts.firebaseStorage
    const val firestore = Artifacts.firestore

    const val jodaTime = "${Artifacts.jodaTime}:${Versions.jodaTime}"
    const val timber = "${Artifacts.timber}:${Versions.timber}"

    // Tests

    const val junit = "${Artifacts.junit}:${Versions.junit}"
    const val mockito = "${Artifacts.mockito}:${Versions.mockito}"

    // Android Tests

    const val uiTest = "${Artifacts.uiTest}:${Versions.compose}"
    const val uiTooling = "${Artifacts.uiTooling}:${Versions.compose}"
    const val androidJunit = "${Artifacts.androidJunit}:${Versions.androidJunit}"
    const val espresso = "${Artifacts.espresso}:${Versions.espresso}"
}
