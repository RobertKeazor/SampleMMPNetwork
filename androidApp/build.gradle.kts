plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation ("androidx.compose.ui:ui:1.0.1")
    // Tooling support (Previews, etc.)
    implementation ("androidx.compose.ui:ui-tooling:1.0.1")
    implementation ("androidx.compose.ui:ui-tooling-preview:1.0.1")
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation ("androidx.compose.foundation:foundation:1.0.1")
    // Material Design
    implementation ("androidx.compose.material:material:1.0.1")
    // Material design icons
    implementation ("androidx.compose.material:material-icons-core:1.0.1")
    implementation ("androidx.compose.material:material-icons-extended:1.0.1")
    // Integration with activities
    implementation ("androidx.activity:activity-compose:1.3.1")
    // Integration with ViewModels
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07")
    // Integration with observables
    implementation ("androidx.compose.runtime:runtime-livedata:1.0.1")
    implementation ("androidx.compose.runtime:runtime-rxjava2:1.0.1")
    implementation ("androidx.compose.compiler:compiler:1.0.1")

}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.robertkeazor.samplenetworkingproject.android"
        minSdkVersion(23)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.1"
        kotlinCompilerVersion =  "1.5.10"
    }
}