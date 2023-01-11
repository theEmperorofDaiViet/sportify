<a name="readme-top"></a>
<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#key-features">Key Features</li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

<p align="center">
    <img src="/web/images/logo.png" width="128" height="128">
</p>

# About The Project
A simple music store website project to celebrate the FIFA World Cup Qatar 2022™, inspired by the book "Murach's Java Servlets & JSP".

## Built With
* [![Java][Java-shield]][Java-url]:&nbsp;<font size=4>Servlet & JSP</font>
* [![Apache Ant][Apache Ant-shield]][Apache Ant-url]
* [![Apache Tomcat][Apache Tomcat-shield]][Apache Tomcat-url]
* [![HTML5][HTML5-shield]][HTML5-url]
* [![CSS3][CSS3-shield]][CSS3-url]
* [![MySQL][MySQL-shield]][MySQL-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# Getting Started

## Prerequisites
Before cloning and using this application, you'll need to install these things on your computer:
* [Java SE Development Kit 17](https://www.oracle.com/java/technologies/downloads/#java17): Of course you need to have Java installed to run a Java application. I used Java 17, but I think it works fine with the widely-used Java 8 (JDK 1.8), as well.
* [Apache NetBeans](https://netbeans.apache.org/): a free, open source, integrated development environment (IDE) that enables you to develop desktop, mobile and web applications. The IDE supports application development in various languages, including Java, HTML5, PHP and C++. The IDE provides integrated support for the complete development cycle, from project creation through debugging, profiling and deployment. The IDE runs on Windows, Linux, Mac OS X, and other UNIX-based systems.
* [Apache Tomcat 8.5](https://tomcat.apache.org/): an open-source Java servlet container that implements many Java Enterprise Specs such as the Websites API, Java-Server Pages and last but not least, the Java Servlet.
* [MySQL 8.0](https://dev.mysql.com/downloads/installer/): an open source relational database management system that was originally released in 1995. MySQL is popular among all databases, and is ranked as the 2nd most popular database, only slightly trailing Oracle Database. Among open source databases, MySQL is the most popular database in use today and known as one of the most reliable and performative databases out there.

## Installation
You can install this application by cloning this repository into your current working directory:
```sh
git clone https://github.com/theEmperorofDaiViet/sportify.git
```
After cloning the repository, you can open the project by NetBeans.

Add necessary libraries to the project by right-clicking on the Libraries folder, select the Add JAR/Folder command, and navigate to [/web/lib](/web/lib), then select all jar files inside it. I stored all the libraries needed for the project in this folder.

Open the context.xml file in [/web/META-INF](/web/META-INF) to change the information about the datasource to fit your own settings.

Open MySQL and create two databases according to the script in script.sql file in [/](/).

Back to NetBeans and run the application. If this is the first time you use Tomcat, NetBeans may display a dialog asking you to choose a web server for the application. Click "Add" and refer to the directory where Tomcat installed.

Finally, if NetBeans asks for Tomcat authentication, open the tomcat-users.xml file in the [/conf](/) folder under the Tomcat directory to see the username and password. You can change them if you want.

After that, the application will run on port 8080 by default. A new tab in your browser will be opened automatically, showing the home page of the application, or at least I hope so...

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# Key Features

## 1. Overview
- Browse products and view the details of any product
- Listen, download songs
- Add to cart and order for the whole (physical) album
- Register (Join Email List) by entering a name and email address
- Delete Cookies: click the Delete Cookies link in the navigation bar, close the browser, and run the application again
- Work with database by JDBC

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# Usage

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# Contact

You can contact me via:
* [![GitHub][GitHub-shield]][GitHub-url]
* [![LinkedIn][LinkedIn-shield]][LinkedIn-url]
* ![Gmail][Gmail-shield]:&nbsp;<i>Khiet.To.05012001@gmail.com</i>
* [![Facebook][Facebook-shield]][Facebook-url]
* [![Twitter][Twitter-shield]][Twitter-url]

<br/>
<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- Tech stack -->
[Java-shield]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white
[Java-url]: https://www.java.com/
[Apache Ant-shield]: https://img.shields.io/badge/Apache%20Ant-A81C7D?style=for-the-badge&logo=Apache%20Ant&logoColor=white
[Apache Ant-url]: https://ant.apache.org/
[Apache Tomcat-shield]: https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black
[Apache Tomcat-url]: https://tomcat.apache.org/
[HTML5-shield]: https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white
[HTML5-url]: https://www.w3.org/html/
[CSS3-shield]: https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white
[CSS3-url]: https://www.w3.org/Style/CSS/
[MySQL-shield]: https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white
[MySQL-url]: https://www.mysql.com/
<!-- Contact -->
[GitHub-shield]: https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white
[GitHub-url]: https://github.com/theEmperorofDaiViet
[LinkedIn-shield]: https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white
[LinkedIn-url]: https://www.linkedin.com/in/khiet-to/
[Gmail-shield]: https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white
[Facebook-shield]: https://img.shields.io/badge/Facebook-%231877F2.svg?style=for-the-badge&logo=Facebook&logoColor=white
[Facebook-url]: https://www.facebook.com/Khiet.To.Official/
[Twitter-shield]: https://img.shields.io/badge/Twitter-%231DA1F2.svg?style=for-the-badge&logo=Twitter&logoColor=white
[Twitter-url]: https://twitter.com/KhietTo