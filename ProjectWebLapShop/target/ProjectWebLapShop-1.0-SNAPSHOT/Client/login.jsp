<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>

<%--<html class="no-js" lang="zxx">--%>
<!-- index28:48-->
<head>
    <c:url value="/Client" var="url"></c:url>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Home Page</title>
    <meta name="description" content="">

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Favicon -->
    <link rel="shortcut icon"  href="${url}/images/favicon.png">

    <!-- Material Design Iconic Font-V2.2.0 -->
    <link rel="stylesheet" href="${url}/css/material-design-iconic-font.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${url}/css/font-awesome.min.css">
    <!-- Font Awesome Stars-->
    <link rel="stylesheet" href="${url}/css/fontawesome-stars.css">
    <!-- Meanmenu CSS -->
    <link rel="stylesheet" href="${url}/css/meanmenu.css">
    <!-- owl carousel CSS -->
    <link rel="stylesheet" href="${url}/css/owl.carousel.min.css">
    <!-- Slick Carousel CSS -->
    <link rel="stylesheet" href="${url}/css/slick.css">
    <!-- Animate CSS -->
    <link rel="stylesheet" href="${url}/css/animate.css">
    <!-- Jquery-ui CSS -->
    <link rel="stylesheet" href="${url}/css/jquery-ui.min.css">
    <!-- Venobox CSS -->
    <link rel="stylesheet" href="${url}/css/venobox.css">
    <!-- Nice Select CSS -->
    <link rel="stylesheet" href="${url}/css/nice-select.css">
    <!-- Magnific Popup CSS -->
    <link rel="stylesheet" href="${url}/css/magnific-popup.css">
    <!-- Bootstrap V4.1.3 Fremwork CSS -->
    <link rel="stylesheet" href="${url}/css/bootstrap.min.css">
    <!-- Helper CSS -->
    <link rel="stylesheet" href="${url}/css/helper.css">
    <!-- Main Style CSS -->
    <link rel="stylesheet" href="${url}/style.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="${url}/css/responsive.css">
    <!-- Modernizr js -->
    <script src="${url}/js/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body>
<jsp:include page="/Client/header.jsp" />
<!-- Login Form s-->
<form action="${pageContext.request.contextPath}/DangNhapController"  method="post">
    <div class="login-form">
        <h4 class="login-title">Login</h4>
        <div class="row">

                <div class="col-md-12 col-12 mb-20">
                    <label>Tai Khoan*</label>
                    <input class="mb-0" type="text" placeholder="Điền Tài Khoản" name="tenTK">
                </div>
                <div class="col-12 mb-20">
                    <label>Password</label>
                    <input class="mb-0" type="password" placeholder="Password" name ="matKhau">
                </div>
                <div class="col-md-8">
                    <div class="check-box d-inline-block ml-0 ml-md-2 mt-10">
                        <input type="checkbox" id="remember_me" name="nho">
                        <label for="remember_me">Remember me</label>
                    </div>
                </div>
                <font color="red">
                    <c:if test="${not empty param.ThongBaoLoi}">
                        <c:out value="${param.ThongBaoLoi}" />
                    </c:if>
                </font>

            <div class="col-md-4 mt-10 mb-20 text-left text-md-right">
                <a href="#"> Forgotten pasaword?</a>
            </div>
            <div class="col-md-12">
                <button type="submit" class="register-button mt-0">Login</button>
            </div>

        </div>
    </div>
</form>
<!-- Login form end -->
<jsp:include page="/Client/footer.jsp" />
</body>
</html>