<#--<#import "/spring.ftl" as spring />-->


<!DOCTYPE html>
<html>

<head>
    <title>My Awesome Login Page</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="/css/helmet.png" type="image/x-icon">



    <link rel="stylesheet" href="/css/login.css">



    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

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
                    <div class="input-group mb-3">
                        <div class="input-group-append">
                            <!-- <span class="input-group-text">
                                <i class="fas fa-user"></i></span> -->
                        </div>
                        <input type="text" name="username" class="form-control input_user" value="" placeholder="E-mail">
                    </div>
                    <div class="input-group mb-2">
                        <div class="input-group-append">
                            <!-- <span class="input-group-text"><i class="fas fa-key"></i></span> -->
                        </div>
                        <input type="password" name="password" class="form-control input_pass" value=""
                               placeholder="password">
                    </div>
                    <div class="form-group">
                        <div class="custom-control custom-checkbox">
                            <input type="checkbox" class="custom-control-input" id="customControlInline">
                            <label class="custom-control-label" for="customControlInline">Remember me</label>
                        </div>
                    </div>


                    <#if RequestParameters.error?? >

                        <h5>
                            Wrong Credentials ...
                        </h5>

                        <h5>
                            Please try again
                        </h5>

                    </#if>



                    <div class="d-flex justify-content-center mt-3 login_container">
                        <button type="submit" name="button" class="btn login_btn">Login</button>
                    </div>
                </form>
            </div>

            <div class="mt-4">
                <div class="d-flex justify-content-center links">
                    Don't have an account? <a href="#" class="ml-2">Sign Up</a>
                </div>
                <div class="d-flex justify-content-center links">
                    <a href="#">Forgot your password?</a>
                </div>
            </div>
        </div>
    </div>
</div>




</body>

<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script src="/js/CircleType-master/dist/circletype.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<script>
    new CircleType(document.getElementById('demo1'))
        .radius(130);</script>

</html>