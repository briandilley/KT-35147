project(kotlinbug C)
cmake_minimum_required(VERSION 3.13)
set(CMAKE_C_STANDARD 99)

find_package(PkgConfig REQUIRED)
find_package(JNI REQUIRED)

# configure our project
add_library(kotlinbug SHARED
        jni.h
        jni.c)

target_include_directories(kotlinbug PUBLIC
        ${JNI_INCLUDE_DIRS})
