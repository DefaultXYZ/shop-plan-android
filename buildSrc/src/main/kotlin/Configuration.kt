import org.gradle.api.JavaVersion

object Configuration {
    const val versionCode = 1
    const val versionName = "1.0.0"

    private const val sdk = 33
    const val compileSdk = sdk
    const val targetSdk = sdk
    const val minSdk = 23

    private const val basePackage = "xyz.shop.plan"
    const val applicationId = basePackage
    const val namespace = basePackage

    val javaVersion: JavaVersion = JavaVersion.VERSION_11
}
