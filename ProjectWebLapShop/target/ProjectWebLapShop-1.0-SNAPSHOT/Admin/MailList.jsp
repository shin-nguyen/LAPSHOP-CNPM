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
    <title>Mail</title>

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
    <jsp:include page="/Admin/HeaderAdmin.jsp" />
    <jsp:include page="/Admin/NavigationAdmin.jsp" />
    <!-- PAGE CONTAINER-->
    <div class="page-container">
        <div class="main-content">
            <div class="section__content section__content--p30">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-12">
                            <!-- DATA TABLE -->
                            <h3 class="title-5 m-b-35">Mail</h3>
                            <form method="get" action="${pageContext.request.contextPath}/TraLoiAddController">
                                <div class="table-data__tool">
                                    <div class="table-data__tool-left">
                                        <div class="rs-select2--light rs-select2--md">
                                            <select class="js-select2 select2-hidden-accessible" name="trangThai"  tabindex="-1" aria-hidden="true">
                                                <option value="All"
                                                    selected>
                                                    All Properties
                                                </option>

                                                <option value="1"<c:if test= "${trangThai =='1' }" >
                                                    selected
                                                </c:if>>Da Tra Loi </option>
                                                <option value="0"<c:if test= "${trangThai =='0' }" >
                                                    selected
                                                </c:if>>Chua Tra Loi</option>

                                            </select>
                                            <div class="dropDownSelect2"></div>
                                        </div>

                                        <button class="au-btn-filter" type="submit">
                                            <i class="zmdi zmdi-filter-list"></i>filters
                                        </button>
                                    </div>
                                </div>
                            </form>

                            <div class="table-responsive table-responsive-data2">
                                <table class="table table-data2">
                                    <thead>
                                    <tr>
                                        <th>Email ID</th>
                                        <th>Name </th>
                                        <th>Title</th>
                                        <th>Email</th>
                                        <th>Status</th>
                                        <th></th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:if test="${not empty hopThuList}">
                                    <c:forEach items = "${hopThuList}" var = "hopThu">

                                        <tr class="tr-shadow">

                                            <td> <c:out value="${hopThu.maHopThu}"></c:out></td>
                                            <td>
                                                <span class="block-email"><c:out value="${hopThu.tenNguoiGui}"></c:out></span>
                                            </td>
                                            <td class="desc"><c:out value="${hopThu.tieuDe}"></c:out></td>
                                            <td class="desc"><c:out value="${hopThu.email}"></c:out></td>
                                            <td ><c:out value="${hopThu.trangThai}" /></td>
                                            <td>
                                                <div class="table-data-feature">

                                                    <form method="post" action="${pageContext.request.contextPath}/TraLoiAddController">
                                                        <input name="maHopThu" value="${hopThu.maHopThu}" hidden readonly required>
                                                        <input name="trangThai" value="${3}" hidden readonly required>

                                                        <button class="item" data-toggle="tooltip" type="submit" data-placement="top"  title="" data-original-title="Send">
                                                            <i class="zmdi zmdi-mail-send"></i>
                                                        </button>
                                                    </form>

                                                </div>
                                            </td>
                                        </tr>
                                        <tr class="spacer"></tr>
                                    </c:forEach>
                                    </c:if>
                                    </tbody>
                                </table>
                            </div>
                            <!-- END DATA TABLE -->
                        </div>
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