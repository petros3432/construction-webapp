<!DOCTYPE html>
<html>

<head>
    <title>Repair Search</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link href="/../css/main2.css" rel="stylesheet"/>
    <link rel="icon" href="/../css/helmet.png" type="image/x-icon">
</head>


<body>
<#include "../partials/topnavbar1.ftlh">
<div class="container-fluid">
    <div class="row mt-4">
        <#include "../partials/sidebar1.ftlh">
        <#--Table for the repair items-->
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <div class="row">
                <div class="col-md-12 order-md-1">
                    <#include "../forms/repairSearchForm.ftlh">
                </div>
            </div>
        </main>
    </div>
</div>
<#include "../partials/scripts_repair.ftlh">
<#include "../partials/script-datepicker.ftlh">
</body>

</html>