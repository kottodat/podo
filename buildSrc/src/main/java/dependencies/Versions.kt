package dependencies

object Versions {
    const val androidCompileSdkVersion: Int = 29
    const val androidTargetSdkVersion: Int = 29
    const val androidMinSdkVersion: Int = 21

    private const val versionMajor: Int = 1
    private const val versionMinor: Int = 0
    private const val versionPatch: Int = 5
    private const val versionOffset: Int = 0
    const val androidVersionCode =
            (versionMajor * 10000 + versionMinor * 100 + versionPatch) * 100 + versionOffset

    const val androidVersionName = "$versionMajor.$versionMinor.$versionPatch"
}
