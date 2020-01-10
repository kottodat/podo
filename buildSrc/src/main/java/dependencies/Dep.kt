package dependencies

@Suppress("unused")
object Dep {
    object GradlePlugin {
        val android = "com.android.tools.build:gradle:3.4.1"
        val r8 = "com.android.tools:r8:1.3.52"  // proguard를 대체하는 코드 축소 및 난독화
        val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
        val playServices = "com.google.gms:google-services:4.3.3"
        // aar, jar로 배포되는 라이브러리 내의 바이트 코드를 빌드 타임에 andoroidx에 대응되도록 변환
        val jetifier = "com.android.tools.build.jetifier:jetifier-processor:1.0.0-beta02"
        // 오픈소스 공지 플러그인 https://developers.google.com/android/guides/opensource
        val licensesPlugin = "com.google.android.gms:oss-licenses-plugin:0.9.4"
        //        val crashlytics = "io.fabric.tools:gradle:1.28.0"
        // 빌드 배포시 아이콘을 꾸며주는 플러그인 https://github.com/akaita/easylauncher-gradle-plugin
        val iconRibbonPlugin = "com.akaita.android:easylauncher:1.3.1"
    }

    object Test {
        val junit = "junit:junit:4.12"
        val testRunner = "androidx.test:runner:1.1.0"
        val androidJunit4 = "androidx.test.ext.junit:1.1.0"
        val archCore = "androidx.arch.core:core-testing:2.0.0"
        val espressoCore = "androidx.test.espresso:espresso-core:3.1.0-alpha3"
        val kotlinTestAssertions = "io.kotlintest:kotlintest-assertions:3.1.10"
        val testingKtx =
            "android.arch.navigation:navigation-testing-ktx:${AndroidX.Navigation.version}"

        object KotlinMultiPlatform {
            val jvmModuleTest = "org.jetbrains.kotlin:kotlin-test"
            val jvmModuleTestJunit = "org.jetbrains.kotlin:kotlin-test-junit"
            val commonModuleTest = "org.jetbrains.kotlin:kotlin-test-common"
            val commonModuleTestAnnotations = "org.jetbrains.kotlin:kotlin-test-annotations-common"
        }

        val slf4j = "org.slf4j:slf4j-simple:1.7.25"
    }

    object AndroidX {
        val jetifier = "com.android.tools.build.jetifier:jetifier-core:1.0.0-beta08"
        val appCompat = "androidx.appcompat:appcompat:1.1.0"
        val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
        val constraint = "androidx.constraintlayout:constraintlayout:1.1.3"
        val emoji = "androidx.emoji:emoji-appcompat:1.0.0"
        val design = "com.google.android.material:material:1.1.0-alpha02"
        val coreKtx = "androidx.core:core-ktx:1.1.0"
        val preference = "androidx.preference:preference:1.1.0"
        val browser = "androidx.browser:browser:1.2.0"
        val fragment = "androidx.fragment:fragment:1.1.0"

        //        val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:2.1.0"
//        val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata:2.1.0"
        object LifeCycle {
            val version = "2.1.0"
            val runtime = "androidx.lifecycle:lifecycle-runtime:$version"
            val java8 = "androidx.lifecycle:lifecycle-common-java8:$version"
            val compiler = "androidx.lifecycle:lifecycle-compiler:$version"
            val viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            val livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            val reactivestreams = "androidx.lifecycle:lifecycle-reactivestreams:$version"
        }

        object Room {
            val version = "2.2.1"
            val compiler = "androidx.room:room-compiler:$version"
            val runtime = "androidx.room:room-runtime:$version"
            val coroutine = "androidx.room:room-coroutines:$version"
            val ktx = "androidx.room:room-ktx:$version"
        }

        object Navigation {
            val version = "2.1.0"
//            val runtime = "android.arch.navigation:navigation-runtime:$version"
//            val runtimeKtx = "android.arch.navigation:navigation-runtime-ktx:$version"

            val fragment = "androidx.navigation:navigation-fragment:$version"
            val ui = "androidx.navigation:navigation-ui:$version"

            val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
            val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
        }

        object Work {
            val version = "2.2.0"
            val runtime = "androidx.work:work-runtime:$version"
            val runtimeKtx = "androidx.work:work-runtime-ktx:$version"
            val runtimeRxJava2 = "androidx.work:work-rxjava2:$version"
            val gcm = "androidx.work:work-gcm:$version"
            val testing = "androidx.work:work-testing:$version" // androidTestImplementation
        }
    }

    object Kotlin {
        val version = "1.3.60"
        val stdlibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:$version"
        val stdlibJvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        val coroutinesVersion = "1.1.1"
        val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
        val androidCoroutinesDispatcher =
                "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
        val coroutinesReactive =
                "org.jetbrains.kotlinx:kotlinx-coroutines-reactive:$coroutinesVersion"
        val coroutinesPlayServices =
                "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:$coroutinesVersion"
        val serializationCommon = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.10.0"
        val serializationIos = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:0.10.0"
        val anko = "org.jetbrains.anko:anko-commons:0.10.8"
    }

    object Firebase {
        val core = "com.google.firebase:firebase-core:17.2.1"
        val config = "com.google.firebase:firebase-config:19.0.3"
        val fireStore = "com.google.firebase:firebase-firestore:21.3.0"
        val database = "com.google.firebase:firebase-database:19.1.0"
        val auth = "com.google.firebase:firebase-auth:16.0.5"
        val crashlytics = "com.crashlytics.sdk.android:crashlytics:2.9.8"
        val messaging = "com.google.firebase:firebase-messaging:17.3.3"
        val analytics = "com.google.firebase:firebase-analytics:17.2.1"
    }

