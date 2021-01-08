<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>CartList</title>

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

    <!-- MAIN CONTENT-->
    <div class="page-container">
        <div class="main-content">
            <div class="section__content section__content--p30">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="card">
                                <div class="card-header">Cart </div>
                                <div class="card-body">
                                    <hr>
                                    <form action="${pageContext.request.contextPath}/GioHangController" method="post" novalidate="novalidate">
                                        <div class="form-group">
                                            <label  class="control-label mb-1">Name</label>
                                            <label > <c:out value="${gioHang.taiKhoan.tenTK}"/> </label>
                                        </div>
                                        <div class="form-group has-success">
                                            <label for="cc-name" class="control-label mb-1">Total money</label>

                                            <fmt:setLocale value="vi_VN"/>
                                            <label> <fmt:formatNumber value="${gioHang.tongTien}" type="currency"/></label>
                                        </div>
                                        <div class="form-group has-success">
                                            <label for="cc-name" class="control-label mb-1">Date</label>
                                            <label><fmt:formatDate pattern = "yyyy-MM-dd"  value = "${gioHang.thoiGian}" /></label>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label mb-1">Adress</label>
                                            <div class="col-12 col-md-12">
                                                <label> <c:out value="${gioHang.diaChi}"/></label>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label mb-1">Content</label>
                                            <div class="col-12 col-md-12">
                                                <textarea name="moTa"  id="textarea-input" rows="9" placeholder="Content..." class="form-control">

                                                </textarea>
                                            </div>
                                        </div>

                                        <div class="form-group has-success">
                                            <label for="cc-name" class="control-label mb-1">Status</label>

                                            <div class="col-12 col-md-12">
                                                <select name="trangThai" id="cc-name" class="form-control-sm form-control">

                                                    <option value="1" <c:if test= "${   1 == gioHang.trangThai }" >
                                                        selected
                                                    </c:if>>
                                                        Unconfirmed</option>
                                                    <option value="2"<c:if test= "${   2 == gioHang.trangThai }" >
                                                        selected
                                                    </c:if>>
                                                        Being transported </option>
                                                    <option value="3"<c:if test= "${   3 == gioHang.trangThai }" >
                                                        selected
                                                    </c:if>>
                                                        Successful receipt </option>
                                                    <option value="4"<c:if test= "${   4 == gioHang.trangThai }" >
                                                        selected
                                                    </c:if>>
                                                        No receipt</option>
                                                </select>
                                            </div>

                                        </div>
                                        <input name="maGioHang" value="${gioHang.maGioHang}" hidden readonly>
                                        <div>
                                            <button id="payment-button" type="submit" class="btn btn-lg btn-info btn-block">
                                                <i class="fa fa-lock fa-lg"></i>&nbsp;
                                                <span id="payment-button-amount">Xác nhận</span>
                                                <span id="payment-button-sending" style="display:none;">Sending…</span>
                                            </button>
                                            <a href="${pageContext.request.contextPath}/GioHangController?trangThai=All" class="btn btn-lg btn-info btn-block">
                                                <i class="fa fa-lock fa-lg"></i>&nbsp;
                                                <span >Tro Ve</span>

                                            </a>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-6">
                            <div class="card">
                                <div class="card-header">Cart Info</div>
                                <div class="card-body">

                                    <hr>


                                        <div class="form-group">
                                            <label  class="control-label mb-1">Info</label>
<c:if test="${not empty gioHangInfoList}">
                                            <c:forEach items = "${gioHangInfoList}" var = "gioHangInfo">
                                                <div class="col-lg-12">
                                                    <!-- single-product-wrap start -->
                                                    <div class="single-product-wrap">
                                                        <tr class="cart_item">
                                                            <div class="cart-product-name">
                                                                <c:out value="${gioHangInfo.hangHoa.tenSP}"/>
                                                                <strong class="product-quantity"><c:out value="${gioHangInfo.soLuong}"></c:out> </strong>
                                                            </div>
                                                        </tr>
                                                    </div>
                                                    <!-- single-product-wrap end -->
                                                </div>
                                            </c:forEach>
</c:if>

                                        </div>



                                </div>
                            </div>
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
<html>