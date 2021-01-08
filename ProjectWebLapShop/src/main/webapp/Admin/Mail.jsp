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
    <title>ProductsList</title>

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
                                <div class="card-header">Send Mail </div>
                                <div class="card-body">
                                    <hr>
                                    <form action="${pageContext.request.contextPath}/TraLoiAddController" method="post" novalidate="novalidate">
                                        <div class="form-group">
                                            <label  class="control-label mb-1">Name</label>
                                            <c:choose>

                                                <c:when test = "${not empty hopThuTraLoi.tenNguoiGui}">
                                                    <label  class="control-label mb-1"><c:out value="${hopThuTraLoi.tenNguoiGui}"/></label>
                                                </c:when>

                                                <c:otherwise>
                                                    <label  class="control-label mb-1"><c:out value="${sessionScope.taiKhoan.hoTen}"/></label>
                                                </c:otherwise>
                                            </c:choose>

                                        </div>
                                        <div class="form-group has-success">
                                            <div class="form-group">
                                                <label  class="control-label mb-1">Title</label>
                                                <input  name="tieuDeTraLoi" type="text" class="form-control" aria-required="true" aria-invalid="false" value="${hopThuTraLoi.tieuDe}">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="control-label mb-1">Content</label>
                                            <div class="col-12 col-md-12">
                                                <textarea name="noiDungTraLoi"  id="textarea-input" rows="9" placeholder="Content..." class="form-control">
                                                </textarea>
                                            </div>
                                        </div>

                                        <input name="maHopThu" value="${hopThu.maHopThu}" hidden readonly>

                                        <input name="trangThai" value="${hopThu.trangThai}" hidden readonly>
                                        <div>
                                            <button id="payment-button" type="submit" class="btn btn-lg btn-info btn-block">
                                                <i class="fa fa-lock fa-lg"></i>&nbsp;
                                                <span id="payment-button-amount">Oke</span>
                                                <span id="payment-button-sending" style="display:none;">Sending…</span>
                                            </button>
                                            <a href="${pageContext.request.contextPath}/TraLoiAddController?trangThai=All" class="btn btn-lg btn-info btn-block">
                                                <i class="fa fa-lock fa-lg"></i>&nbsp;
                                                <span >Cancel</span>

                                            </a>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-6">
                            <div class="card">
                                <div class="card-header">Receive mail</div>
                                <div class="card-body">

                                    <hr>


                                    <div class="form-group">
                                        <label  class="control-label mb-1">Name</label>
                                        <label  class="control-label mb-1"><c:out value="${hopThu.tenNguoiGui}"/></label>
                                    </div>
                                    <div class="form-group has-success">
                                        <div class="form-group">
                                            <label  class="control-label mb-1">Title</label>
                                            <label ><c:out value="${hopThu.tieuDe}"/></label>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="control-label mb-1">Content</label>
                                        <div class="col-12 col-md-12">
                                               <label ><c:out value="${hopThu.noiDung}" /></label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label mb-1">Mail</label>
                                        <div class="col-12 col-md-12">
                                            <label ><c:out value="${hopThu.email}" /></label>
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