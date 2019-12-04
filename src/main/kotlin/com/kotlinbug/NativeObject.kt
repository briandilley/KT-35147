package com.kotlinbug

import com.shankyank.jniloader.JNILoader

class NativeObject {

    companion object {
        init {
            val loader = JNILoader()
            loader.extractLibs("/native/lib", "libs")
            System.loadLibrary("kotlinbug")
        }

    }

    external fun nativeMethod(): Int

    val nativeProperty: Int
        external get

    val nonNativeProperty: Int
        get() = this.nativeProperty

    val nonNativePropertyAccessingMethod: Int
        get() = this.nativeMethod()

}