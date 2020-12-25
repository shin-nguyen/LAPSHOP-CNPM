<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<header>
    <c:url value="/Client" var="url"></c:url>
    <!-- Begin Header Top Area -->
    <div class="header-top">
        <div class="container">
            <div class="row">
                <!-- Begin Header Top Left Area -->
                <div class="col-lg-3 col-md-4">
                    <div class="header-top-left">
                        <ul class="phone-wrap">
                            <li><span>Telephone Enquiry:</span><a href="#">(+84)918948074</a></li>
                        </ul>
                    </div>
                </div>
                <!-- Header Top Left Area End Here -->
                <!-- Begin Header Top Right Area -->
                <div class="col-lg-9 col-md-8">
                    <div class="header-top-right">
                        <ul class="ht-menu">
                            <!-- Begin Login-Register Area -->

                            <c:choose>
                                <c:when test="${sessionScope.taiKhoan == null}">

                                        <ul >
                                            <li><a href="${pageContext.request.contextPath }/Client/login.jsp">Login</a>
                                                | <a href="${pageContext.request.contextPath }/Client/register.jsp">Register</a></li>
                                        </ul>

                                </c:when>
                                <c:otherwise>

                                            <li><a href="${pageContext.request.contextPath }/Client/my-account.jsp">My Account</a> | <a
                                                    href="${pageContext.request.contextPath }/DangXuatController">Logout</a></li>
                                        </ul>

                                </c:otherwise>
                            </c:choose>


                            <!-- Login-Register End Here -->
                        </ul>
                    </div>
                </div>
                <!-- Header Top Right Area End Here -->
            </div>
        </div>
    </div>
    <!-- Header Top Area End Here -->
    <!-- Begin Header Middle Area -->
    <div class="header-middle pl-sm-0 pr-sm-0 pl-xs-0 pr-xs-0">
        <div class="container">
            <div class="row">
                <!-- Begin Header Logo Area -->
                <div class="col-lg-3">
                    <div class="logo pb-sm-30 pb-xs-30">
                        <a href="${pageContext.request.contextPath }/Client/index.jsp">
                            <img src="${pageContext.request.contextPath }/Client/images/menu/logo/1.png" alt="" style="height: 100%; width: 100%;">
                        </a>
                    </div>
                </div>
                <!-- Header Logo Area End Here -->
                <!-- Begin Header Middle Right Area -->
                <div class="col-lg-9 pl-0 ml-sm-15 ml-xs-15">
                    <!-- Begin Header Middle Searchbox Area  -->
                    <form action="#" class="hm-searchbox">
                        <input type="text" placeholder="Enter your search key ...">
                        <button class="li-btn" type="submit"><i class="fa fa-search"></i></button>
                    </form>
                    <!-- Header Middle Searchbox Area End Here -->
                    <!-- Begin Header Middle Right Area ********-->
                    <div class="header-middle-right">
                        <ul class="hm-menu">
                            <!-- Begin Header Middle Wishlist Area -->
                            <li class="hm-wishlist">
                                <a href="${pageContext.request.contextPath }/Client/wishlist.jsp">
                                    <c:choose>
                                    <c:when test="${sessionScope.yeuThichSet == null}">
                                        <span class="cart-item-count wishlist-item-count"></span>
                                        <i class="fa fa-heart-o"></i>
                                    </c:when>
                                    <c:otherwise>
                                        <span class="cart-item-count wishlist-item-count">
                                                ${sessionScope.yeuThichSet.size()}
                                        </span>
                                        <i class="fa fa-heart-o"></i>
                                    </c:otherwise>
                                    </c:choose>
                                </a>
                            </li>
                            <!-- Header Middle Wishlist Area End Here -->
                            <!-- Begin Header Mini Cart Area -->
                            <li class="hm-minicart">
                                <div class="hm-minicart-trigger">
                                    <span class="item-icon"></span>
                                    <span class="item-text">
                                        <c:out value = "${sessionScope.gioHang.tongTien}"/>
                                                    <span class="cart-item-count">
                                                        <c:out value = "${sessionScope.gioHangInfoSet.size()}"/></span>
                                    </span>
                                </div>
                                <span></span>
                                <div class="minicart">
                                    <ul class="minicart-product-list">

                                        <c:forEach items = "${sessionScope.gioHangInfoSet}" var = "gioHangInfo">
                                        <li>
                                            <a href="" class="minicart-product-image">
                                                <img src="images/product/small-size/5.jpg" alt="cart products">
                                            </a>
                                            <div class="minicart-product-details">
                                                <h6>
