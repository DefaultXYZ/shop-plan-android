object Versions {
    // Libraries
    const val compose = "1.2.1"
    const val composeCompiler = "1.3.2"
    const val core = "1.9.0"
    const val lifecycleRuntime = "2.5.1"
    const val activityCompose = "1.6.0"
    const val navigationCompose = "2.5.2"
    const val firebase = "30.5.0"
    const val jodaTime = "2.12.0"
    const val hilt = "2.44"
    const val hiltCompose = "1.0.0"
    const val coroutines = "1.6.4"

    // Tests
    const val junit = "4.13.2"
    const val mockito = "4.0.0"

    // Android Tests
    const val androidJunit = "1.1.3"
    const val espresso = "3.4.0"
}

private object Artifacts {
    // Libraries
    const val androidCore = "androidx.core:core-ktx"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx"
    const val activityCompose = "androidx.activity:activity-compose"
    const val navigationCompose = "androidx.navigation:navigation-compose"

    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android"

    const val composeUi = "androidx.compose.ui:ui"
    const val composeFoundation = "androidx.compose.foundation:foundation"
    const val composeMaterial = "androidx.compose.material:material"

    const val hilt = "com.google.dagger:hilt-android"
    const val hiltCompose = "androidx.hilt:hilt-navigation-compose"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler"

    const val firebaseBom = "com.google.firebase:firebase-bom"
    const val firebaseAuth = "com.google.firebase:firebase-auth-ktx"
    const val firebaseStorage = "com.google.firebase:firebase-storage-ktx"
    const val firestore = "com.google.firebase:firebase-firestore-ktx"

    const val jodaTime = "joda-time:joda-time"

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
    const val androidCore = "${Artifacts.androidCore}:${Versions.core}"
    const val lifecycleRuntime = "${Artifacts.lifecycleRuntime}:${Versions.lifecycleRuntime}"
    const val activityCompose = "${Artifacts.activityCompose}:${Versions.activityCompose}"
    const val navigationCompose = "${Artifacts.navigationCompose}:${Versions.navigationCompose}"

    const val coroutines = "${Artifacts.coroutines}:${Versions.coroutines}"

    const val composeUi = "${Artifacts.composeUi}:${Versions.compose}"
    const val composeFoundation = "${Artifacts.composeFoundation}:${Versions.compose}"
    const val composeMaterial = "${Artifacts.composeMaterial}:${Versions.compose}"

    const val hilt = "${Artifacts.hilt}:${Versions.hilt}"
    const val hiltCompose = "${Artifacts.hiltCompose}:${Versions.hiltCompose}"
    const val hiltCompiler = "${Artifacts.hiltCompiler}:${Versions.hilt}"

    const val firebaseBom = "${Artifacts.firebaseBom}:${Versions.firebase}"
    const val firebaseAuth = Artifacts.firebaseAuth
    const val firebaseStorage = Artifacts.firebaseStorage
    const val firestore = Artifacts.firestore

    const val jodaTime = "${Artifacts.jodaTime}:${Versions.jodaTime}"

    // Tests
    const val junit = "${Artifacts.junit}:${Versions.junit}"
    const val mockito = "${Artifacts.mockito}:${Versions.mockito}"

    // Android Tests
    const val uiTest = "${Artifacts.uiTest}:${Versions.compose}"
    const val uiTooling = "${Artifacts.uiTooling}:${Versions.compose}"
    const val androidJunit = "${Artifacts.androidJunit}:${Versions.androidJunit}"
    const val espresso = "${Artifacts.espresso}:${Versions.espresso}"
}
