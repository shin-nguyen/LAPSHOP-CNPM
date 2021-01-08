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
    <title>Register</title>

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
<%--    <jsp:include page="/Admin/HeaderAdmin.jsp" />--%>
<%--    <jsp:include page="/Admin/NavigationAdmin.jsp" />--%>

    <div class="page-content--bge5">
        <div class="container">
            <div class="login-wrap">
                <div class="login-content">
                    <div class="login-logo">
                        <a href="#">
                            <img src="${url}/images/icon/logo.png" alt="CoolAdmin">
                        </a>
                    </div>

                    <div class="login-form" style="overflow: auto">
                        <form action="${pageContext.request.contextPath}/TaiKhoanAddController" method="post">

                            <div class="form-group">
                                <c:choose>

                                    <c:when test = "${not empty maTK}">
                                        <input type="text" name="maTK" value="${maTK}" placeholder="Mã TK" class="form-control"  hidden readonly required>
                                    </c:when>
                                    <c:otherwise>
                                        <input type="text" name="maTK" value="0" placeholder="MaTK" class="form-control" readonly hidden required>
                                    </c:otherwise>
                                </c:choose>

                            </div>

                            <div class="form-group">
                                <label>Name </label>
                                <input class="au-input au-input--full" value="${hoTen}" type="text" name="hoTen" placeholder="Name" required>
                            </div>

                            <div class="form-group">
                                <label>Username  <c:out  value="${accountNameError}"/> </label>
                                <input class="au-input au-input--full" type="text" value="${tenTK}" name="tenTK" placeholder="Username"required>
                            </div>

                            <div class="form-group">
                                <label>Email Address <c:out value="${emailError}"/> </label>
                                <input class="au-input au-input--full" type="email" value="${email}" name="email" placeholder="Email"required>
                            </div>

                            <div class="form-group">
                                <label>Address </label>
                                <input class="au-input au-input--full" type="text" value="${diaChi}" name="diaChi" placeholder="Address"required>
                            </div>

                            <div class="form-group">
                                <label>Password</label>
                                <input class="au-input au-input--full" type="password" name="matKhau" placeholder="Password"required>
                            </div>


                            <fmt:formatDate var="varyear" value="${namSinh}" pattern="yyyy" />
                            <fmt:formatDate var="varmonth" value="${namSinh}" pattern="MM" />
                            <fmt:formatDate var="varday" value="${namSinh}" pattern="dd" />

                            <div class="form-group">
                                <LABEL>Birth Date</LABEL>
                                <div class="form-group">
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
                                <div class="form-group">
                                    <label>Day</label>
                                    <select name="day">
                                        <c:forEach begin="1" end="31" var="forday">
                                            <option
                                                    <c:if test= "${   forday == varday}" >
                                                        selected
                                                    </c:if>>
                                                <c:out value="${forday}"/>
                                            </option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label>Year</label>

                                    <select name="year">
                                        <c:forEach begin="1950" end="2010" var="foryear">
                                            <option
                                                    <c:if test= "${   foryear == varyear }" >
                                                        selected
                                                    </c:if>>
                                                <c:out value="${foryear}"/>
                                            </option>
                                        </c:forEach>
                                    </select>

                                </div>
                            </div>

                            <button class="au-btn au-btn--block au-btn--green m-b-20" type="submit">register</button>
                            <a class="au-btn au-btn--block au-btn--green m-b-20" href="${url}/AccountsList.jsp">Cancel</a>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

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