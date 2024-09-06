#!/bin/bash

# Check if target folder is passed as an argument
if [ -z "$1" ]; then
    echo "No target folder specified. Usage: ./build.sh <target-folder>"
    exit 1
fi

TARGET_FOLDER=$1

# Define the base directory for tests
BASE_DIR="src/test/java/SmokeTests"

# Construct the full path to the target directory
FULL_PATH="$BASE_DIR/$TARGET_FOLDER"

# Check if the target folder exists
if [ ! -d "$FULL_PATH" ]; then
    echo "Target folder '$FULL_PATH' does not exist."
    exit 1
fi

# Define the test runner file
TEST_RUNNER="$FULL_PATH/TestSmokeSuiteRunner"

# Check if the test runner file exists
if [ ! -f "$TEST_RUNNER.java" ]; then
    echo "Test runner file '$TEST_RUNNER.java' does not exist."
    exit 1
fi

# Run Maven command to execute the specific test runner file
mvn -Dtest="${TARGET_FOLDER}.TestSmokeSuiteRunner" test

# Exit with the status of the Maven command
exit $?
