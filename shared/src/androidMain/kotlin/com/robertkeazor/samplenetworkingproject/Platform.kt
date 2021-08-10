package com.robertkeazor.samplenetworkingproject

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
    actual val baseUrl: String
        get() = "http://10.0.2.2"
}