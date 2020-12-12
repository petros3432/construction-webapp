<!DOCTYPE html>
<html>

<head>
    <title>Admin Home Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link href="/../css/main2.css" rel="stylesheet"/>
    <link rel="icon" href="/../css/helmet.png" type="image/x-icon">
</head>


<body>
<#include "../partials/createmodal.ftlh">
<#include "../partials/topnavbar2.ftlh">

<div class="container-fluid">
    <div class="row mt-4">
        <#include "../partials/sidebar2.ftlh">
        <#--Table for the repair items-->
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <h3 class="mb-3">10 Most Recent Repairs</h3>
            <div class="table-responsive">
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
        </main>
    </div>
</div>
<#include "../partials/scripts.ftlh">
</body>

</html>