# Algorithm

## Run coverage report
> mvn clean jacoco:prepare-agent install jacoco:report

Report will be generated in target/site/jacoco

## Compile and run
> mvn clean install: 

Build, run test and create jar under target/
> mvn exec:java -Dexec.mainClass="algorithm.App"
