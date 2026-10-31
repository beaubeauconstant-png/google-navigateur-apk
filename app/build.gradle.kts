plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "fr.simple.googleapp"
    compileSdk = 36
    defaultConfig {
        applicationId = "fr.simple.googleapp"
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }
}
