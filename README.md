# Algorithm
![GitHub repo size](https://img.shields.io/github/repo-size/lendkhoa/algorithm) ![GitHub last commit](https://img.shields.io/github/last-commit/lendkhoa/algorithm)

## Run coverage report
> mvn clean jacoco:prepare-agent install jacoco:report

Report will be generated in target/site/jacoco

## Compile and run
> mvn clean install: 

Build, run test and create jar under target/
> mvn exec:java -Dexec.mainClass="algorithm.App"
## Run specific test
> mvn test -Dtest=DesignRulesTest

## Example calling children problems

```java
// In App.java

// System.out.println("Deque example");
// System.out.println(OtherArrayProblems.nonDecreasingArray(new int[]{4,2,3}));
// System.out.println(OtherArrayProblems.nonDecreasingArray(new int[]{4,2,1}));

// ReverseWords agent = new ReverseWords();
// System.out.println(agent.reverse("null statement"));
// runGuideToCompetitiveProgramming();
```
