# Algorithm
![GitHub repo size](https://img.shields.io/github/repo-size/lendkhoa/algorithm) ![GitHub last commit](https://img.shields.io/github/last-commit/lendkhoa/algorithm)

## Run coverage report
> mvn clean jacoco:prepare-agent install jacoco:report

Report will be generated in target/site/jacoco

## Compile and run
> mvn clean install: 

Build, run test and create jar under target/
> mvn exec:java -Dexec.mainClass="algorithm.App"
