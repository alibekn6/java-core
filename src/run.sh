#!/bin/bash

rm -rf *.class out/
find . -name "*.java" | xargs javac -d .
java Main

