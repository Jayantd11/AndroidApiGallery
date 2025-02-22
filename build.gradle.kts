// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.5.2" apply false
    id("com.android.library") version "8.5.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id ("org.jetbrains.kotlin.kapt") version "1.6.10" apply false
    id ("androidx.navigation.safeargs.kotlin") version "2.8.4" apply false

}
buildscript {
    dependencies {
        classpath("com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:1.9.10-1.0.13")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.8.4")
        classpath("com.android.tools.build:gradle:8.5.2")
    }
}
