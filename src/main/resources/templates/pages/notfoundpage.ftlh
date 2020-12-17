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
<#include "../partials/topnavbar1.ftlh">

<div class="container-fluid mt-5">
    <main role="main" class="mx-auto col-md-9 col-lg-10 pt-3 px-4 ">
        <h3>
            <span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-exclamation-circle"></i>
            </span> No Repairs Found<span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-exclamation-circle"></i>
            </span></h3>
        <button type="button" class="btn btnblue" style="margin-top: 10%;margin-left:4%" onclick="goBack()">Return Back</button>
        <script>
            function goBack() {
                window.history.back();
            }
        </script>
    </main>
</div>
<#include "../partials/scripts_repair.ftlh">
<#include "../partials/script-datepicker.ftlh">
</body>

</html>