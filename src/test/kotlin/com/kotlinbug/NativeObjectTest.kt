package com.kotlinbug

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class NativeObjectTest {

    @Test
    fun `Ensure that the native property returns 420`() {
        val obj = NativeObject()
        assertEquals(420, obj.nativeProperty)
        assertEquals(420, obj.nativeProperty)
    }

    @Test
    fun `Ensure that the native method returns 69`() {
        val obj = NativeObject()
        assertEquals(69, obj.nativeMethod())
        assertEquals(69, obj.nativeMethod())
    }

    @Test
    fun `Ensure that the non-native property that delegates to the native property emulates the native property's behavior (exposing Bug KT-35147)`() {
        val obj = NativeObject()
        assertEquals(420, obj.nonNativeProperty)
        assertEquals(420, obj.nonNativeProperty)
    }

    @Test
    fun `Ensure that the non-native property that delegates to the native method emulates the native method's behavior`() {
        val obj = NativeObject()
        assertEquals(69, obj.nonNativePropertyAccessingMethod)
        assertEquals(69, obj.nonNativePropertyAccessingMethod)
    }

}