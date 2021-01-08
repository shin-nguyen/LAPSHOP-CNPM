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
<%--    <meta name="author" content="">--%>
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <title>Add Product</title>

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
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-header">
                                    <strong>Add New Product</strong>
                                </div>
                                <div class="card-body card-block">

                                    <form action="${pageContext.request.contextPath}/HangHoaAddController" method="post"  class="form-horizontal"  enctype="multipart/form-data">

                                        <div class="row form-group">
                                            <div class="col col-md-3">

                                            </div>
                                            <div class="col-12 col-md-9">

                                                <c:choose>

                                                    <c:when test = "${(not empty maSP)}">

                                                        <input type="text" name="maSP" value="${maSP}"  class="form-control" hidden readonly required>

                                                    </c:when>

                                                    <c:otherwise>
                                                        <input type="text" name="maSP" value="0" class="form-control" readonly hidden required>
                                                    </c:otherwise>
                                                </c:choose>


                                            </div>
                                        </div>

                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label class=" form-control-label">Manufacturer's <label style="color: #e50606" ><c:out value="${nsxError}"/> </label> </label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text" value="${tenNSX}" name="tenNSX" placeholder="Manufacturer's Name" class="form-control">
                                            </div>
                                        </div>
                                        <div class="row form-group">

                                        <div class="col col-md-3">
                                            <label  class=" form-control-label">Product Name</label>
                                        </div>
                                        <div class="col-12 col-md-9">
                                            <input type="text"  name="tenSP" value="${tenSP}" placeholder="Product Name" class="form-control" required>
                                        </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label class=" form-control-label">Original price of the product</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text" value="${giaGoc}"  name="giaGoc" placeholder="Original price of the product " class="form-control" required>

                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label class=" form-control-label">Product selling price</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text" value="${giaBan}" name="giaBan" placeholder="Product selling price" class="form-control" required>

                                            </div>
                                        </div>

                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="textarea-input" class=" form-control-label">Description</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <textarea name="moTa"  id="textarea-input" rows="9" placeholder="description" class="form-control"></textarea>
                                            </div>
                                        </div>


                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label  class=" form-control-label">CPU</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text" value="${cpu}" name="cpu" placeholder="CPU" class="form-control" required>

                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label  class=" form-control-label">RAM</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text" value="${ram}" name="ram" placeholder="RAM" class="form-control" required>

                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label class=" form-control-label">Hard Disk</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text" value="${ocung}" name="ocung" placeholder="Hard Disk" class="form-control" required>

                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label  class=" form-control-label">Display</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text"  name="manHinh" value="${manHinh}" placeholder="Display" class="form-control" required>

                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label  class=" form-control-label">PIN</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text" name="pin" value="${pin}" placeholder="PIN" class="form-control" required>

                                            </div>
                                        </div>

                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="file-input" class=" form-control-label">Add Image</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="file" id="file-input" name="photo" class="form-control-file"  >
                                            </div>
                                        </div>

                                        <c:if test="${not empty ThongBao}">
                                            <script>
                                                window.addEventListener("load",function(){
                                                    alert("${ThongBao}");
                                                })
                                            </script>
                                        </c:if>

                                        <div class="card-footer">
                                            <button type="submit" class="btn btn-primary btn-sm">
                                                <i class="fa fa-dot-circle-o"></i> Add
                                            </button>
                                            <a type="reset" class="btn btn-danger btn-sm"
                                             href="${pageContext.request.contextPath}/Admin/ProductsList.jsp">
                                                <i class="fa fa-ban"></i> Cancel
                                            </a>
                                        </div>
                                    </form>
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
</html>