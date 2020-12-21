<!DOCTYPE html>
<html>

<head>
    <title>Create Owner</title>
    <#include "../partials/header.ftlh">
</head>


<body>
<#include "../partials/topnavbar2.ftlh">

<div class="container-fluid">
    <div class="row mt-2">
        <#--Table for the repair items-->
        <main role="main" class="mx-auto col-md-9 col-lg-10 pt-3 px-4">
            <div class="row">
                <div class="col-md-12 order-md-1">
                    <#include "../forms/ownerCreateForm.ftlh">
                </div>
            </div>
        </main>
    </div>
</div>

<#include "../partials/scripts_owner.ftlh">
<#include "../partials/script-datepicker.ftlh">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>
</body>
</html>

