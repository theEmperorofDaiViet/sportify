<%-- 
    Document   : column_right_buttons
    Created on : Dec 20, 2022, 6:34:31 PM
    Author     : Admin
--%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <aside id="sidebarB" style="width: 103px;">
        <form method="post" action="<c:url value='/order/addItem'/>">
            <input type="hidden" name="productCode" value="${product.code}">
            <input type="image" src="<c:url value='/images/addtocart.png'/>" 
                   width="50" alt="Add to Cart">
        </form>
        <a href="<c:url value='/catalog/product/${product.code}/listen' />">
            <img src="<c:url value='/images/play.png'/>" 
                 width="50" alt="Play" class="top_margin">
        </a>
    </aside>