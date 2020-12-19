<!DOCTYPE html>
<html>

<head>
    <title>Admin Home Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="/../css/main2.css" rel="stylesheet"/>
    <link rel="icon" href="/../css/helmet.png" type="image/x-icon">
</head>


<body>



<nav class="navbar  navbar-light">
    <a class="navbar-brand" href="/user/home">
        <img class="img-fluid" src="/../css/engineer.svg" alt="Kiwi standing on oval"
             style="width:60px; padding:nopadding">
        BoBiToMastori.gr
    </a>


    <a class="btn btn-logout" href="/logout">
        <span data-feather="log-out"></span>
        Logout
    </a>

</nav>



<div class="container-fluid">
    <main role="main" class="mx-auto col-md-9 col-lg-10 pt-3 px-4" style="margin-top: 8%;">
        <div class="row justify-content-md-center">
            <h1>
                <span style="font-size: 1em; color: #E63946;">
                <i class="fas fa-bomb"></i>
                </span>OOPS!<span style="font-size: 1em; color: #E63946;">
                <i class="fas fa-bomb"></i>
                </span></h1>
        </div>
        <div class="row justify-content-md-center mt-3">
            <h3>Page not Found</h3>
        </div>
        <div class="row justify-content-md-center align-items-end" style="margin-top: 10%;">
            <button type="button" class="btn btnblue" onclick="goBack()">Return
                Back
            </button>
            <script>
                function goBack() {
                    window.history.back();
                }
            </script>
            <div class="col-md-auto pl-5 pr-5 align-self-center">
                OR
            </div>
            <a class="btn btnhome" href="/user/home" role="button">Go Home</a>
        </div>
    </main>
</div>
<#include "../partials/scripts_repair.ftlh">
<#include "../partials/script-datepicker.ftlh">
</body>

</html>