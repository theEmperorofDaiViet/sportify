CREATE DATABASE if not exists sportify;

USE sportify;

CREATE TABLE if not exists UserPass (
  Username varchar(15) NOT NULL PRIMARY KEY,
  Password varchar(15) NOT NULL
);
  
INSERT INTO UserPass VALUES ('holo', 'thewisewolf'),
                            ('khietto', '05012001'),
                            ('yoko', 'littner');
                            
CREATE TABLE if not exists UserRole (   
  Username VARCHAR(15) NOT NULL,
  Rolename VARCHAR(15) NOT NULL,

  PRIMARY KEY (Username, Rolename)
);
  
INSERT INTO UserRole VALUES ('holo', 'service'),
                            ('holo', 'programmer'),
                            ('khietto', 'programmer');
                            
/************************************************************

************************************************************/

CREATE DATABASE if not exists sportifymusic;
  
USE sportifymusic;
  
CREATE TABLE User (
    UserID INT NOT NULL AUTO_INCREMENT,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(50),
    CompanyName VARCHAR(50),
    Address1 VARCHAR(50),
    Address2 VARCHAR(50),
    City VARCHAR(50),
    State VARCHAR(50),
    Zip VARCHAR(50),
    Country VARCHAR(50),
    CreditCardType VARCHAR(50),
    CreditCardNumber VARCHAR(50),
    CreditCardExpirationDate VARCHAR(50),
  
    PRIMARY KEY (UserID)
);

CREATE TABLE Invoice(
    InvoiceID INT NOT NULL AUTO_INCREMENT,
    UserID INT NOT NULL,
    InvoiceDate DATETIME NOT NULL DEFAULT '1900-01-01 00:00:00',
    TotalAmount FLOAT NOT NULL DEFAULT '0',
    IsProcessed enum('y','n') DEFAULT NULL,
  
    PRIMARY KEY (InvoiceID),
    FOREIGN KEY (UserID) REFERENCES User (UserID)
);

CREATE TABLE LineItem(
    LineItemID INT NOT NULL AUTO_INCREMENT,
    InvoiceID INT NOT NULL DEFAULT '0',
    ProductID INT NOT NULL DEFAULT '0',
    Quantity INT NOT NULL DEFAULT '0',
  
    PRIMARY KEY (LineItemID),
    FOREIGN KEY (InvoiceID) REFERENCES Invoice (InvoiceID)
);
  
CREATE TABLE Product(
    ProductID INT NOT NULL AUTO_INCREMENT,
    ProductCode VARCHAR(10) NOT NULL DEFAULT '',
    ProductDescription VARCHAR(100) NOT NULL DEFAULT '',
    ProductPrice DECIMAL(7,2) NOT NULL DEFAULT '0.00',
  
    PRIMARY KEY (ProductID)
);

INSERT INTO Product VALUES 
  ('1', 'FWC10', 'FIFA World Cup South Africa 2010 (Official Soundtrack)', '14.95'),
  ('2', 'FWC14', 'FIFA World Cup Brazil 2014 (Official Soundtrack)', '12.95'),
  ('3', 'FWC18', 'FIFA World Cup Russia 2018 (Official Soundtrack)', '14.95'),
  ('4', 'FWC22', 'FIFA World Cup Qatar 2022 (Official Soundtrack)', '14.95');
  
CREATE TABLE Download (
    DownloadID INT NOT NULL AUTO_INCREMENT,
    UserID INT NOT NULL,
    DownloadDate DATETIME NOT NULL,
    ProductCode VARCHAR(10)  NOT NULL,
  
    PRIMARY KEY (DownloadID), 
    FOREIGN KEY (UserID) REFERENCES User (UserID)
);