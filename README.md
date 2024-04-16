This project is used to validate the PwC Digital website.

####
Pre requisites for this project::

JDK(version 11 is preferrable)
Maven
IDE(Eclipse,Intellij)
Cucumber plugin should be installed in the project.
TestNG plugin should be installed in the project.

####
Steps to execute project::

Take a pull of the codebase from github.

Build the project to download thee maven dependencies for the project.

Execute the CucumberRunner.java file under src/test/java/runner file to execute the existing feature files.@Sanity and @Regression tags are used in the CucumberRunner.java file.

Check the test-output folder for the spark and html report.

**Note::Last execution report is attached in the test-output folder.


####
Notes:
1. We are using WebDriverManager 5.5.3 dependency for Chrome 116 version, but due to global protect security in our organisation the driver is not getting downloaded.
2. We are using Selenium 4.11.0 dependency, but due to global protect security in our organisation the driver is not getting downloaded.
3. Hence, we are using setProperty method to set the properties of chrome driver.
