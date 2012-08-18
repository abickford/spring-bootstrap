Spring Framework MVC Bootstrap Project
======================================

Introduction
------------
For those wanting to rapidly start a new Spring Framework MVC web application this project can help. The code contained here, when run in a web container such as Apache Tomcat 7, will start a new web context and initialize an @Controller which forwards to a JSP view that renders "Hello World" in your browser.

Prerequisites
-------------
1. Oracle JDK 1.6 or greater
2. Apache Maven 3.x

Usage
-----
Clone this repository and run 'mvn tomcat7:run' in the project directory. This will start an embedded Tomcat 7 instance and initialize the web application. Access it in your browser at http://localhost/springbootstrap/hello/world.
