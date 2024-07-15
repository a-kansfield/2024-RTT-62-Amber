<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>



    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link href="/pub/css/style.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid flex-grow-0 justify-content-right">
        <a class="navbar-brand" href="#"></a>
        <button class="navbar-toggler justify-content-right" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-between justify-content-lg-center" id="navbarSupportedContent">
            <ul class="navbar-nav mb-2 mb-lg-0 pl-2 pr-2">
                <li class="nav-item">
                    <a class="nav-link" aria-current="page" href="/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/another-page">2nd Page</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/homework">Homework</a>
                </li>
                <li class="nav-item">
                    <div class="dropdown">
                        <button class="btn dropdown-toggle" type="button" id="dropdownSearchButton" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Search
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a href="/product/product-search" class="dropdown-item">Product Search</a>
                            <a href="/employee/employee-search" class="dropdown-item">Employee Search</a>
                            <a href="/customer/customer-search" class="dropdown-item">Customer Search</a>
                        </div>
                    </div>
                </li>
                <li class="nav-item">
                    <div class="dropdown">
                        <button class="btn dropdown-toggle" type="button" id="dropdownTableButton" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Tables
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a href="/product" class="dropdown-item">Product</a>
                            <a href="/employee" class="dropdown-item">Employee</a>
                            <a href="/customer" class="dropdown-item">Customer</a>
                        </div>
                    </div>
                </li>
                <li class="nav-item"><a href="/employee/create" class="dropdown-item">Create Employee</a></li>
            </ul>
        </div>
    </div>
</nav>