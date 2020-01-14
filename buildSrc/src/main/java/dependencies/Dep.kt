package dependencies

@Suppress("unused")
object Dep {
    object GradlePlugin {
        const val android = "com.android.tools.build:gradle:3.4.1"
        const val r8 = "com.android.tools:r8:1.3.52"  // proguard를 대체하는 코드 축소 및 난독화
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
        const val playServices = "com.google.gms:google-services:4.3.3"
        // aar, jar로 배포되는 라이브러리 내의 바이트 코드를 빌드 타임에 andoroidx에 대응되도록 변환
        const val jetifier = "com.android.tools.build.jetifier:jetifier-processor:1.0.0-beta02"
        // 오픈소스 공지 플러그인 https://developers.google.com/android/guides/opensource
        const val licensesPlugin = "com.google.android.gms:oss-licenses-plugin:0.9.4"
        //        const val crashlytics = "io.fabric.tools:gradle:1.28.0"
        // 빌드 배포시 아이콘을 꾸며주는 플러그인 https://github.com/akaita/easylauncher-gradle-plugin
        const val iconRibbonPlugin = "com.akaita.android:easylauncher:1.3.1"
    }

    object Test {
        const val junit = "junit:junit:4.12"
        const val testRunner = "androidx.test:runner:1.1.1"
        const val androidJunit4 = "androidx.test.ext.junit:1.1.1"
        const val archCore = "androidx.arch.core:core-testing:2.0.0"
        const val espressoCore = "androidx.test.espresso:espresso-core:3.1.0-alpha3"
        const val kotlinTestAssertions = "io.kotlintest:kotlintest-assertions:3.1.10"
        const val testingKtx =
            "android.arch.navigation:navigation-testing-ktx:${AndroidX.Navigation.version}"

        object KotlinMultiPlatform {
            const val jvmModuleTest = "org.jetbrains.kotlin:kotlin-test"
            const val jvmModuleTestJunit = "org.jetbrains.kotlin:kotlin-test-junit"
            const val commonModuleTest = "org.jetbrains.kotlin:kotlin-test-common"
            const val commonModuleTestAnnotations = "org.jetbrains.kotlin:kotlin-test-annotations-common"
        }

        const val slf4j = "org.slf4j:slf4j-simple:1.7.25"
    }

    object AndroidX {
        const val jetifier = "com.android.tools.build.jetifier:jetifier-core:1.0.0-beta08"
        const val appCompat = "androidx.appcompat:appcompat:1.1.0"
        const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
        const val constraint = "androidx.constraintlayout:constraintlayout:1.1.3"
        const val emoji = "androidx.emoji:emoji-appcompat:1.0.0"
        const val design = "com.google.android.material:material:1.1.0-alpha02"
        const val coreKtx = "androidx.core:core-ktx:1.1.0"
        const val preference = "androidx.preference:preference:1.1.0"
        const val browser = "androidx.browser:browser:1.2.0"
        const val fragment = "androidx.fragment:fragment:1.1.0"
        const val legacy = "androidx.legacy:legacy-support-v4:1.0.0"

        //        const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:2.1.0"
//        const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata:2.1.0"
        object LifeCycle {
            const val version = "2.1.0"
            const val runtime = "androidx.lifecycle:lifecycle-runtime:$version"
            const val java8 = "androidx.lifecycle:lifecycle-common-java8:$version"
            const val compiler = "androidx.lifecycle:lifecycle-compiler:$version"
            const val viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val reactivestreams = "androidx.lifecycle:lifecycle-reactivestreams:$version"
        }

        object Room {
            const val version = "2.2.1"
            const val compiler = "androidx.room:room-compiler:$version"
            const val runtime = "androidx.room:room-runtime:$version"
            const val coroutine = "androidx.room:room-coroutines:$version"
            const val ktx = "androidx.room:room-ktx:$version"
        }

        object Navigation {
            const val version = "2.1.0"
//            const val runtime = "android.arch.navigation:navigation-runtime:$version"
//            const val runtimeKtx = "android.arch.navigation:navigation-runtime-ktx:$version"

            const val fragment = "androidx.navigation:navigation-fragment:$version"
            const val ui = "androidx.navigation:navigation-ui:$version"

            const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
        }

        object Work {
            const val version = "2.2.0"
            const val runtime = "androidx.work:work-runtime:$version"
            const val runtimeKtx = "androidx.work:work-runtime-ktx:$version"
            const val runtimeRxJava2 = "androidx.work:work-rxjava2:$version"
            const val gcm = "androidx.work:work-gcm:$version"
            const val testing = "androidx.work:work-testing:$version" // androidTestImplementation
        }
    }

    object Kotlin {
        const val version = "1.3.60"
        const val stdlibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:$version"
        const val stdlibJvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val coroutinesVersion = "1.1.1"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
        const val androidCoroutinesDispatcher =
                "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
        const val coroutinesReactive =
                "org.jetbrains.kotlinx:kotlinx-coroutines-reactive:$coroutinesVersion"
        const val coroutinesPlayServices =
                "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:$coroutinesVersion"
        const val serializationCommon = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.10.0"
        const val serializationIos = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:0.10.0"
        const val anko = "org.jetbrains.anko:anko-commons:0.10.8"
    }

