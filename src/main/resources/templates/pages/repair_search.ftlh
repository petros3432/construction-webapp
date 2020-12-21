<!DOCTYPE html>
<html>

<head>
    <title>Search Repair</title>
    <#include "../partials/header.ftlh">
</head>


<body>
<#include "../partials/topnavbar1.ftlh">
<div class="container-fluid">
    <div class="row mt-2">
        <#--Table for the repair items-->
        <main role="main" class="mx-auto col-md-9 col-lg-10 pt-3 px-4">
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