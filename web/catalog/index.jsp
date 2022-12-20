<%-- 
    Document   : index
    Created on : Dec 20, 2022, 5:46:14 PM
    Author     : Admin
--%>

<jsp:include page="/includes/header.jsp" />
<jsp:include page="/includes/column_left_catalog.jsp" />

<!-- start the middle column -->

<!-- If necessary, this page could be generated from the database. -->

<section>
    <h1>The Sportify Catalog</h1>

    <h2>UEFA EURO</h2>
    <p><a href="product/8601">UEFA EURO 2020</a></p>

    <h2 class="top_margin">FIFA World Cup</h2>
    <p><a href="product/FWC10">FIFA World Cup South Africa 2010 (Official Soundtrack)</a></p>
    <p><a href="product/FWC14">FIFA World Cup Brazil 2014 (Official Soundtrack)</a></p>
    <p><a href="product/FWC18">FIFA World Cup Russia 2018 (Official Soundtrack)</a></p>
    <p><a href="product/FWC22">FIFA World Cup Qatar 2022 (Official Soundtrack)</a></p>
    
</section>

<!-- end the middle column -->

<jsp:include page="/includes/column_right_news.jsp" flush="true" />
<jsp:include page="/includes/footer.jsp" />