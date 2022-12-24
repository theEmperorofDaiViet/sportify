<%-- 
    Document   : header
    Created on : Nov 30, 2022, 6:05:41 PM
    Author     : Admin
--%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sportify</title>
        <link rel="shortcut icon" href="<c:url value='/images/favicon.png'/>">
        <link rel="stylesheet" href="<c:url value='/styles/main.css'/>">
        <script src="https://github.com/aFarkas/html5shiv/blob/master/src/html5shiv.js"></script>
    </head>
    <body>
        <header>
            <img src="<c:url value='/images/logo.png'/>"
                 alt="Sportify Logo" width="58">
            <h1>Sportify</h1>
            <h2>The Best Football Songs!</h2>
        </header> 
                 
        <nav id="nav_bar">
            <ul>
                <li><a href="<c:url value='/admin'/>">Admin</a></li>
                <li><a href="<c:url value='/user/deleteCookies'/>">Delete Cookies</a></li>
                <li><a href="<c:url value='/order/showCart'/>">Show Cart</a></li>
            </ul>
        </nav>
        