    object Firebase {
        const val core = "com.google.firebase:firebase-core:17.2.1"
        const val config = "com.google.firebase:firebase-config:19.0.3"
        const val fireStore = "com.google.firebase:firebase-firestore:21.3.0"
        const val database = "com.google.firebase:firebase-database:19.1.0"
        const val auth = "com.google.firebase:firebase-auth:16.0.5"
        const val crashlytics = "com.crashlytics.sdk.android:crashlytics:2.9.8"
        const val messaging = "com.google.firebase:firebase-messaging:17.3.3"
        const val analytics = "com.google.firebase:firebase-analytics:17.2.1"
    }

    object PlayServices {
        const val auth = "com.google.android.gms:play-services-auth:16.0.1"
        const val licensesPlugin = "com.google.android.gms:play-services-oss-licenses:16.0.1"
    }

    object Dagger {
        const val version = "2.20"
        const val core = "com.google.dagger:dagger:$version"
        const val compiler = "com.google.dagger:dagger-compiler:$version"
        const val androidSupport = "com.google.dagger:dagger-android-support:$version"
        const val android = "com.google.dagger:dagger-android:$version"
        const val androidProcessor = "com.google.dagger:dagger-android-processor:$version"
        const val assistedInjectAnnotations =
                "com.squareup.inject:assisted-inject-annotations-dagger2:0.3.0"
        const val assistedInjectProcessor = "com.squareup.inject:assisted-inject-processor-dagger2:0.3.0"
    }

    object Ktor {
        const val version = "1.1.2"
        const val clientCommon = "io.ktor:ktor-client-core:$version"
        const val clientAndroid = "io.ktor:ktor-client-okhttp:$version"
        const val clientIos = "io.ktor:ktor-client-ios:$version"
        const val jsonCommon = "io.ktor:ktor-client-json:$version"
        const val jsonJvm = "io.ktor:ktor-client-json-jvm:$version"
        const val jsonNative = "io.ktor:ktor-client-json-native:$version"
    }

    object Squareup {
        object OkHttp {
            const val version = "3.11.0"
            const val client = "com.squareup.okhttp3:okhttp:$version"
            const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
            const val okio = "com.squareup.okio:okio:1.14.0"
        }

        object LeakCanary {
            const val version = "1.6.3"
            const val leakCanary = "com.squareup.leakcanary:leakcanary-android:$version"
            const val leakCanaryNoOp = "com.squareup.leakcanary:leakcanary-android-no-op:$version"
            const val leakCanaryFragment = "com.squareup.leakcanary:leakcanary-support-fragment:$version"
        }

        object Picasso {
            const val picasso = "com.squareup.picasso:picasso:2.71828"
            const val picassoTransformation = "jp.wasabeef:picasso-transformations:2.2.1"
        }

        object Retrofit {
            const val retrofit = "com.squareup.retrofit2:retrofit:2.6.0"
            const val converterGson = "com.squareup.retrofit2:converter-gson:2.6.0"
            const val rxjava2 = "com.squareup.retrofit2:adapter-rxjava2:2.6.0"
            const val mock = "com.squareup.retrofit2:retrofit-mock:2.4.0"
        }
    }

    const val liveDataKtx = "com.shopify:livedata-ktx:2.0.1"


    object Stetho {
        const val stetho = "com.facebook.stetho:stetho:1.5.0"
    }

    object Hyperion {
        const val version = "0.9.25"
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
        const val glide = "com.github.bumptech.glide:glide:4.10.0"
        const val okhttp3Intergration = "com.github.bumptech.glide:okhttp3-integration:4.10.0@aar"
        const val compiler = "com.github.bumptech.glide:compiler:4.10.0"
    }

    object Groupie {
        const val version = "2.7.0"
        const val groupie = "com.xwray:groupie:$version"
        const val databinding = "com.xwray:groupie-databinding:$version"
        const val kotlinExtensions = "com.xwray:groupie-kotlin-android-extensions:$version"
    }

    object Klock {
        const val version = "1.1.0-eap-100"
        const val common = "com.soywiz:klock:$version"
        const val jvm = "com.soywiz:klock-jvm:$version"
    }

    object MockK {
        const val jvm = "io.mockk:mockk:1.9"
        const val common = "io.mockk:mockk-common:1.9"
    }

    object InjectedVmProvider {
        const val version = 2.0
        const val injectedVmProvider = "me.tatarka.injectedvmprovider:injectedvmprovider:$version"
        const val extension = "me.tatarka.injectedvmprovider:injectedvmprovider-extensions:$version"
        const val ktx = "me.tatarka.injectedvmprovider:injectedvmprovider-ktx:$version"
    }


    object Jakewharton {
        object Timber {
            const val common = "com.jakewharton.timber:timber:4.7.1"
        }

        object ViewPagerIndicator {
            const val common = "com.github.JakeWharton:ViewPagerIndicator:2.4.1"
        }
    }


    object PhotoView {
        const val photoview = "com.github.chrisbanes:PhotoView:2.3.0"
    }

    object RxJava {
        const val rxandroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
        const val rxkotlin = "io.reactivex.rxjava2:rxkotlin:2.4.0"
    }

    object Ted {
        object Permission {
            const val permission = "gun0912.ted:tedpermission-rx2:2.2.2"
        }
    }


}
