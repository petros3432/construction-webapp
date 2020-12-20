<#--<#import "/spring.ftl" as spring />-->


<!DOCTYPE html>
<html>

<head>
    <title>Login Page</title>
    <#include "../partials/header_login.ftlh">
    <!-- <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP" crossorigin="anonymous"> -->
</head>

<body>
<div class="container h-100">
    <div class="d-flex justify-content-center h-100">

        <div class="user_card">
            <p id="demo1" class="mt-10 pr-1">BoBiToMastori</p>
            <div class="d-flex justify-content-center">
                <div class="brand_logo_container">
                    <img src="/css/engineer.svg" class="brand_logo" alt="Logo">
                </div>
            </div>
            <div class="d-flex justify-content-center form_container">
                <form action="/login" method="POST">
                    <#if RequestParameters.error?? >
                        <div class="d-flex justify-content-center mb-2" style="">
                            <p>Wrong Credentials ...</p>
                            <p>Please try again</p>
                        </div></#if>
                    <div class="input-group mb-3" style="position: static;">
                        <div class="input-group-append">
                            <span class="input-group-text">
                                <i class="fas fa-user"></i></span>
                        </div>
                        <input type="text" name="username" class="form-control input_user" value=""
                               placeholder="E-mail">
                    </div>
                    <div class="input-group mb-2" style="position: static;">
                        <div class="input-group-append">
                            <span class="input-group-text"><i class="fas fa-key"></i></span>
                        </div>
                        <input type="password" name="password" class="form-control input_pass" value=""
                               placeholder="password">
                    </div>

                    <div class="d-flex justify-content-center mt-3 login_container" style="position: static;">
                        <button type="submit" name="button" class="btn login_btn">Login</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
<#include "../partials/scripts_login.ftlh">
</html>