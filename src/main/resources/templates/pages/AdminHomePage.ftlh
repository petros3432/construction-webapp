<!DOCTYPE html>
<html>

<head>
    <title>Admin Home Page</title>
<#--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">-->
    <link  href="/css/main.css" rel="stylesheet"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <link rel="icon" href="/../css/helmet.png" type="image/x-icon">
</head>

<body>
<#include "../partials/CreateModal.ftlh">
<#include "../partials/TopNavbar.ftlh">
<#include "../partials/ShowModal.ftlh">
<div class="container">
    <!-- First Button Row -->
    <div class="row justify-content-between">
        <div class="col-md-4 mt-4" style="padding-left:0%;">
            <button href="#AddNew" data-toggle="modal" class="btn btn-primary btn-lg" style="border-radius: 25px">
                <span class="glyphicon glyphicon-plus"></span>Προσθήκη
            </button>
        </div>
        <div class="col-md-4 mt-4 text-right" style="padding-right:0%;">
            <form class="form-inline" style="display: inline-block;">
                <input class="form-control mr-sm-0" type="search" placeholder="Search" aria-label="Search">
            </form>
        </div>
    </div>

    <div class="row mt-4">
        <#--Table for the repair items-->

        <table class="table table-sm table-striped table-hover table-borderless" style="text-align:center;"
               id="empTable">
            <thead>
            <tr>
                <th scope="col">Type</th>
                <th scope="col">Address</th>
                <th scope="col">Cost</th>
                <th scope="col">State</th>
                <th scope="col">Scheduled Date</th>
                <th scope="col">Action</th>
            </tr>
            </thead>
            <tbody class='content'></tbody>
        </table>
    </div>
</div>


<#--    <script src="/../js/main.js"></script>-->


</body>

</html>