    object PlayServices {
        val auth = "com.google.android.gms:play-services-auth:16.0.1"
        val licensesPlugin = "com.google.android.gms:play-services-oss-licenses:16.0.1"
    }

    object Dagger {
        val version = "2.20"
        val core = "com.google.dagger:dagger:$version"
        val compiler = "com.google.dagger:dagger-compiler:$version"
        val androidSupport = "com.google.dagger:dagger-android-support:$version"
        val android = "com.google.dagger:dagger-android:$version"
        val androidProcessor = "com.google.dagger:dagger-android-processor:$version"
        val assistedInjectAnnotations =
                "com.squareup.inject:assisted-inject-annotations-dagger2:0.3.0"
        val assistedInjectProcessor = "com.squareup.inject:assisted-inject-processor-dagger2:0.3.0"
    }

    object Ktor {
        val version = "1.1.2"
        val clientCommon = "io.ktor:ktor-client-core:$version"
        val clientAndroid = "io.ktor:ktor-client-okhttp:$version"
        val clientIos = "io.ktor:ktor-client-ios:$version"
        val jsonCommon = "io.ktor:ktor-client-json:$version"
        val jsonJvm = "io.ktor:ktor-client-json-jvm:$version"
        val jsonNative = "io.ktor:ktor-client-json-native:$version"
    }

    object Squareup {
        object OkHttp {
            val version = "3.11.0"
            val client = "com.squareup.okhttp3:okhttp:$version"
            val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
            val okio = "com.squareup.okio:okio:1.14.0"
        }

        object LeakCanary {
            val version = "1.6.3"
            val leakCanary = "com.squareup.leakcanary:leakcanary-android:$version"
            val leakCanaryNoOp = "com.squareup.leakcanary:leakcanary-android-no-op:$version"
            val leakCanaryFragment = "com.squareup.leakcanary:leakcanary-support-fragment:$version"
        }

        object Picasso {
            val picasso = "com.squareup.picasso:picasso:2.71828"
            val picassoTransformation = "jp.wasabeef:picasso-transformations:2.2.1"
        }

        object Retrofit {
            val retrofit = "com.squareup.retrofit2:retrofit:2.6.0"
            val converterGson = "com.squareup.retrofit2:converter-gson:2.6.0"
            val rxjava2 = "com.squareup.retrofit2:adapter-rxjava2:2.6.0"
            val mock = "com.squareup.retrofit2:retrofit-mock:2.4.0"
        }
    }

    val liveDataKtx = "com.shopify:livedata-ktx:2.0.1"


    object Stetho {
        val stetho = "com.facebook.stetho:stetho:1.5.0"
    }

    object Hyperion {
        val version = "0.9.25"
        val hyperionPlugins = listOf(
                "com.willowtreeapps.hyperion:hyperion-core:$version",
                "com.willowtreeapps.hyperion:hyperion-attr:$version",
                "com.willowtreeapps.hyperion:hyperion-measurement:$version",
                "com.willowtreeapps.hyperion:hyperion-disk:$version",
                "com.willowtreeapps.hyperion:hyperion-recorder:$version",
                "com.willowtreeapps.hyperion:hyperion-phoenix:$version",
                "com.willowtreeapps.hyperion:hyperion-crash:$version",
                "com.willowtreeapps.hyperion:hyperion-shared-preferences:$version",
                "com.willowtreeapps.hyperion:hyperion-geiger-counter:$version",
                "com.willowtreeapps.hyperion:hyperion-build-config:$version"
        )
    }

    object Glide {
        val glide = "com.github.bumptech.glide:glide:4.10.0"
        val okhttp3Intergration = "com.github.bumptech.glide:okhttp3-integration:4.10.0@aar"
        val compiler = "com.github.bumptech.glide:compiler:4.10.0"
    }

    object Groupie {
        val version = "2.7.0"
        val groupie = "com.xwray:groupie:$version"
        val databinding = "com.xwray:groupie-databinding:$version"
        val kotlinExtensions = "com.xwray:groupie-kotlin-android-extensions:$version"
    }

    object Klock {
        val version = "1.1.0-eap-100"
        val common = "com.soywiz:klock:$version"
        val jvm = "com.soywiz:klock-jvm:$version"
    }

    object MockK {
        val jvm = "io.mockk:mockk:1.9"
        val common = "io.mockk:mockk-common:1.9"
    }

    object InjectedVmProvider {
        val version = 2.0
        val injectedVmProvider = "me.tatarka.injectedvmprovider:injectedvmprovider:$version"
        val extension = "me.tatarka.injectedvmprovider:injectedvmprovider-extensions:$version"
        val ktx = "me.tatarka.injectedvmprovider:injectedvmprovider-ktx:$version"
    }


    object Jakewharton {
        object Timber {
            val common = "com.jakewharton.timber:timber:4.7.1"
        }

        object ViewPagerIndicator {
            val common = "com.github.JakeWharton:ViewPagerIndicator:2.4.1"
        }
    }


    object PhotoView {
        val photoview = "com.github.chrisbanes:PhotoView:2.3.0"
    }

    object RxJava {
        val rxandroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
        val rxkotlin = "io.reactivex.rxjava2:rxkotlin:2.4.0"
    }

    object Ted {
        object Permission {
            val permission = "gun0912.ted:tedpermission-rx2:2.2.2"
        }
    }


}
