<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html class="no-js" lang="zxx">

<head>
    <c:url value="/Admin" var="url"></c:url>

    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
<%--    <meta name="author" content="Hau Nguyen">--%>
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <title>Dashboard</title>

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
<%--                                    enctype="multipart/form-data"--%>
                                    <form action="${pageContext.request.contextPath}/HangHoaAddController" method="post"  class="form-horizontal"  enctype="multipart/form-data">

                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label  class=" form-control-label">Mã sản phẩm</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text" name="maSP" placeholder="MaSP" class="form-control">
                                                <small class="form-text text-muted">*Bắt buộc</small>
                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label class=" form-control-label">Mã nhà sản xuất</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text"  name="maNSX" placeholder="Ma Nha SX" class="form-control">
                                            </div>
                                        </div><div class="row form-group">
                                        <div class="col col-md-3">
                                            <label  class=" form-control-label">Tên sản phẩm</label>
                                        </div>
                                        <div class="col-12 col-md-9">
                                            <input type="text"  name="tenSP" placeholder="" class="form-control">

                                        </div>
                                    </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label class=" form-control-label">Đơn giá</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text"  name="giaGoc" placeholder="" class="form-control">

                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label class=" form-control-label">Gia Ban</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text"  name="giaBan" placeholder="" class="form-control">

                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label  class=" form-control-label">Số lượng</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text" name="soLuong" placeholder="" class="form-control">

                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="textarea-input" class=" form-control-label">Ghi chú</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <textarea name="moTa" id="textarea-input" rows="9" placeholder="Content..." class="form-control"></textarea>
                                            </div>
                                        </div>

<%--                                        <div class="row form-group">--%>
<%--                                            <div class="col col-md-3">--%>
<%--                                                <label for="text-input" class=" form-control-label">Số lượng</label>--%>
<%--                                            </div>--%>
<%--                                            <div class="col-12 col-md-9">--%>
<%--                                                <input type="text" id="text-input" name="cpu" placeholder="" class="form-control">--%>

<%--                                            </div>--%>
<%--                                        </div>--%>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label  class=" form-control-label">cpu</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text" name="cpu" placeholder="" class="form-control">

                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label  class=" form-control-label">ram</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text"  name="ram" placeholder="" class="form-control">

                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label class=" form-control-label">ocung</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text"  name="ocung" placeholder="" class="form-control">

                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label  class=" form-control-label">manhinh</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text"  name="manHinh" placeholder="" class="form-control">

                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label  class=" form-control-label">pin</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text" name="pin" placeholder="" class="form-control">

                                            </div>
                                        </div>
<%--                                        <div class="row form-group">--%>
<%--                                            <div class="col col-md-3">--%>
<%--                                                <label for="selectSm" class=" form-control-label">CPU</label>--%>
<%--                                            </div>--%>
<%--                                            <div class="col-12 col-md-9">--%>
<%--                                                <select name="selectSm" id="SelectLm" class="form-control-sm form-control">--%>
<%--                                                    <option value="0">Please select</option>--%>
<%--                                                    <option value="1">Option #1</option>--%>
<%--                                                    <option value="2">Option #2</option>--%>
<%--                                                    <option value="3">Option #3</option>--%>
<%--                                                    <option value="4">Option #4</option>--%>
<%--                                                    <option value="5">Option #5</option>--%>
<%--                                                </select>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                        <div class="row form-group">--%>
<%--                                            <div class="col col-md-3">--%>
<%--                                                <label for="selectSm" class=" form-control-label">RAM</label>--%>
<%--                                            </div>--%>
<%--                                            <div class="col-12 col-md-9">--%>
<%--                                                <select name="selectSm" id="SelectLm" class="form-control-sm form-control">--%>
<%--                                                    <option value="0">Please select</option>--%>
<%--                                                    <option value="1">Option #1</option>--%>
<%--                                                    <option value="2">Option #2</option>--%>
<%--                                                    <option value="3">Option #3</option>--%>
<%--                                                    <option value="4">Option #4</option>--%>
<%--                                                    <option value="5">Option #5</option>--%>
<%--                                                </select>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                        <div class="row form-group">--%>
<%--                                            <div class="col col-md-3">--%>
<%--                                                <label for="selectSm" class=" form-control-label">Ổ Cứng</label>--%>
<%--                                            </div>--%>
<%--                                            <div class="col-12 col-md-9">--%>
<%--                                                <select name="selectSm" id="SelectLm" class="form-control-sm form-control">--%>
<%--                                                    <option value="0">Please select</option>--%>
<%--                                                    <option value="1">Option #1</option>--%>
<%--                                                    <option value="2">Option #2</option>--%>
<%--                                                    <option value="3">Option #3</option>--%>
<%--                                                    <option value="4">Option #4</option>--%>
<%--                                                    <option value="5">Option #5</option>--%>
<%--                                                </select>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                        <div class="row form-group">--%>
<%--                                            <div class="col col-md-3">--%>
<%--                                                <label for="selectSm" class=" form-control-label">Màn hình</label>--%>
<%--                                            </div>--%>
<%--                                            <div class="col-12 col-md-9">--%>
<%--                                                <select name="selectSm" id="SelectLm" class="form-control-sm form-control">--%>
<%--                                                    <option value="0">Please select</option>--%>
<%--                                                    <option value="1">Option #1</option>--%>
<%--                                                    <option value="2">Option #2</option>--%>
<%--                                                    <option value="3">Option #3</option>--%>
<%--                                                    <option value="4">Option #4</option>--%>
<%--                                                    <option value="5">Option #5</option>--%>
<%--                                                </select>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                        <div class="row form-group">--%>
<%--                                            <div class="col col-md-3">--%>
<%--                                                <label for="selectSm" class=" form-control-label">PIN</label>--%>
<%--                                            </div>--%>
<%--                                            <div class="col-12 col-md-9">--%>
<%--                                                <select name="selectSm" id="SelectLm" class="form-control-sm form-control">--%>
<%--                                                    <option value="0">Please select</option>--%>
<%--                                                    <option value="1">Option #1</option>--%>
<%--                                                    <option value="2">Option #2</option>--%>
<%--                                                    <option value="3">Option #3</option>--%>
<%--                                                    <option value="4">Option #4</option>--%>
<%--                                                    <option value="5">Option #5</option>--%>
<%--                                                </select>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                        <div class="row form-group">--%>
<%--                                            <div class="col col-md-3">--%>
<%--                                                <label for="disabledSelect" class=" form-control-label">Disabled Select</label>--%>
<%--                                            </div>--%>
<%--                                            <div class="col-12 col-md-9">--%>
<%--                                                <select name="disabledSelect" id="disabledSelect" disabled="" class="form-control">--%>
<%--                                                    <option value="0">Please select</option>--%>
<%--                                                    <option value="1">Option #1</option>--%>
<%--                                                    <option value="2">Option #2</option>--%>
<%--                                                    <option value="3">Option #3</option>--%>
<%--                                                </select>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>


                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="file-input" class=" form-control-label">File input</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="file" id="file-input" name="photo" class="form-control-file" size="50" >
                                            </div>
                                        </div>

                                        <div class="card-footer">
                                            <button type="submit" class="btn btn-primary btn-sm">
                                                <i class="fa fa-dot-circle-o"></i> Thêm
                                            </button>
<%--                                            <button type="reset" class="btn btn-danger btn-sm">--%>
<%--                                                <i class="fa fa-ban"></i> Hủy--%>
<%--                                            </button>--%>
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