<%--                                                    <a href="">--%>
                                                    <c:out value="${gioHangInfo.primaryKey.hangHoa.tenSP}"></c:out>
<%--                                                    </a>--%>
                                                </h6>
                                            <span> <c:out value = "${gioHangInfo.hangHoa.giaBan}"/>$ x <c:out value = "${gioHangInfo.hangHoa.soLuong}"/> </span>
                                            </div>
                                            <button class="close" title="Remove"
                                                    href="${pageContext.request.contextPath}/GioHangInfoRemoveController?MaSP=${gioHangInfo.hangHoa.maSP}">
                                                <i class="fa fa-close"></i>
                                            </button>


                                        </li>
                                        </c:forEach>
<%--                                        <li>--%>
<%--                                            <a href="${pageContext.request.contextPath }/Client/single-product.jsp" class="minicart-product-image">--%>
<%--                                                <img src="${pageContext.request.contextPath }/Client/images/product/small-size/6.jpg" alt="cart products">--%>
<%--                                            </a>--%>
<%--                                            <div class="minicart-product-details">--%>
<%--&lt;%&ndash;                                                <h6><a href="${pageContext.request.contextPath }/Client/single-product.jsp">pro 2</a></h6>&ndash;%&gt;--%>
<%--&lt;%&ndash;                                                <span>40$ x 1</span>&ndash;%&gt;--%>
<%--                                                --%>
<%--                                                --%>
<%--                                            </div>--%>
<%--                                            <button class="close" title="Remove">--%>
<%--                                                <i class="fa fa-close"></i>--%>
<%--                                            </button>--%>
<%--                                        </li>--%>
                                    </ul>

<%--                                    <c:set var="total" value="${0}"/>--%>
<%--                                    <c:forEach var="article" items="${list}">--%>
<%--                                        <c:set var="total" value="${total + article.price}" />--%>
<%--                                    </c:forEach>--%>

                                    <p class="minicart-total">SUBTOTAL: <span><c:out value = "${sessionScope.gioHang.tongTien}"/></span></p>
                                    <div class="minicart-button">
                                        <a href="${pageContext.request.contextPath }/Client/shopping-cart.jsp" class="li-button li-button-fullwidth li-button-dark">
                                            <span>View Full Cart</span>
                                        </a>
                                        <a href="${pageContext.request.contextPath }/Client/checkout.jsp" class="li-button li-button-fullwidth">
                                            <span>Checkout</span>
                                        </a>
                                    </div>
                                </div>
                            </li>
                            <!-- Header Mini Cart Area End Here -->
                        </ul>
                    </div>
                    <!-- Header Middle Right Area End Here -->
                </div>
                <!-- Header Middle Right Area End Here -->
            </div>
        </div>
    </div>
    <!-- Header Middle Area End Here -->
    <!-- Begin Header Bottom Area -->
    <div class="header-bottom header-sticky d-none d-lg-block d-xl-block">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <!-- Begin Header Bottom Menu Area -->
                    <div class="hb-menu">
                        <nav>
                            <ul>
                                <li><a href="${pageContext.request.contextPath }/Client/index.jsp">Home</a></li>
                                <li><a href="${pageContext.request.contextPath }/Client/shop.jsp">Shop</a></li>
                                <li><a href="${pageContext.request.contextPath }/Client/about-us.jsp">About Us</a></li>
                                <li><a href="${pageContext.request.contextPath }/Client/contact.jsp">Contact</a></li>
                                <li><a href="#">Another</a></li>
                            </ul>
                        </nav>
                    </div>
                    <!-- Header Bottom Menu Area End Here -->
                </div>
            </div>
        </div>
    </div>
    <!-- Header Bottom Area End Here -->
    <!-- Begin Mobile Menu Area -->
    <div class="mobile-menu-area d-lg-none d-xl-none col-12">
        <div class="container">
            <div class="row">
                <div class="mobile-menu">
                </div>
            </div>
        </div>
    </div>
    <!-- Mobile Menu Area End Here -->
</header>
<!-- Header Area End Here -->