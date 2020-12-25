<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 26/11/2020
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js" lang="zxx">

<!-- single-product31:30-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>My Account</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="images/favicon.png">
    <!-- Material Design Iconic Font-V2.2.0 -->
    <link rel="stylesheet" href="css/material-design-iconic-font.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <!-- Font Awesome Stars-->
    <link rel="stylesheet" href="css/fontawesome-stars.css">
    <!-- Meanmenu CSS -->
    <link rel="stylesheet" href="css/meanmenu.css">
    <!-- owl carousel CSS -->
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <!-- Slick Carousel CSS -->
    <link rel="stylesheet" href="css/slick.css">
    <!-- Animate CSS -->
    <link rel="stylesheet" href="css/animate.css">
    <!-- Jquery-ui CSS -->
    <link rel="stylesheet" href="css/jquery-ui.min.css">
    <!-- Venobox CSS -->
    <link rel="stylesheet" href="css/venobox.css">
    <!-- Nice Select CSS -->
    <link rel="stylesheet" href="css/nice-select.css">
    <!-- Magnific Popup CSS -->
    <link rel="stylesheet" href="css/magnific-popup.css">
    <!-- Bootstrap V4.1.3 Fremwork CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Helper CSS -->
    <link rel="stylesheet" href="css/helper.css">
    <!-- Main Style CSS -->
    <link rel="stylesheet" href="style.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- Modernizr js -->
    <script src="js/vendor/modernizr-2.8.3.min.js"></script>

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
    <%@ include file="/Client/header.jsp" %>
    <!-- Begin Li's Breadcrumb Area -->
    <div class="breadcrumb-area">
        <div class="container">
            <div class="breadcrumb-content">
                <ul>
                    <li><a href="index.jsp">Home</a></li>
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
                    <form action="${pageContext.request.contextPath}/ChangeInfoController">
                        <div class="login-form">
                            <h4 class="login-title">Information</h4>
                            <div class="row">



                                <c:set var="tempMonth" scope="request" value="${month  }"/>
                                <c:set var="tempYear" scope="request" value="${param.year}"/>
                                <c:set var="tempDay" scope="request" value="${param.day}"/>


                                <div class="col-md-12 mb-20">
                                    <label>Name  <c:out value="${nameError}"/></label>
                                    <input class="mb-0" type="text" placeholder=" Name" name="hoTen" value="${sessionScope.taiKhoan.hoTen}" >
                                </div>
                                <div class="col-md-12 mb-20">
                                    <label>Email Address* <c:out value="${emailAddressError}"/></label>
                                    <input class="mb-0" type="email" placeholder="Email Address" name="email" value="${sessionScope.taiKhoan.email}">
                                </div>

                                <div class="col-md-12 mb-20">
                                    <label>Address* <c:out value="${diaChiError}"/> </label>
                                    <input class="mb-0" type="text" placeholder="Address" name = "diaChi" value="${sessionScope.taiKhoan.diaChi}">
                                </div>

                                <div class="col-md-12 mb-20">
                                    <LABEL>Birth Date</LABEL>
                                    <div class="col-md-12 mb-20">
                                        <label>Month</label>
                                        <select name="month" >
                                            <option value="1"   <c:if test= "${   1 == tempMonth }" >
                                                selected
                                            </c:if>>
                                                January</option>
                                            <option value="2" <c:if test= "${   2 == tempMonth }" >
                                                selected
                                            </c:if>>February</option>
                                            <option value="3"<c:if test= "${   3 == tempMonth }" >
                                                selected
                                            </c:if>>March</option>
                                            <option value="4"<c:if test= "${   4 == tempMonth }" >
                                                selected
                                            </c:if>>April</option>
                                            <option value="5"<c:if test= "${   5 == tempMonth }" >
                                                selected
                                            </c:if>>May</option>
                                            <option value="6"<c:if test= "${   6  == tempMonth }" >
                                                selected
                                            </c:if>>June</option>
                                            <option value="7"<c:if test= "${   7 == tempMonth }" >
                                                selected
                                            </c:if>>July</option>
                                            <option value="8"<c:if test= "${   8 == tempMonth }" >
                                                selected
                                            </c:if>>August</option>
                                            <option value="9"<c:if test= "${   9 == tempMonth }" >
                                                selected
                                            </c:if>>September</option>
                                            <option value="10"<c:if test= "${   10 == tempMonth }" >
                                                selected
                                            </c:if>>October</option>
                                            <option value="11"<c:if test= "${   11 == tempMonth }" >
                                                selected
                                            </c:if>>November</option>
                                            <option value="12"<c:if test= "${   12 == tempMonth }" >
                                                selected
                                            </c:if>>December</option>
                                        </select>
                                    </div>
                                    <div class="col-md-12 mb-20">
                                        <label>Day</label>
                                        <select name="day">
                                            <c:forEach begin="1" end="31" var="day">
                                                <option
                                                        <c:if test= "${   day == tempDay}" >
                                                            selected
                                                        </c:if>>
                                                    <c:out value="${day}"/>
                                                </option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="col-md-12 mb-20">
                                        <label>Year</label>

                                        <select name="year">
                                            <c:forEach begin="1950" end="2010" var="year">
                                                <option
                                                        <c:if test= "${   year == tempYear }" >
                                                            selected
                                                        </c:if>>
                                                    <c:out value="${year}"/>
                                                </option>
                                            </c:forEach>
                                        </select>

                                    </div>
                                </div>


                                <div class="col-12">
                                    <button class="register-button mt-0">Update</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>

                <div class="col-sm-12 col-md-12 col-xs-12 col-lg-6 mb-30">
                    <!-- Change Password-->
                    <form action="${pageContext.request.contextPath}/ChangePasswordController" >
                        <div class="login-form">
                            <h4 class="login-title">Change Password</h4>
                            <div class="row">
                                <div class="col-md-12 col-12 mb-20">
                                    <label>Password <c:out value="${matKhauError}"/> </label>
                                    <input class="mb-0" type="password" placeholder="Password" name="matKhau">
                                </div>
                                <div class="col-12 mb-20">
                                    <label>Confirm Password </label>
                                    <input class="mb-0" type="password" placeholder="Confirm Password" name="matKhauXacNhan">
                                </div>

                                <div class="col-md-12">
                                    <button class="register-button mt-0">Change</button>
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
<script src="js/vendor/jquery-1.12.4.min.js"></script>
<!-- Popper js -->
<script src="js/vendor/popper.min.js"></script>
<!-- Bootstrap V4.1.3 Fremwork js -->
<script src="js/bootstrap.min.js"></script>
<!-- Ajax Mail js -->
<script src="js/ajax-mail.js"></script>
<!-- Meanmenu js -->
<script src="js/jquery.meanmenu.min.js"></script>
<!-- Wow.min js -->
<script src="js/wow.min.js"></script>
<!-- Slick Carousel js -->
<script src="js/slick.min.js"></script>
<!-- Owl Carousel-2 js -->
<script src="js/owl.carousel.min.js"></script>
<!-- Magnific popup js -->
<script src="js/jquery.magnific-popup.min.js"></script>
<!-- Isotope js -->
<script src="js/isotope.pkgd.min.js"></script>
<!-- Imagesloaded js -->
<script src="js/imagesloaded.pkgd.min.js"></script>
<!-- Mixitup js -->
<script src="js/jquery.mixitup.min.js"></script>
<!-- Countdown -->
<script src="js/jquery.countdown.min.js"></script>
<!-- Counterup -->
<script src="js/jquery.counterup.min.js"></script>
<!-- Waypoints -->
<script src="js/waypoints.min.js"></script>
<!-- Barrating -->
<script src="js/jquery.barrating.min.js"></script>
<!-- Jquery-ui -->
<script src="js/jquery-ui.min.js"></script>
<!-- Venobox -->
<script src="js/venobox.min.js"></script>
<!-- Nice Select js -->
<script src="js/jquery.nice-select.min.js"></script>
<!-- ScrollUp js -->
<script src="js/scrollUp.min.js"></script>
<!-- Main/Activator js -->
<script src="js/main.js"></script>
</body>

<!-- single-product31:32-->
</html>
