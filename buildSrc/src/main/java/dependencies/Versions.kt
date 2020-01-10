package dependencies

object Versions {
    val androidCompileSdkVersion: Int = 29
    val androidTargetSdkVersion: Int = 29
    val androidMinSdkVersion: Int = 21

    private val versionMajor: Int = 1
    private val versionMinor: Int = 0
    private val versionPatch: Int = 5
    private val versionOffset: Int = 0
    val androidVersionCode =
            (versionMajor * 10000 + versionMinor * 100 + versionPatch) * 100 + versionOffset

    val androidVersionName = "$versionMajor.$versionMinor.$versionPatch"
}
