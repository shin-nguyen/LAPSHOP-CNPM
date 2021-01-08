<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 26/11/2020
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<META HTTP-EQUIV="Content-language" CONTENT="vi">--%>


<!doctype html>
<html class="no-js" lang="zxx">

<!-- single-product31:30-->
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

<script type="text/javascript">
    function alertName(){
        alert("Form has been submitted");
    }
</script>

<body>
<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->
<!-- Begin Body Wrapper -->
<div class="body-wrapper">
    <!-- Header -->
    <jsp:include page="/Client/header.jsp" />
    <!-- Begin Li's Breadcrumb Area -->
    <div class="breadcrumb-area">
        <div class="container">
            <div class="breadcrumb-content">
                <ul>
                    <li><a href="${url}/home.jsp">Home</a></li>
                    <li class="active">My Account</li>
                </ul>
            </div>
        </div>
    </div>
    <!-- Li's Breadcrumb Area End Here -->
    <!-- Begin My Account Area -->
    <div class="page-section mb-60">
        <div class="container">
            <div class="row">
                <div class="col-sm-12 col-md-12 col-lg-6 col-xs-12">
                    <form action="${pageContext.request.contextPath}/ChangeInfoController" method="post">
                        <div class="login-form">
                            <h4 class="login-title">Information</h4>
                            <div class="row">

                                <div class="col-md-12 mb-20">
                                    <label>Name </label>
                                    <input class="mb-0" type="text" placeholder=" Name" name="hoTen" value="${sessionScope.taiKhoan.hoTen}" required>
                                </div>
                                <div class="col-md-12 mb-20">
                                    <label>Email Address* <c:out value="${emailError}"/></label>
                                    <input class="mb-0" type="email" placeholder="Email Address" name="email" value="${sessionScope.taiKhoan.email}" required>
                                </div>

                                <div class="col-md-12 mb-20">
                                    <label>Address* </label>
                                    <input class="mb-0" type="text" placeholder="Address" name = "diaChi" value="${sessionScope.taiKhoan.diaChi}" required>
                                </div>

                                <fmt:formatDate var="varyear" value="${sessionScope.taiKhoan.namSinh}" pattern="yyyy" />
                                <fmt:formatDate var="varmonth" value="${sessionScope.taiKhoan.namSinh}" pattern="MM" />
                                <fmt:formatDate var="varday" value="${sessionScope.taiKhoan.namSinh}" pattern="dd" />

                                <div class="col-md-12 mb-20">
                                    <LABEL>Birth Date</LABEL>
                                    <div class="col-md-12 mb-20">
                                        <label>Month</label>
                                        <select name="month" >
                                            <option value="1"   <c:if test= "${   1 == varmonth }" >
                                                selected
                                            </c:if>>
                                                January</option>
                                            <option value="2" <c:if test= "${   2 == varmonth }" >
                                                selected
                                            </c:if>>February</option>
                                            <option value="3"<c:if test= "${   3 == varmonth }" >
                                                selected
                                            </c:if>>March</option>
                                            <option value="4"<c:if test= "${   4 == varmonth }" >
                                                selected
                                            </c:if>>April</option>
                                            <option value="5"<c:if test= "${   5 == varmonth }" >
                                                selected
                                            </c:if>>May</option>
                                            <option value="6"<c:if test= "${   6  == varmonth }" >
                                                selected
                                            </c:if>>June</option>
                                            <option value="7"<c:if test= "${   7 == varmonth }" >
                                                selected
                                            </c:if>>July</option>
                                            <option value="8"<c:if test= "${   8 == varmonth }" >
                                                selected
                                            </c:if>>August</option>
                                            <option value="9"<c:if test= "${   9 == varmonth }" >
                                                selected
                                            </c:if>>September</option>
                                            <option value="10"<c:if test= "${   10 == varmonth }" >
                                                selected
                                            </c:if>>October</option>
                                            <option value="11"<c:if test= "${   11 == varmonth }" >
                                                selected
                                            </c:if>>November</option>
                                            <option value="12"<c:if test= "${   12 == varmonth }" >
                                                selected
                                            </c:if>>December</option>
                                        </select>
                                    </div>
                                    <div class="col-md-12 mb-20">
                                        <label>Day</label>
                                        <select name="day">
                                            <c:forEach begin="1" end="31" var="forday">
                                                <option value="${forday}"
                                                        <c:if test= "${   forday == varday}" >
                                                            selected
                                                        </c:if>>
                                                    <c:out value="${forday}"/>
                                                </option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="col-md-12 mb-20">
                                        <label>Year</label>

                                        <select name="year">
                                            <c:forEach begin="1950" end="2010" var="foryear">
                                                <option value="${foryear}"
                                                        <c:if test= "${   foryear == varyear }" >
                                                            selected
                                                        </c:if>>
                                                    <c:out value="${foryear}"/>
                                                </option>
                                            </c:forEach>
                                        </select>

                                    </div>
                                </div>


                                <div class="col-12">
                                    <button type="submit" class="register-button mt-0">Update</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>

                <div class="col-sm-12 col-md-12 col-xs-12 col-lg-6 mb-30">
                    <!-- Change Password-->
                    <form action="${pageContext.request.contextPath}/ChangePasswordController" method="post">
                        <div class="login-form">
                            <h4 class="login-title">Change Password</h4>
                            <div class="row">
                                <div class="col-md-12 col-12 mb-20">
                                    <label>Password <c:out value="${matKhauError}"/> </label>
                                    <input class="mb-0" type="password" placeholder="Password" name="matKhau" required>
                                </div>
                                <div class="col-12 mb-20">
                                    <label>Confirm Password </label>
                                    <input class="mb-0" type="password" placeholder="Confirm Password" name="matKhauXacNhan" required>
                                </div>

                                <div class="col-md-12">
                                    <button type="submit" class="register-button mt-0">Change</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- Login Content Area End Here -->
    <!-- Footer -->
    <%@ include file="footer.jsp" %>
    <!
