#!/bin/bash
javac $1.java
jar cfe $2 $1 Manifest.txt *.class