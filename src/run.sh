#!/bin/bash
find . -name "*.java" | xargs javac -d .
java Main
