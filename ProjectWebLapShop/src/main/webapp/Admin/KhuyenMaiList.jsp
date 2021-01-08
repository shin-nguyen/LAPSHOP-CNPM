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
    <title>PromotionalList</title>

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
                            <h3 class="title-5 m-b-35">Promotional</h3>
                            <div class="table-data__tool-right">
                                <a href="${pageContext.request.contextPath}/Admin/KhuyenMai.jsp" class="au-btn au-btn-icon au-btn--green au-btn--small">
                                    <i class="zmdi zmdi-plus"></i>Add</a>
                            </div>
                            <div class="table-responsive table-responsive-data2">
                                <table class="table table-data2">
                                    <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Promotional value</th>
                                        <th>Start date</th>
                                        <th>End date</th>

                                        <th></th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:if test="${not empty sessionScope.khuyenMaiSet}">
                                    <c:forEach items = "${sessionScope.khuyenMaiSet}" var = "khuyenMai">

                                        <tr class="tr-shadow">

                                            <td> <c:out value="${khuyenMai.maKhuyenMai}"></c:out></td>
                                            <td>
                                                <span class="block-email">
                                                    <fmt:setLocale value="vi_VN"/>
                                                    <fmt:formatNumber value="${khuyenMai.giaTriKhuyenMai}" type="currency"/>
                                                </span>
                                            </td>
                                            <td class="desc">
                                                <fmt:formatDate pattern="yyyy-MM-dd" value="${khuyenMai.ngayBatDau}" />
                                            </td>
                                            <td >
                                                <fmt:formatDate pattern="yyyy-MM-dd" value="${khuyenMai.ngayKetThuc}" />
                                            </td>
                                            <td>
                                                <div class="table-data-feature">
                                                    <a href="${pageContext.request.contextPath}/KhuyenMaiAddController?maKhuyenMai=${khuyenMai.maKhuyenMai}" class="item" data-toggle="tooltip" data-placement="top" title="" data-original-title="Edit">
                                                        <i class="zmdi zmdi-edit"></i>
                                                    </a>

                                                    <a href="${pageContext.request.contextPath}/KhuyenMaiDelete?maKhuyenMai=${khuyenMai.maKhuyenMai}" class="item" data-toggle="tooltip" data-placement="top" title="" data-original-title="Delete">
                                                        <i class="zmdi zmdi-delete"></i>
                                                    </a>

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