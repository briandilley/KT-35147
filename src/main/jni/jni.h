#include <jni.h>
#ifndef _Included_com_kotlinbug_NativeObject
#define _Included_com_kotlinbug_NativeObject
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_kotlinbug_NativeObject
 * Method:    getNativeProperty
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_kotlinbug_NativeObject_getNativeProperty
  (JNIEnv *, jobject);

/*
 * Class:     com_kotlinbug_NativeObject
 * Method:    nativeMethod
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_kotlinbug_NativeObject_nativeMethod
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
