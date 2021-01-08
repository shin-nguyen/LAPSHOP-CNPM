<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 26/11/2020
  Time: 10:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js" lang="zxx">

<!-- contact32:04-->
<head>
    <c:url value="/Client" var="url"></c:url>

    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Contact</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Favicon -->
    <link rel="shortcut icon" href="${url}/images/favicon.png">
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
    <!-- Main Style CSS -->
    <link rel="stylesheet" href="${url}/style.css">
    <!-- Helper CSS -->
    <link rel="stylesheet" href="${url}/css/helper.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="${url}/css/responsive.css">
    <!-- Modernizr js -->
    <script src="${url}/js/vendor/modernizr-2.8.3.min.js"></script>

</head>
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
                        <li class="active">Contact</li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- Li's Breadcrumb Area End Here -->
        <!-- Begin Contact Main Page Area -->
        <div class="contact-main-page mt-60 mb-40 mb-md-40 mb-sm-40 mb-xs-40">
            <div class="container">
                <div class="row">
                    <div class="col-lg-5 offset-lg-1 col-md-12 order-1 order-lg-2">
                        <div class="contact-page-side-content">
                            <h3 class="contact-page-title">Contact Us</h3>
                            <div class="single-contact-block">
                                <h4><i class="fa fa-fax"></i> Address</h4>
                                <p>1 - Vo Van Ngan - Thu Duc - TP.HCM</p>
                            </div>
                            <div class="single-contact-block">
                                <h4><i class="fa fa-phone"></i> Phone</h4>
                                <p>Mobile: (+84)918948074 </p>

                            </div>
                            <div class="single-contact-block last-child">
                                <h4><i class="fa fa-envelope-o"></i> Email</h4>
                                <p>tangyucheng2000@domain.com</p>
                                <p>18110365@hcmute.edu.vn</p>
                            </div>
                        </div>
                    </div>



                    <div class="col-lg-6 col-md-12 order-2 order-lg-1">
                        <div class="contact-form-content pt-sm-55 pt-xs-55">
                            <h3 class="contact-page-title">Tell Us Your Message</h3>
                            <div class="contact-form">
                                <form  action="${pageContext.request.contextPath}/HopThuAddController" method="get">

                                    <c:if test="${not empty done}">
                                        <script>
                                            window.addEventListener("load",function(){
                                                alert("${done}");
                                            })
                                        </script>
                                    </c:if>

                                    <div class="form-group">
                                        <label>Your Name <span class="required">*</span></label>
                                        <input type="text" value ="${name}" name="name" required>
                                    </div>
                                    <div class="form-group">
                                        <label>Your Email <span class="required">* <label style="color: #e50606" ><c:out value="${emailError}"/></label></span></label>
                                        <input type="email" value ="${email}" name="email"  required>
                                    </div>
                                    <div class="form-group">
                                        <label>Subject</label>
                                        <input type="text" value ="${subject}" name="subject"  required>
                                    </div>
                                    <div class="form-group mb-30">
                                        <label>Your Message</label>
                                        <textarea name="message" id="contactMessage" required></textarea>
                                    </div>
                                    <div class="form-group">
                                        <button type="submit" id="submit" class="li-btn-3" >Send</button>
                                    </div>
                                </form>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Contact Main Page Area End Here -->
    <!-- Footer -->
    <jsp:include page="/Client/footer.jsp" />
    </div>

        <!-- Body Wrapper End Here -->
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

<!-- contact32:04-->
</html>