</div>
<!--Body Wrapper End Here -->
<!-- jQuery-V1.12.4 -->
<script src="${url}/js/vendor/jquery-1.12.4.min.js"></script>
<!-- Popper js -->
<script src="${url}/js/vendor/popper.min.js"></script>
<!-- Bootstrap V4.1.3 Fremwork js -->
<script src="${url}/js/bootstrap.min.js"></script>
<!-- Ajax Mail js -->
<script src="${url}/js/ajax-mail.js"></script>
<!-- Meanmenu js -->
<script src="${url}/js/jquery.meanmenu.min.js"></script>
<!-- Wow.min js -->
<script src="${url}/js/wow.min.js"></script>
<!-- Slick Carousel js -->
<script src="${url}/js/slick.min.js"></script>
<!-- Owl Carousel-2 js -->
<script src="${url}/js/owl.carousel.min.js"></script>
<!-- Magnific popup js -->
<script src="${url}/js/jquery.magnific-popup.min.js"></script>
<!-- Isotope js -->
<script src="${url}/js/isotope.pkgd.min.js"></script>
<!-- Imagesloaded js -->
<script src="${url}/js/imagesloaded.pkgd.min.js"></script>
<!-- Mixitup js -->
<script src="${url}/js/jquery.mixitup.min.js"></script>
<!-- Countdown -->
<script src="${url}/js/jquery.countdown.min.js"></script>
<!-- Counterup -->
<script src="${url}/js/jquery.counterup.min.js"></script>
<!-- Waypoints -->
<script src="${url}/js/waypoints.min.js"></script>
<!-- Barrating -->
<script src="${url}/js/jquery.barrating.min.js"></script>
<!-- Jquery-ui -->
<script src="${url}/js/jquery-ui.min.js"></script>
<!-- Venobox -->
<script src="${url}/js/venobox.min.js"></script>
<!-- Nice Select js -->
<script src="${url}/js/jquery.nice-select.min.js"></script>
<!-- ScrollUp js -->
<script src="${url}/js/scrollUp.min.js"></script>
<!-- Main/Activator js -->
<script src="${url}/js/main.js"></script>
</body>

<!-- single-product31:32-->
</html>
