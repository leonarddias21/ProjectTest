#Requirements
Install/Update Chrome to Version 84
JDK 8
Apache Maven

#Steps to Run
>Checkout the repo
>cd <project>
>mvn clean test


#IDE Setup
Install Eclipse for Java Developers latest version
-Install Testng plugin for Eclipse
Help->Install New Software-> Add -> Name:TestNg, Location: https://dl.bintray.com/testng-team/testng-eclipse-release/
Select TestNg and Install
-Import Project
File->Import->Maven->Existing Maven Projects (point to root project dir)
To Run -> Right Click on src/test/resources/TestSuites/<Any Test Suite> -> Run as -> TestNg Suite

mvn clean test -DsuiteXmlFile=DahsoardTestSuite.xml