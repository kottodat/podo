plugins {
    `kotlin-dsl`
}

repositories {
    google()
    jcenter()
}

dependencies {
    implementation("com.android.tools.build:gradle:3.5.3")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.60")
    implementation("com.google.gms:google-services:4.3.3")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.1.0")
}