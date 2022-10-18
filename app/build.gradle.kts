plugins {
    id(Plugins.androidApplication)
    id(Plugins.kotlin)
    id(Plugins.kotlinKapt)
    id(Plugins.googleServices)
}

android {
    namespace = Configuration.namespace
    compileSdk = Configuration.compileSdk

    defaultConfig {
        applicationId = Configuration.applicationId
        minSdk = Configuration.minSdk
        targetSdk = Configuration.targetSdk
        versionCode = Configuration.versionCode
        versionName = Configuration.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = Configuration.javaVersion
        targetCompatibility = Configuration.javaVersion
    }
    kotlinOptions {
        jvmTarget = Configuration.javaVersion.toString()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Dependencies.Android.core)
    implementation(Dependencies.Android.lifecycleRuntime)
    implementation(Dependencies.Android.activityCompose)
    implementation(Dependencies.Android.navigationCompose)

    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.foundation)
    implementation(Dependencies.Compose.uiTooling)
    implementation(Dependencies.Compose.material)

    implementation(platform(Dependencies.Firebase.firebaseBom))
    implementation(Dependencies.Firebase.firebaseAuth)
    implementation(Dependencies.Firebase.firebaseStorage)
    implementation(Dependencies.Firebase.firestore)

    implementation(Dependencies.Utils.jodaTime)

    testImplementation(Dependencies.Test.junit)

    androidTestImplementation(Dependencies.AndroidTest.androidJunit)
    androidTestImplementation(Dependencies.AndroidTest.espresso)
    androidTestImplementation(Dependencies.Compose.uiTest)
}
