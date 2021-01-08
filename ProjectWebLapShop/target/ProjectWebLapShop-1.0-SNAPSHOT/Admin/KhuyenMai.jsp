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
    <title>Add Promotional</title>

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
                                    <strong>Promotional</strong>
                                </div>
                                <div class="card-body card-block">
                                    <%--                                    enctype="multipart/form-data"--%>
                                    <form action="${pageContext.request.contextPath}/KhuyenMaiAddController" method="post"  class="form-horizontal">

                                        <div class="row form-group">

                                            <div class="col-12 col-md-9">
                                                <c:choose>

                                                    <c:when test = "${not empty maKhuyenMai}">
                                                        <div class="col col-md-3">
                                                            <label  class=" form-control-label">Promotion ID </label>
                                                        </div>
                                                        <input type="text" name="maKhuyenMai" value="${maKhuyenMai}" placeholder="Promotion ID" class="form-control" required readonly>
                                                        <small class="form-text text-muted">*Bắt buộc</small>
                                                    </c:when>

                                                    <c:otherwise>
                                                        <input type="text" name="maKhuyenMai" value="0" placeholder="Mã KM" class="form-control" required readonly hidden>
                                                    </c:otherwise>
                                                </c:choose>

                                            </div>
                                        </div>

                                        <div class="row form-group">
                                            <div class="col col-md-3">
                                                <label class=" form-control-label">Promotional value</label>
                                            </div>
                                            <div class="col-12 col-md-9">
                                                <input type="text" value="${giaTriKhuyenMai}" name="giaTriKhuyenMai" placeholder="Promotional value" class="form-control" required>
                                            </div>
                                        </div>

                                        <fmt:formatDate var="varyeara" value="${batDau}" pattern="yyyy" />
                                        <fmt:formatDate var="varmontha" value="${batDau}" pattern="MM" />
                                        <fmt:formatDate var="vardaya" value="${batDau}" pattern="dd" />

                                        <div class="row form-group">
                                            <LABEL>Start date</LABEL>
                                            </br>

                                            <div class="col col-md-3">
                                                <label>Month</label>
                                                <select name="montha" >
                                                    <option value="1"   <c:if test= "${   1 == varmontha }" >
                                                        selected
                                                    </c:if>>
                                                        January</option>
                                                    <option value="2" <c:if test= "${   2 == varmontha }" >
                                                        selected
                                                    </c:if>>February</option>
                                                    <option value="3"<c:if test= "${   3 == varmontha }" >
                                                        selected
                                                    </c:if>>March</option>
                                                    <option value="4"<c:if test= "${   4 == varmontha }" >
                                                        selected
                                                    </c:if>>April</option>
                                                    <option value="5"<c:if test= "${   5 == varmontha }" >
                                                        selected
                                                    </c:if>>May</option>
                                                    <option value="6"<c:if test= "${   6  == varmontha }" >
                                                        selected
                                                    </c:if>>June</option>
                                                    <option value="7"<c:if test= "${   7 == varmontha }" >
                                                        selected
                                                    </c:if>>July</option>
                                                    <option value="8"<c:if test= "${   8 == varmontha }" >
                                                        selected
                                                    </c:if>>August</option>
                                                    <option value="9"<c:if test= "${   9 == varmontha }" >
                                                        selected
                                                    </c:if>>September</option>
                                                    <option value="10"<c:if test= "${   10 == varmontha }" >
                                                        selected
                                                    </c:if>>October</option>
                                                    <option value="11"<c:if test= "${   11 == varmontha }" >
                                                        selected
                                                    </c:if>>November</option>
                                                    <option value="12"<c:if test= "${   12 == varmontha }" >
                                                        selected
                                                    </c:if>>December</option>
                                                </select>
                                            </div>
                                            <div class="col-md-12 mb-20">
                                                <label>Day</label>
                                                <select name="daya">
                                                    <c:forEach begin="1" end="31" var="fordaya">
                                                        <option
                                                                <c:if test= "${   fordaya == vardaya}" >
                                                                    selected
                                                                </c:if>>
                                                            <c:out value="${fordaya}"/>
                                                        </option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                            <div class="col-md-12 mb-20">
                                                <label>Year</label>

                                                <select name="yeara">
                                                    <c:forEach begin="2000" end="2030" var="foryeara">
                                                        <option
                                                                <c:if test= "${   foryeara == varyeara }" >
                                                                    selected
                                                                </c:if>>
                                                            <c:out value="${foryeara}"/>
                                                        </option>
                                                    </c:forEach>
                                                </select>

                                            </div>
                                        </div>

                                        <fmt:formatDate var="varyearb" value="${ketThuc}" pattern="yyyy" />
                                        <fmt:formatDate var="varmonthb" value="${ketThuc}" pattern="MM" />
                                        <fmt:formatDate var="vardayb" value="${ketThuc}" pattern="dd" />

                                        <div class="row form-group">
                                            <LABEL>End date</LABEL>
                                            </br>
                                            <div class="col col-md-3">
                                                <label>Month</label>
                                                <select name="monthb" >
                                                    <option value="1"   <c:if test= "${   1 == varmonthb }" >
                                                        selected
                                                    </c:if>>
                                                        January</option>
                                                    <option value="2" <c:if test= "${   2 == varmonthb }" >
                                                        selected
                                                    </c:if>>February</option>
                                                    <option value="3"<c:if test= "${   3 == varmonthb }" >
                                                        selected
                                                    </c:if>>March</option>
                                                    <option value="4"<c:if test= "${   4 == varmonthb }" >
                                                        selected
                                                    </c:if>>April</option>
                                                    <option value="5"<c:if test= "${   5 == varmonthb }" >
                                                        selected
                                                    </c:if>>May</option>
                                                    <option value="6"<c:if test= "${   6  == varmonthb }" >
                                                        selected
                                                    </c:if>>June</option>
                                                    <option value="7"<c:if test= "${   7 == varmonthb }" >
                                                        selected
                                                    </c:if>>July</option>
                                                    <option value="8"<c:if test= "${   8 == varmonthb }" >
                                                        selected
                                                    </c:if>>August</option>
                                                    <option value="9"<c:if test= "${   9 == varmonthb }" >
                                                        selected
                                                    </c:if>>September</option>
                                                    <option value="10"<c:if test= "${   10 == varmonthb }" >
                                                        selected
                                                    </c:if>>October</option>
                                                    <option value="11"<c:if test= "${   11 == varmonthb }" >
                                                        selected
                                                    </c:if>>November</option>
                                                    <option value="12"<c:if test= "${   12 == varmonthb }" >
                                                        selected
                                                    </c:if>>December</option>
                                                </select>
                                            </div>
                                            <div class="col-md-12 mb-20">
                                                <label>Day</label>
                                                <select name="dayb">
                                                    <c:forEach begin="1" end="31" var="fordayb">
                                                        <option
                                                                <c:if test= "${   fordayb == vardayb}" >
                                                                    selected
                                                                </c:if>>
                                                            <c:out value="${fordayb}"/>
                                                        </option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                            <div class="col-md-12 mb-20">
                                                <label>Year</label>

                                                <select name="yearb">
                                                    <c:forEach begin="2000" end="2030" var="foryearb">
                                                        <option
                                                                <c:if test= "${   foryearb == varyearb }" >
                                                                    selected
                                                                </c:if>>
                                                            <c:out value="${foryearb}"/>
                                                        </option>
                                                    </c:forEach>
                                                </select>

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
                                            <a type="reset" class="btn btn-danger btn-sm" href="${pageContext.request.contextPath}/Admin/KhuyenMaiList.jsp">
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