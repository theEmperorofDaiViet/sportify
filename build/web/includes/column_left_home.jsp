<%-- 
    Document   : column_left_home
    Created on : Dec 15, 2022, 11:39:58 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<aside id="sidebarA">
    <nav>
        <ul>
            <li><a class="current" href="<c:url value='/' />">
                    Home</a></li>
            <li><a href="<c:url value='/catalog' />">
                    Browse Catalog</a></li>
            <li><a href="<c:url value='/email' />">
                    Join Email List</a></li>
            <li><a href="<c:url value='/customer_service' />">
                    Customer Service</a></li>                          
        </ul>
    </nav>
</aside>
