#!/usr/bin/env bash

# Define app name
APP_NAME=$1

./gradlew build

MINOR=$(git rev-list HEAD --count --first-parent)
VERSION=1.0.${MINOR:-1}

docker build . -t "goofyahead/${APP_NAME}:${VERSION}" -t "goofyahead/${APP_NAME}:develop"

docker push goofyahead/${APP_NAME}:${VERSION}
docker push goofyahead/${APP_NAME}:develop