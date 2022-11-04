plugins {
    id(Plugins.androidApplication)
    id(Plugins.kotlin)
    id(Plugins.kotlinKapt)
    id(Plugins.hilt)
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
    implementation(Dependencies.androidCore)
    implementation(Dependencies.lifecycleRuntime)
    implementation(Dependencies.activityCompose)
    implementation(Dependencies.navigationCompose)

    implementation(Dependencies.coroutines)
    implementation(Dependencies.coroutinesPlayServices)

    implementation(Dependencies.hilt)
    implementation(Dependencies.hiltCompose)
    kapt(Dependencies.hiltCompiler)

    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeFoundation)
    implementation(Dependencies.uiTooling)
    implementation(Dependencies.composeMaterial)

    implementation(Dependencies.coil)

    implementation(platform(Dependencies.firebaseBom))
    implementation(Dependencies.firebaseAuth)
    implementation(Dependencies.firebaseStorage)
    implementation(Dependencies.firestore)

    implementation(Dependencies.jodaTime)
    implementation(Dependencies.timber)

    testImplementation(Dependencies.junit)

    androidTestImplementation(Dependencies.androidJunit)
    androidTestImplementation(Dependencies.espresso)
    androidTestImplementation(Dependencies.uiTest)
}

kapt {
    correctErrorTypes = true
}
