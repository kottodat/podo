import dependencies.Dep
import dependencies.Packages
import dependencies.Versions


plugins {
    id("com.android.application")
    id("androidx.navigation.safeargs")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Versions.androidCompileSdkVersion)


    defaultConfig {
        applicationId = Packages.name
        minSdkVersion(Versions.androidMinSdkVersion)
        targetSdkVersion(Versions.androidTargetSdkVersion)
        versionCode = Versions.androidVersionCode
        versionName = Versions.androidVersionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            resValue("string", "versionCode", "$Versions.androidVersionCode")
            resValue("string", "versionName", "$Versions.androidVersionName")
            signingConfig = signingConfigs.getByName("debug")
            isDebuggable = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "$project.rootDir/tools/proguard-rules-debug.pro")
        }
        getByName("release") {
            resValue("string", "versionCode", "$Versions.androidVersionCode")
            resValue("string", "versionName", "$Versions.androidVersionName")
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }


    flavorDimensions("dimensions")


    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dep.Kotlin.stdlibJvm)
    implementation(Dep.AndroidX.appCompat)
    implementation(Dep.AndroidX.coreKtx)
    implementation(Dep.AndroidX.constraint)
    implementation(Dep.AndroidX.design)
    implementation(Dep.AndroidX.legacy)

    implementation(Dep.AndroidX.Navigation.fragmentKtx)
    implementation(Dep.AndroidX.Navigation.uiKtx)

    implementation(Dep.Firebase.core)
    implementation(Dep.Firebase.messaging)

    implementation(Dep.Glide.glide)
    kapt(Dep.Glide.compiler)
    implementation(Dep.Glide.okhttp3Intergration)

    implementation(Dep.Squareup.Retrofit.retrofit)
    implementation(Dep.Squareup.Retrofit.converterGson)
    implementation(Dep.Squareup.Retrofit.rxjava2)
    implementation(Dep.Squareup.Retrofit.mock)
    implementation(Dep.Squareup.OkHttp.loggingInterceptor)

    implementation(Dep.Jakewharton.Timber.common)

    testImplementation(Dep.Test.junit)
    androidTestImplementation(Dep.Test.testRunner)
    androidTestImplementation(Dep.Test.espressoCore)
}
