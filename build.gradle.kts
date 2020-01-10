// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
    }
//    dependencies {
//        classpath 'com.android.tools.build:gradle:4.0.0-alpha03'
//        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
//        classpath 'androidx.navigation:navigation-safe-args-gradle-plugin:2.1.0'
//
//        // NOTE: Do not place your application dependencies here; they belong
//        // in the individual module build.gradle files
//    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven ( url = "https://jitpack.io" )
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}