#!/usr/bin/env bash
./gradlew clean
./gradlew assembleRelease
./gradlew cleanTest test