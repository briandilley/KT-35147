#!/bin/sh -e

cd src/main/jni

GENERATION_DIR="cmake-build-release"

if [ ! -e "$GENERATION_DIR" ];
then
  mkdir $GENERATION_DIR && \
    cd $GENERATION_DIR && \
    cmake -DCMAKE_BUILD_TYPE=Release .. && \
    cd ..
fi

cmake --build $GENERATION_DIR --target all -- -j 8
