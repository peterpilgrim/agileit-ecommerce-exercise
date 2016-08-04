#!/bin/bash
# Pack up the source distribution

DistDir=target/distribution
JarFile=agile-ecommerce-exercise-src.zip
mkdir -p ${DistDir}
jar cvf ${DistDir}/${JarFile}  .git .gitignore *.sh *.txt *md *.sbt  src
# End.
