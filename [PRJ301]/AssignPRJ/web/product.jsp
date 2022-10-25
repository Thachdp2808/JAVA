<%-- 
    Document   : product
    Created on : Mar 14, 2022, 9:17:29 PM
    Author     : Happy-2001
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Colo Shop Product</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="Colo Shop Template">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
        <link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
        <link rel="stylesheet" type="text/css" href="plugins/jquery-ui-1.12.1.custom/jquery-ui.css">
        <link rel="stylesheet" type="text/css" href="styles/categories_styles.css">
        <link rel="stylesheet" type="text/css" href="styles/categories_responsive.css">
    </head>

    <body>

        <div class="super_container">

            <!-- Header -->
	<!-- Header -->
	<header class="header trans_300">
		<!-- Top Navigation -->
		<div class="top_nav">
			<div class="container">
				<div class="row">
					<div class="col-md-6">
						<div class="top_nav_left">free shipping on all u.s orders over $50</div>
					</div>
					<div class="col-md-6 text-right">
						<div class="top_nav_right">
							<ul class="top_nav_menu">
								<!-- Currency / Language / My Account -->
								<li class="currency">
									<a href="#">usd</a>
								</li>
								<li class="language">
									<a href="#">English</a>
								</li>
                                                                <c:if test="${roll==2}">
                                                                    <li class="account">
									<a href="manager">Manager</a>
								</li>
                                                                </c:if>
                                                                <c:if test="${account!=null}">
                                                                    <li class="account ">
									<a href="">Hello ${disname}</a>
								</li>
                                                                <li class="account">
									<a href="login">Logout</a>
								</li>
                                                                </c:if>
                                                                <c:if test="${account==null}">
								<li class="account">
									<a href="login">Login</a>
								</li>
                                                                </c:if>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Main Navigation -->

		<div class="main_nav_container">
			<div class="container">
				<div class="row">
					<div class="col-lg-12 text-right">
						<div class="logo_container">
							<a href="home">colo<span>shop</span></a>
						</div>
						<nav class="navbar">
							<ul class="navbar_menu">
								<li><a href="home">home</a></li>
								<li><a href="productcontrol">Shop</a></li>
								<li><a href="#">contact</a></li>
							</ul>
							<ul class="navbar_user">
                                                            <form action="Search">
                                                            <li><input type="text" placeholder="Search.." name="search"> <button><i  class="fa fa-search" aria-hidden="true"></i></li>
								<li><a href="login"><i class="fa fa-user" aria-hidden="true"></i></a></li>
								<li class="checkout">
									<a href="Checkout">
										<i class="fa fa-shopping-cart" aria-hidden="true"></i>
										<span id="checkout_items" class="checkout_items">${carts.size()}</span>
									</a>
								</li>
							</ul>
							<div class="hamburger_container">
								<i class="fa fa-bars" aria-hidden="true"></i>
							</div>
						</nav>
					</div>
				</div>
			</div>
		</div>

	</header>
            <div class="container product_section_container">
                <div class="row">
                    <div class="col product_section clearfix">

                        <!-- Breadcrumbs -->

                        <div class="breadcrumbs d-flex flex-row align-items-center">
                            <ul>
                                <li><a href="home">Home</a></li>
                                <li class="active"><a href="productcontrol"><i class="fa fa-angle-right" aria-hidden="true"></i>Shop</a></li>
                            </ul>
                        </div>

                        <!-- Sidebar -->

                        <div class="sidebar">
                            <div class="sidebar_section">
                                <div class="sidebar_title">
                                    <h5>Product Category</h5>
                                </div>
                                <ul class="sidebar_categories">
                                    <c:forEach items="${ListC}" var="c">
                                        <li class="list-group-item"><a href="filter-category?id=${c.id}">${c.name}</a></li>
                                        </c:forEach>
                                </ul>
                            </div>
                        </div>

                        <!-- Main Content -->

                        <div class="main_content">

                            <!-- Products -->

                            <div class="products_iso">
                                <div class="row">
                                    <div class="col">

                                        <!-- Product Sorting -->

                                        <div class="product_sorting_container product_sorting_container_top">
                                            <ul class="product_sorting">
                                                <li>
                                                    <span class="type_sorting_text">Default Sorting</span>
                                                    <i class="fa fa-angle-down"></i>
                                                    <ul class="sorting_type">
                                                        <li class="type_sorting_btn" data-isotope-option='{ "sortBy": "original-order" }'><span>Default Sorting</span></li>
                                                        <li class="type_sorting_btn" data-isotope-option='{ "sortBy": "price" }'><span>Price</span></li>
                                                        <li class="type_sorting_btn" data-isotope-option='{ "sortBy": "name" }'><span>Product Name</span></li>
                                                    </ul>
                                                </li>
                                            </ul>
                                            <div class="pages d-flex flex-row align-items-center">
                                                
                                                <c:choose>
                                                    <c:when test="${ListP==null || ListP.size()==0}">Not Found</c:when>
                                                    <c:otherwise>
                                                        
                                                        <nav aria-label="Page navigation example">
                                                            <ul class="pagination justify-content-end">
                                                                <li class="page-item ${page==1?"disabled":""}"><a class="page-link" href="productcontrol?page=${page-1}" >Previous</a></li>
                                                                    <c:forEach begin="1" end="${totalPage}" var="i">
                                                                    <li class="page-item ${i == page?"active":""}"><a class="page-link" href="productcontrol?page=${i}">${i}</a></li>
                                                                    </c:forEach>
                                                                <li class="page-item ${page==totalPage?"disabled":""}"><a class="page-link "  href="productcontrol?page=${page+1}">Next</a></li>

                                                            </ul>
                                                        </nav>
                                                                
                                                    </c:otherwise>
                                                </c:choose>
                                                    
                                            </div>

                                        </div>

                                        <!-- Product Grid -->

                                        <div class="product-grid">

                                            <!-- Product 3 -->
                                            
                                            <c:forEach items="${ListP}" var="P">
                                                
                                                <div class="product-item women">
                                                    
                                                    <div class="product product_filter">
                                                        <a href="item?Product=${P.id}">
                                                        <div class="product_image">
                                                            <img src="${P.imageURL}" alt="">
                                                        </div>
                                                        <div class="favorite"></div>
                                                        <div class="product_info">
                                                            <h6 class="product_name"><a href="item">${P.name}</a></h6>
                                                            <div class="product_price">${P.price} $</div>
                                                            
                                                            
                                                        </div>
                                                            </a>
                                                    </div>
                                                    <div class="red_button add_to_cart_button"><a href="Cart?ProductID=${P.id}">add to cart</a></div>
                                                    </a>
                                                </div>
                                                
                                            </c:forEach>
                                            <!-- Product Sorting -->
                                        </div>
                                        <div class="product_sorting_container product_sorting_container_bottom clearfix">
                                            <ul class="product_sorting">
                                                <li>
                                                    <span>Show:</span>
                                                    <span class="num_sorting_text">04</span>
                                                    <i class="fa fa-angle-down"></i>
                                                    <ul class="sorting_num">
                                                        <li class="num_sorting_btn"><span>01</span></li>
                                                        <li class="num_sorting_btn"><span>02</span></li>
                                                        <li class="num_sorting_btn"><span>03</span></li>
                                                        <li class="num_sorting_btn"><span>04</span></li>
                                                    </ul>
                                                </li>
                                            </ul>
                                            <span class="showing_results">Showing 1–3 of 12 results</span>
                                            <div class="pages d-flex flex-row align-items-center">
                                                <c:choose>
                                                    <c:when test="${ListP==null || ListP.size()==0}">Not Found</c:when>
                                                    <c:otherwise>
                                                        <nav aria-label="Page navigation example">
                                                            <ul class="pagination justify-content-end">
                                                                <li class="page-item ${page==1?"disabled":""}"><a class="page-link" href="productcontrol?page=${page-1}" >Previous</a></li>
                                                                    <c:forEach begin="1" end="${totalPage}" var="i">
                                                                    <li class="page-item ${i == page?"active":""}"><a class="page-link" href="productcontrol?page=${i}">${i}</a></li>
                                                                    </c:forEach>
                                                                <li class="page-item ${page==totalPage?"disabled":""}"><a class="page-link "  href="productcontrol?page=${page+1}">Next</a></li>

                                                            </ul>
                                                        </nav>
                                                    </c:otherwise>
                                                </c:choose>
                                            </div>

                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Benefit -->

            <div class="benefit">
                <div class="container">
                    <div class="row benefit_row">
                        <div class="col-lg-3 benefit_col">
                            <div class="benefit_item d-flex flex-row align-items-center">
                                <div class="benefit_icon"><i class="fa fa-truck" aria-hidden="true"></i></div>
                                <div class="benefit_content">
                                    <h6>free shipping</h6>
                                    <p>Suffered Alteration in Some Form</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 benefit_col">
                            <div class="benefit_item d-flex flex-row align-items-center">
                                <div class="benefit_icon"><i class="fa fa-money" aria-hidden="true"></i></div>
                                <div class="benefit_content">
                                    <h6>cach on delivery</h6>
                                    <p>The Internet Tend To Repeat</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 benefit_col">
                            <div class="benefit_item d-flex flex-row align-items-center">
                                <div class="benefit_icon"><i class="fa fa-undo" aria-hidden="true"></i></div>
                                <div class="benefit_content">
                                    <h6>45 days return</h6>
                                    <p>Making it Look Like Readable</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 benefit_col">
                            <div class="benefit_item d-flex flex-row align-items-center">
                                <div class="benefit_icon"><i class="fa fa-clock-o" aria-hidden="true"></i></div>
                                <div class="benefit_content">
                                    <h6>opening all week</h6>
                                    <p>8AM - 09PM</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Newsletter -->

            <div class="newsletter">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="newsletter_text d-flex flex-column justify-content-center align-items-lg-start align-items-md-center text-center">
                                <h4>Newsletter</h4>
                                <p>Subscribe to our newsletter and get 20% off your first purchase</p>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="newsletter_form d-flex flex-md-row flex-column flex-xs-column align-items-center justify-content-lg-end justify-content-center">
                                <input id="newsletter_email" type="text" placeholder="Your email" required="required" data-error="Valid email is required.">
                                <button id="newsletter_submit"  class="newsletter_submit_btn trans_300" value="Submit">subscribe</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Footer -->

            <footer class="footer">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="footer_nav_container d-flex flex-sm-row flex-column align-items-center justify-content-lg-start justify-content-center text-center">
                                <ul class="footer_nav">
                                    <li><a href="#">Blog</a></li>
                                    <li><a href="#">FAQs</a></li>
                                    <li><a href="contact.html">Contact us</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="footer_social d-flex flex-row align-items-center justify-content-lg-end justify-content-center">
                                <ul>
                                    <li><a href="https://www.facebook.com/profile.php?id=100014453103092" target="_blank"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                                    <li><a href="https://github.com/Happy-2001" target="_blank"><i class="fa fa-github" aria-hidden="true"></i></a></li>
                                    <li><a href="https://www.instagram.com/th.buta/" target="_blank"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
                                    <li><a href="https://www.pinterest.com/Dinos0801/" target="_blank"><i class="fa fa-pinterest" aria-hidden="true"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="footer_nav_container">
                                <div class="cr">©2020 All Rights Reserverd. Made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://github.com/Happy-2001">Đào Phúc Thạch</a> &amp; distributed by <a href="home">ColoShop</a></div>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>

        </div>

        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="styles/bootstrap4/popper.js"></script>
        <script src="styles/bootstrap4/bootstrap.min.js"></script>
        <script src="plugins/Isotope/isotope.pkgd.min.js"></script>
        <script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
        <script src="plugins/easing/easing.js"></script>
        <script src="plugins/jquery-ui-1.12.1.custom/jquery-ui.js"></script>
        <script src="js/categories_custom.js"></script>
    </body>

</html>

