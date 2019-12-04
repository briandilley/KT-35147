# KT-35147 Sample project

Project displaying Kotlin bug [KT-35147](https://youtrack.jetbrains.com/issue/KT-35147)

The native code is in `src/main/jni` and requires CMake to build it.  You can build the native code independently of
the Kotlin code by running `./build-native.sh`, but you shouldn't need to as the `build.gradle` is configured to run
that as part of the regular Kotlin compilation.  You should be able to just run `./gradlew test` and it'll do everything
including build the native code.
