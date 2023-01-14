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

> :pushpin: **If you are using JPA Version**: You also need to add a JPA library to the project: Right-click on the project's Libraries folder, select the Add Library command, and select the EclipseLink library in the resulting dialog box.

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
- Work with database by JPA (and JDBC - in the previous version)

## 2. End Users:
- Verify the user by cookies:
  - If the user has already registered, he/she can listen and download songs, place an order for physical albums.
  - Otherwise, the application forward to a register page, but different from the one in home page: if the user enter an existing email address, the application consider it as an update to the existing one, and use it as the user of the current session - instead of forcing the user to enter a different email address.
- Listen & download songs (if the user has already registered)
- Cart: add an item to cart, change its quantity, remove it.
- Order (if the user has already registered): verify order information, pay by credit card and submit the order.

## 3. Administrators:
- Restrict access to all URLs in the admin directory. User must specify a valid username and password (I provided 3 admin accounts in the script.sql file).
- Process Invoices: view a list of unprocessed invoices, view the details of any unprocessed invoice and process the invoice.
- Display Reports: 2 types of report:
  - User Email Report: the application downloads an .xls file for the report. You can open that file using Microsoft Excel.
  - Downloads Report: the application displays the parameters page. This page lets the user enter a start date and end date for the report. Once the user enters those dates and clicks the Continue button, the application downloads an .xls file for the report.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

# Usage
<i>Here are examples to illustrate the features of this application:</i>

## 1. End Users:
<i>This is an example for end users:</i>

<p align="center">
    <img src="/web/images/animation-1.gif">
</p>

### Browse products; listen, download songs; add items to cart and place an order:
- First, from the home page, the user clicks "Browse Catalog" to browse products.
- The user chooses an album, clicks the "Play" button to see the album's tracks list.
- Because the user hasn't registered, the application displays an register page. The user enters email address, first name and last name to register.
- Now, the tracks list is displayed. The user clicks on a track's name to play or download the tracks, if he/she wants.
- Then, the user clicks the "Add to Cart" button to add the album to cart.
- The cart page is displayed, the user clicks the "Continue Shopping" button to browse for more products.
- The user chooses another album, add it to cart.
- The application displays the cart page again. The user updates quantity of the first album from "1" to "2".
- The user clicks the "Checkout" button to finish shopping and make an order of the albums in cart.
- The invoice page is displayed, shows the user order information. The user confirms the information by clicking "Continue".
- The application displays the credit card page to ask the user to enter credit card information for payment.
- The user provides information and clicks "Submit Order".
- Finally, the application displays a notification that the order is submitted and expresses gratitude to the user.

### Register (Join Email List):
- First, from the home page, the user clicks "Join Email List" to register.
- The register page is displayed. The user enters email address, first name and last name to register.
- But that email address already exists. The application notifies the user and asks he/she to provide another one.
- The user provides suitable information and clicks "Join Now".
- Finally, the application displays a notification that the user joined successfully and expresses gratitude to the user.

### Delete Cookies:
- First, from the home page, the user clicks the Delete Cookies link in the navigation bar.
- The application displays a notification that all cookies have been removed.
- The user closes the browser and then runs the application again.
- Now, to listen, download songs and place an order, the user needs to register again!

## 2. Administrators:
<i>This is an example for administrators:</i>

<p align="center">
    <img src="/web/images/animation-2.gif">
</p>

### Log in:
- First, from the home page, the admin clicks the Admin link in the navigation bar.
- The admin login page is displayed. The admin enters a valid username and password, then clicks "Log in".
- Finally, the application displays the admin menu page. From this page, the "Process Invoices" button leads to the Process Invoices application, and the "Display Reports" button leads to the Report application.

### Process Invoices:
- First, from the admin menu page, the admin clicks the "Process Invoices" button.
- The invoices page is displayed. From this page, the admin can view a list of unprocessed invoices.
- Then, to view the details of any unprocessed invoice, the admin clicks the link for the invoice to display its invoice page.
- After seeing the details of that invoice, the admin determines that the invoice is valid. He/she processes the invoice by clicking the "Process Invoice" button.
- Finally, the application processes the invoice and returns to the invoices page. Once the application processes an invoice, it doesn't display it on this page anymore.

### Display Reports:
- First, from the admin menu page, the admin clicks the "Display Reports" button.
- The application displays the reports page, showing a list of available reports: there are 2 types of report:
  - User Email Report: If the admin selects this report, the application downloads an .xls file named "userEmail.xls" for the report. The browser shows a button to open that file. In this example, the file is opened by Microsoft Excel.
  - Downloads Report: If the admin selects this report, the application displays the parameters page. This page lets the admin enter a start date and end date for the report. Once the admin enters those dates and clicks the "Continue" button, the application downloads an .xls file named "downloadDetail.xls" for the report. Again, this allows the admin to open and view the report by any spreadsheet application, including Microsoft Excel.

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