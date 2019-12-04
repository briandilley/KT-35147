
#include "jni.h"

/**
 * Class:     com_kotlinbug_NativeObject
 * Method:    getNativeGetterProperty
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_kotlinbug_NativeObject_getNativeProperty
  (JNIEnv* env, jobject obj) {
  return 420;
}

/**
 * Class:     com_kotlinbug_NativeObject
 * Method:    nativeMethod
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_kotlinbug_NativeObject_nativeMethod
  (JNIEnv* env, jobject obj) {
  return 69;
}
