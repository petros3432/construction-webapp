<!DOCTYPE html>
<html>

<head>
    <title>Edit Property</title>
    <#include "../partials/header.ftlh">
</head>


<body>
<#include "../partials/topnavbar2.ftlh">

<div class="container-fluid">
    <div class="row mt-4">
        <#--Table for the repair items-->
        <main role="main" class="mx-auto col-md-9 col-lg-10 pt-3 px-4">
            <div class="row">
                <div class="col-md-12 order-md-1">
                    <#include "../forms/propertyEditForm.ftlh">
                </div>
            </div>
        </main>
    </div>
</div>

<#include "../partials/scripts_property.ftlh">
<#include "../partials/script-datepicker.ftlh">
</body>
</html>
