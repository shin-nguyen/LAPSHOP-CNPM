<%@ page contentType="text/html;charset=UTF-8" language="java" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html class="no-js" lang="zxx">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
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
<body class="animsition"><jsp:include page="/Admin/HeaderAdmin.jsp" />
<jsp:include page="/Admin/NavigationAdmin.jsp" />
<div class="page-wrapper">
    <!-- MAIN CONTENT-->
    <div class="page-container">
        <div class="main-content">
            <div class="section__content section__content--p30">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-header">
                                    <strong>Basic Form</strong> Elements
                                </div>
                                <div class="card-body card-block">
                                    <form action="" method="post" enctype="multipart/form-data" class="form-horizontal">
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label class=" form-control-label">Mã sản phẩm</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <p class="form-control-static">Mã Sp</p>
                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="text-input" class=" form-control-label">Tên sản phẩm</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text" id="text-input" name="text-input" placeholder="" class="form-control">

                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="text-input" class=" form-control-label">Giá tiền</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text" id="text-input" name="text-input" placeholder="" class="form-control">

                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="email-input" class=" form-control-label">Nhà sản xuất</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="email" id="email-input" name="email-input" placeholder="" class="form-control">

                                            </div>
                                        </div>

                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="textarea-input" class=" form-control-label">Ghi chú </label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <textarea name="textarea-input" id="textarea-input" rows="9" placeholder="Content..." class="form-control"></textarea>
                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="selectSm" class=" form-control-label">CPU</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <select name="selectSm" id="SelectLm" class="form-control-sm form-control">
                                                    <option value="0">Please select</option>
                                                    <option value="1">Option #1</option>
                                                    <option value="2">Option #2</option>
                                                    <option value="3">Option #3</option>
                                                    <option value="4">Option #4</option>
                                                    <option value="5">Option #5</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="selectSm" class=" form-control-label">RAM</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <select name="selectSm" id="SelectLm" class="form-control-sm form-control">
                                                    <option value="0">Please select</option>
                                                    <option value="1">Option #1</option>
                                                    <option value="2">Option #2</option>
                                                    <option value="3">Option #3</option>
                                                    <option value="4">Option #4</option>
                                                    <option value="5">Option #5</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="selectSm" class=" form-control-label">Ổ cứng</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <select name="selectSm" id="SelectLm" class="form-control-sm form-control">
                                                    <option value="0">Please select</option>
                                                    <option value="1">Option #1</option>
                                                    <option value="2">Option #2</option>
                                                    <option value="3">Option #3</option>
                                                    <option value="4">Option #4</option>
                                                    <option value="5">Option #5</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="selectSm" class=" form-control-label">Màn hình</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <select name="selectSm" id="SelectLm" class="form-control-sm form-control">
                                                    <option value="0">Please select</option>
                                                    <option value="1">Option #1</option>
                                                    <option value="2">Option #2</option>
                                                    <option value="3">Option #3</option>
                                                    <option value="4">Option #4</option>
                                                    <option value="5">Option #5</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="selectSm" class=" form-control-label">Pin</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <select name="selectSm" id="SelectLm" class="form-control-sm form-control">
                                                    <option value="0">Please select</option>
                                                    <option value="1">Option #1</option>
                                                    <option value="2">Option #2</option>
                                                    <option value="3">Option #3</option>
                                                    <option value="4">Option #4</option>
                                                    <option value="5">Option #5</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="disabledSelect" class=" form-control-label">Mã hàng hóa</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <select name="disabledSelect" id="disabledSelect" disabled="" class="form-control">
                                                    <option value="0">Please select</option>
                                                    <option value="1">Option #1</option>
                                                    <option value="2">Option #2</option>
                                                    <option value="3">Option #3</option>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label class=" form-control-label">Khuyến mãi</label>
                                            </div>
                                            <div class="col col-md-9">
                                                <div class="form-check">
                                                    <div class="radio">
                                                        <label for="radio1" class="form-check-label ">
                                                            <input type="radio" id="radio1" name="radios" value="option1" class="form-check-input">Mã KM1
                                                        </label>
                                                    </div>
                                                    <div class="radio">
                                                        <label for="radio2" class="form-check-label ">
                                                            <input type="radio" id="radio2" name="radios" value="option2" class="form-check-input">Mã KM2
                                                        </label>
                                                    </div>
                                                    <div class="radio">
                                                        <label for="radio3" class="form-check-label ">
                                                            <input type="radio" id="radio3" name="radios" value="option3" class="form-check-input">Mã KM3
                                                        </label>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label for="file-input" class=" form-control-label">hình ảnh</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="file" id="file-input" name="file-input" class="form-control-file">
                                            </div>
                                        </div>
                                        <div class="card-footer">
                                            <button type="submit" class="btn btn-primary btn-sm">
                                                <i class="fa fa-dot-circle-o"></i> Edit
                                            </button>
                                            <button type="reset" class="btn btn-danger btn-sm">
                                                <i class="fa fa-ban"></i> Return
                                            </button>
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