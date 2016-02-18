<%--
  Created by IntelliJ IDEA.
  User: Shingo
  Date: 16/02/2016
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
    <title>Carousel Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <%--<link href="./css/bootstrap.min.css" rel="stylesheet">--%>
    <link type="text/css" rel="stylesheet" href="<c:url value='/reso/css/bootstrap.min.css' />" />

</head>
<!-- NAVBAR
================================================== -->
<body>
    <jsp:include page="common/header.jsp" />


    <div class="container-wrapper">
        <div class="container">
            <div class="page-header">
                <h1>Todos los Productos</h1>
                <p class="lead">Ve todos los productos asombroso disponibles AHORA</p>
            </div>
            <table class="table table-striped table-hover">
                <thead>
                    <tr class="bg.success">
                        <th>Photo Thumb</th>
                        <th>Product Name</th>
                        <th>Categoria</th>
                        <th>Condicion</th>
                        <th>Precio</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${products}" var="products">
                    <tr>
                        <td><img src="#" alt="image"></td>
                        <td>${products.producName}</td>
                        <td>${products.productCategory}</td>
                        <td>${products.productCondition}</td>
                        <td>${products.productPrice}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <!-- FOOTER -->
            <jsp:include page="common/footer.jsp" />
        </div>
    </div>


</div><!-- /.container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="<c:url value='/reso/js/jquery.min.js' />"><\/script>')</script>
<script src="<c:url value='/reso/js/bootstrap.js' />"></script>
</body></body>
</html>
    