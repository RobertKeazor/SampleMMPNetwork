package com.robertkeazor.samplenetworkingproject

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}