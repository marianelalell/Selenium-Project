Selenium Project for intive-FDV

This project contains the exercise automation solution for http://exercises.fdvs.com.ar/semisenior.html page.


Getting Started


Prerequisites

Environment specifications
- Windows 10 environment x64
- Google Chrome v62.0
- IntelliJ IDEA Community 2018.1 (get it from https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC)
- jdk-8u161 (get it from http://www.oracle.com/technetwork/es/java/javase/downloads/jdk8-downloads-2133151.html)
- selenium-java-3.11.0 (get it from https://www.seleniumhq.org/download/)
- chromewebdriver_win32 (get it from http://chromedriver.storage.googleapis.com/index.html?path=2.36/)


Installing

Install IntelliJ IDEA
Create a new project
- From Project Structure import Dependencies: chromewebdriver and selenium java
Import Selenium Project project


Running the tests

Expand src folder
Expand test package
Right click on "Exercise Test" class
Run 

Automated tests will run and leave chrome page open for you to look at tests results. 


Into the code

On ExercisePage.java class you'll find methods that calculate values you'll need to test as required on exercise steps.
On ExerciseTest.java class you'll find web driver initialization and the automated tests.



Versioning

No versioning implemented. 


Authors

Marianela Lell
