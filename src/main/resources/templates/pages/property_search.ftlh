<!DOCTYPE html>
<html>

<head>
    <title>Property Search</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link href="/../css/main2.css" rel="stylesheet"/>
    <link rel="icon" href="/../css/helmet.png" type="image/x-icon">
</head>


<body>
<#include "../partials/topnavbar3.ftlh">
<div class="container-fluid">
    <div class="row mt-4">
        <#--Table for the repair items-->
        <main role="main" class="mx-auto col-md-9 col-lg-10 pt-3 px-4">
            <div class="row">
                <div class="col-md-12 order-md-1">
                    <#include "../forms/propertySearchForm.ftlh">
                </div>
            </div>
        </main>
    </div>
</div>
<#include "../partials/scripts_property.ftlh">

</body>

</html>