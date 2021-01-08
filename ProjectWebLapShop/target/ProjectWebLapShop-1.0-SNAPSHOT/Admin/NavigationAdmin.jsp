<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!doctype html>
<html class="no-js" lang="zxx">

<head>
    <c:url value="/Admin" var="url"></c:url>

    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="">
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <title></title>


    <!-- Fontfaces CSS-->
    <link href="${url}/css/font-face.css" rel="stylesheet" media="all">
    <link href="${url}/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <link href="${url}/vendor/font-awesome-5/css/fontawesome-all.min.css" rel="stylesheet" media="all">
    <link href="${url}/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">

    <!-- Bootstrap CSS-->
    <link href="${url}/vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">

    <!-- Vendor CSS-->
    <link href="${url}/vendor/animsition/animsition.min.css" rel="stylesheet" media="all">
    <link href="${url}/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet" media="all">
    <link href="${url}/vendor/wow/animate.css" rel="stylesheet" media="all">
    <link href="${url}/vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet" media="all">
    <link href="${url}/vendor/slick/slick.css" rel="stylesheet" media="all">
    <link href="${url}/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="${url}/vendor/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="${url}/css/theme.css" rel="stylesheet" media="all">

</head>

<body class="animsition">
<div class="page-wrapper">
    <!-- HEADER MOBILE-->
<%--    <header class="header-mobile d-block d-lg-none">--%>
<%--        <div class="header-mobile__bar">--%>
<%--            <div class="container-fluid">--%>
<%--                <div class="header-mobile-inner">--%>
<%--                    <a class="logo" href="${url}/Dashboard.html">--%>
<%--                        <img src="images/icon/logo.png" alt="CoolAdmin" />--%>
<%--                    </a>--%>
<%--                    <button class="hamburger hamburger--slider" type="button">--%>
<%--                            <span class="hamburger-box">--%>
<%--                                <span class="hamburger-inner"></span>--%>
<%--                            </span>--%>
<%--                    </button>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <nav class="navbar-mobile">--%>
<%--            <div class="container-fluid">--%>
<%--                <ul class="navbar-mobile__list list-unstyled">--%>
<%--                    <li class="has-sub">--%>
<%--                        <a class="js-arrow" href="${url}/Dashboard.html">--%>
<%--                            <i class="fas fa-tachometer-alt"></i>Dashboard</a>--%>
<%--                    </li>--%>

<%--                    <li>--%>
<%--                        <a href="ProductsList.html">--%>
<%--                            <i class="fas fa-table"></i>Products</a>--%>
<%--                    </li>--%>
<%--                    <li>--%>
<%--                        <a href="OrdersList.html">--%>
<%--                            <i class="far fa-check-square"></i>Order</a>--%>
<%--                    </li>--%>
<%--                    <li class="has-sub">--%>
<%--                        <a class="js-arrow" href="#">--%>
<%--                            <i class="fas fa-copy"></i>Pages</a>--%>
<%--                        <ul class="navbar-mobile-sub__list list-unstyled js-sub-list">--%>
<%--                            <li>--%>
<%--                                <a href="login.html">Login</a>--%>
<%--                            </li>--%>
<%--                            <li>--%>
<%--                                <a href="register.html">Register</a>--%>
<%--                            </li>--%>
<%--                            <li>--%>
<%--                                <a href="forget-pass.html">Forget Password</a>--%>
<%--                            </li>--%>
<%--                        </ul>--%>
<%--                    </li>--%>

<%--                </ul>--%>
<%--            </div>--%>
<%--        </nav>--%>
<%--    </header>--%>
    <!-- END HEADER MOBILE-->
    <!-- MENU SIDE-BAR-->
    <aside class="menu-sidebar d-none d-lg-block">
        <div class="logo">
            <a class="logo" href="${url}/ProductsList.jsp">
                <img src="${pageContext.request.contextPath}/Admin/images/icon/logo.png" alt="CoolAdmin" />
            </a>
        </div>
        <div class="menu-sidebar__content js-scrollbar1">
            <nav class="navbar-sidebar">
                <ul class="list-unstyled navbar__list">
                    <li class="active has-sub">
                        <a class="js-arrow" href="${pageContext.request.contextPath}/Admin/ProducersList.jsp">
                            <i class="fas fa-tachometer-alt"></i>Manufacturer</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/Admin/ProductsList.jsp">
                            <i class="fas fa-table"></i>Products</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/GioHangController?trangThai=All">
                            <i class="far fa-check-square"></i>Orders</a>
                    </li>
                    <li class="has-sub">
                        <a class="js-arrow" href="${pageContext.request.contextPath}/Admin/AccountsList.jsp">
                            <i class="fas fa-copy"></i>Account</a>
                    </li>

                    <li>
                        <a href="${pageContext.request.contextPath}/Admin/KhuyenMaiList.jsp">
                            <i class="far fa-calendar-check-o"></i>Promotional</a>
                    </li>
                </ul>
            </nav>
        </div>
    </aside>
    <!-- END MENU SIDEBAR-->
</div>
<!-- Jquery JS-->
<script src="${url}/vendor/jquery-3.2.1.min.js"></script>
<!-- Bootstrap JS-->
<script src="${url}/vendor/bootstrap-4.1/popper.min.js"></script>
<script src="${url}/vendor/bootstrap-4.1/bootstrap.min.js"></script>
<!-- Vendor JS       -->
<script src="${url}/vendor/slick/slick.min.js">
</script>
<script src="${url}/endor/wow/wow.min.js"></script>
<script src="${url}/vendor/animsition/animsition.min.js"></script>
<script src="${url}/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
</script>
<script src="${url}/vendor/counter-up/jquery.waypoints.min.js"></script>
<script src="${url}/vendor/counter-up/jquery.counterup.min.js">
</script>
<script src="${url}/vendor/circle-progress/circle-progress.min.js"></script>
<script src="${url}/vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
<script src="${url}/vendor/chartjs/Chart.bundle.min.js"></script>
<script src="${url}/vendor/select2/select2.min.js">
</script>

<!-- Main JS-->
<script src="${url}/js/main.js"></script>
</body>
</html>