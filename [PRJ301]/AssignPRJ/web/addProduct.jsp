<%-- 
    Document   : updateProduct
    Created on : Mar 17, 2022, 4:03:16 AM
    Author     : Happy-2001
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
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
        <!-- Header -->
	<header class="header trans_300">
		<!-- Top Navigation -->
		

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
								<li><a href="productcontrol">Product</a></li>
								<li><a href="#">contact</a></li>
							</ul>
							<ul class="navbar_user">
								<li><a href="#"><i class="fa fa-search" aria-hidden="true"></i></a></li>
								<li><a href="login"><i class="fa fa-user" aria-hidden="true"></i></a></li>
								<li class="checkout">
									<a href="#">
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
        <section class="py-5 px-4 px-lg-5 " style="padding-top:7rem !important;min-height: 500px">                                                              
        <form action="addProduct" method="POST">
            <table>
                <tr>
                    <td>ID:</td><td><input type="text" name="id" /></td>
                </tr>
                <tr>
                    <td>Name:</td><td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>Price:</td><td><input type="text" name="price"/></td>
                </tr>
                <tr>
                    <td>Quantity:</td><td><input type="text" name="quantity"/></td>
                </tr>
                <tr>
                    <td>Description:</td><td><input type="text" name="des"/></td>
                </tr>
                <tr>
                    <td>ImageURL:</td><td><input type="text" name="image"/></td>
                </tr>
                <tr>
                    <td>Created_Date:</td><td><input type="date" name="date"/></td>
                </tr>
                <tr>
                    <td>CategoryID:</td><td><input type="text" name="categoryid"/></td>
                </tr>
                
                
                <tr><td><input type="submit" value="Create"/></td></tr>
            </table>
        </form>
        </section>
                                                                        <!-- Footer -->

       <footer class="footer" style="background-color: #ccc">
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
    </body>
</html>
