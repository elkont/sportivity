<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">

<head>
    <title>Welcome to Sportivity | sportivity.com</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="shortcut icon" href="/images/favicon.ico">

    <link rel="stylesheet" type="text/css" th:href="@{/css/login.css}" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link th:href="@{/css/style.css}" rel='stylesheet' type='text/css' />
    <script rel="stylesheet" stype="text/css" href="home.css"></script>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">


</head>

<body>
<div class="header">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="header-left">
                    <div class="logo">
                        <a href="/"><img src="/images/logo.png" alt=""/></a>
                    </div>
                    <div class="menu site-name">
                        <span>SPORTIVITY</span>
                    </div>
                    <div class="menu">
                        <a class="toggleMenu" href="#"><img src="/images/nav.png" alt="" /></a>
                        <ul class="nav" id="nav">
                            <li><a th:href="@{/about}">About</a></li>
                            <li><a th:href="@{/contact}">Contact</a></li>
                            <div class="clear"></div>
                        </ul>
                        <script type="text/javascript" src="/js/responsive-nav.js"></script>
                    </div>
                    <div class="clear"></div>
                </div>

                <div class="header_right">

                    <span class="navbar-text navbar-right" th:if="${userMessage}" th:text="${userMessage}"></span>
                    <% if(session.getAttribute("name")==null) { %>
                    <li><a href="signup.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>

                    <% } %>
                    <% if(session.getAttribute("name")!=null) { %>
                    <li><a href="Logout.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>

                    <% } %>
                    <!--<a th:if!="${userMessage}" class="btn btn-primary navbar-btn navbar-right" href="/login">Login</a>-->

                    <div class="clear"></div>
                </div>

            </div>
        </div>
    </div>
</div>
<div class="info">
    <p class="text-justify">
        Are you ready to play your favorite Sport? You can register below and select the sport activity and the location you prefer.
        We provide you all information about the sports centers provided. Enjoy!
    </p>
</div>
<div class="banner">
    <!-- start slider -->
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="/images/slider1.jpg" alt="...">
                <div class="carousel-caption">
                    Welcome to SPORTIVITY!
                </div>
            </div>
            <div class="item">
                <img src="/images/basket.jpg" width="1600px" alt="...">
                <div class="carousel-caption">
                    We are AWESOME!
                </div>
            </div>
            <div class="item">
                <img src="/images/slider3" alt="...">
                <div class="carousel-caption">
                    Let us show you WHY
                </div>
            </div>

        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>

    </div>
    <!--/slider -->
</div>
<div class="features">
    <div class="container">
        <h1 class="text-center" style="margin-bottom: 30px">How it works</h1>

        <div class="row">
            <div class="col-md-4">
                <h3 class="m_4 text-center"><a href="#" style="color: black">Step 1</a></h3>
                <p class="text-center">
                    <span class="fa fa-pencil" style="font-size: 65px"></span>
                </p>
                <p class="text-center"><a href="/registration">Register</a></p>
            </div>
            <div class="col-md-4">
                <h3 class="m_4 text-center"><a href="#" style="color: black">Step 2</a></h3>
                <p class="text-center">
                    <span class="fa fa-sign-in" style="font-size: 65px"></span>
                </p>
                <p class="text-center"><a href="/login">Login</a></p>
            </div>
            <div class="col-md-4 ">
                <h3 class="m_4 text-center"><a href="#" style="color: black">Step 3</a></h3>
                <p class="text-center">
                    <span class="fa fa-search" style="font-size: 65px"></span>
                </p>
                <p class="text-center"><a href="/search">Search</a></p>
            </div>
        </div>
    </div>
</div>
</div>
<div class="footer">
    <div class="container">
        <div class="row footer_bottom">
            <div class="copy">
                <p>© 2017 Sportivity</p>
            </div>
        </div>
    </div>
</div>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>
</html>