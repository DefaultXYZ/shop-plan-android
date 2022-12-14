object Versions {
    // Libraries
    const val compose = "1.2.1"
    const val composeCompiler = "1.3.2"
    const val core = "1.9.0"
    const val lifecycleRuntime = "2.5.1"
    const val activityCompose = "1.6.0"
    const val navigationCompose = "2.5.2"

    // Tests
    const val junit = "4.13.2"

    // Android Tests
    const val androidJunit = "1.1.3"
    const val espresso = "3.4.0"
}

object Modules {
    object Android {
        const val core = "androidx.core:core-ktx"
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx"
        const val activityCompose = "androidx.activity:activity-compose"
        const val navigation = "androidx.navigation:navigation-compose"
    }

    object Compose {
        const val ui = "androidx.compose.ui:ui"
        const val foundation = "androidx.compose.foundation:foundation"
        const val material = "androidx.compose.material:material"

        const val uiTest = "androidx.compose.ui:ui-test-junit4"
        const val uiTooling = "androidx.compose.ui:ui-tooling"
    }

    object Test {
        const val junit = "junit:junit"
    }

    object AndroidTest {
        const val androidJunit = "androidx.test.ext:junit"
        const val espresso = "androidx.test.espresso:espresso-core"
    }
}

object Dependencies {
    object Android {
        const val core = "${Modules.Android.core}:${Versions.core}"
        const val lifecycleRuntime = "${Modules.Android.lifecycleRuntime}:${Versions.lifecycleRuntime}"
        const val activityCompose = "${Modules.Android.activityCompose}:${Versions.activityCompose}"
        const val navigationCompose = "${Modules.Android.navigation}:${Versions.navigationCompose}"
    }

    object Compose {
        const val ui = "${Modules.Compose.ui}:${Versions.compose}"
        const val foundation = "${Modules.Compose.foundation}:${Versions.compose}"
        const val material = "${Modules.Compose.material}:${Versions.compose}"
        const val uiTest = "${Modules.Compose.uiTest}:${Versions.compose}"
        const val uiTooling = "${Modules.Compose.uiTooling}:${Versions.compose}"
    }

    object Test {
        const val junit = "${Modules.Test.junit}:${Versions.junit}"
    }

    object AndroidTest {
        const val androidJunit = "${Modules.AndroidTest.androidJunit}:${Versions.androidJunit}"
        const val espresso = "${Modules.AndroidTest.espresso}:${Versions.espresso}"
    }
}
