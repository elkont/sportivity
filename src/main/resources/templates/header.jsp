<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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


    <!--end slider -->
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

                    <a th:if!="${userMessage}" class="btn btn-primary navbar-btn navbar-right" href="/login">Login</a>

                    <div class="clear"></div>
                </div>

            </div>
        </div>
    </div>
</div>