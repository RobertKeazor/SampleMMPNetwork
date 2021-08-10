package com.robertkeazor.samplenetworkingproject

import platform.UIKit.UIDevice

actual class Platform actual constructor() {
    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
    actual val baseUrl: String
        get() = "http://0.0.0.0"
}