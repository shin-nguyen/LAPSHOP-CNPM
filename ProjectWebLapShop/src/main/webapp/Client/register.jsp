<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 3/12/2020
  Time: 8:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<META HTTP-EQUIV="Content-language" CONTENT="vi">--%>

<!doctype html>

<html class="no-js" lang="zxx">
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
<jsp:include page="/Client/header.jsp" />
                <!-- Register Form s-->
                <form action="${pageContext.request.contextPath}/DangKiController" method="post">
                    <div class="login-form">
                        <h4 class="login-title">Register</h4>
                        <div class="row">

                            <div class="col-md-12 mb-20">
                                <label>Account Name*  <c:out  value="${accountNameError}"/> </label>
                                <input class="mb-0" type="text"  placeholder="Account Name" name="tenTK" value="${tenTK}" required>
                            </div>
                            <div class="col-md-12 mb-20">
                                <label>Name  <c:out value="${nameError}"/></label>
                                <input class="mb-0" type="text" placeholder=" Name" name="hoTen" value="${hoTen}" required>
                            </div>
                            <div class="col-md-12 mb-20">
                                <label>Email Address* <c:out value="${emailAddressError}"/></label>
                                <input class="mb-0" type="email" placeholder="Email Address" name="email" value="${email}"required>
                            </div>
                            <div class="col-md-6 mb-20">
                                <label>Password <c:out value="${matKhauError}"/> </label>
                                <input class="mb-0" type="password" placeholder="Password" name="matKhau"required>
                            </div>
                            <div class="col-md-6 mb-20">
                                <label>Confirm Password </label>
                                <input class="mb-0" type="password" placeholder="Confirm Password" name="matKhauXacNhan"required>
                            </div>
                            <div class="col-md-12 mb-20">
                                <label>Address* <c:out value="${diaChiError}"/> </label>
                                <input class="mb-0" type="text" placeholder="Address" name = "diaChi" value="${diaChi}"required>
                            </div>

                            <div class="col-md-12 mb-20">
                                <LABEL>Birth Date</LABEL>
                                <div class="col-md-12 mb-20">
                                    <label>Month</label>
                                    <select name="month" >
                                        <option value="1"   <c:if test= "${   1 == month }" >
                                            selected
                                        </c:if>>
                                            January</option>
                                        <option value="2" <c:if test= "${   2 == month }" >
                                            selected
                                        </c:if>>February</option>
                                        <option value="3"<c:if test= "${   3 == month }" >
                                            selected
                                        </c:if>>March</option>
                                        <option value="4"<c:if test= "${   4 == month }" >
                                            selected
                                        </c:if>>April</option>
                                        <option value="5"<c:if test= "${   5 == month }" >
                                            selected
                                        </c:if>>May</option>
                                        <option value="6"<c:if test= "${   6  == month }" >
                                            selected
                                        </c:if>>June</option>
                                        <option value="7"<c:if test= "${   7 == month }" >
                                            selected
                                        </c:if>>July</option>
                                        <option value="8"<c:if test= "${   8 == month }" >
                                            selected
                                        </c:if>>August</option>
                                        <option value="9"<c:if test= "${   9 == month }" >
                                            selected
                                        </c:if>>September</option>
                                        <option value="10"<c:if test= "${   10 == month }" >
                                            selected
                                        </c:if>>October</option>
                                        <option value="11"<c:if test= "${   11 == month }" >
                                            selected
                                        </c:if>>November</option>
                                         <option value="12"<c:if test= "${   12 == month }" >
                                             selected
                                         </c:if>>December</option>
                                     </select>
                                </div>
                                <div class="col-md-12 mb-20">
                                    <label>Day</label>
                                     <select name="day">
                                         <c:forEach begin="1" end="31" var="varday">
                                             <option value="${varday}"
                                                     <c:if test= "${   varday == day}" >
                                                         selected
                                                     </c:if>>
                                                 <c:out value="${varday}"/>
                                             </option>
                                        </c:forEach>
                                     </select>
                               </div>
                                <div class="col-md-12 mb-20">
                                    <label>Year</label>

                                    <select name="year">
                                        <c:forEach begin="1950" end="2020" var="varyear">
                                          <option value="${varyear}"
                                                  <c:if test= "${   year == varyear }" >
                                                        selected
                                                  </c:if>>
                                              <c:out value="${varyear}"/>
                                          </option>
                                        </c:forEach>
                                  </select>

                                </div>
                            </div>
                            <div class="col-12">
                                <button type="submit" class="register-button mt-0">Register</button>
                            </div>

                        </div>
                    </div>
                </form>
                <!-- Register form end -->
<jsp:include page="/Client/footer.jsp" />