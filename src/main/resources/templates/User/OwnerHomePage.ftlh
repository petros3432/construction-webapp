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
<#include "../partials/topnavbarowner.ftlh">

<div class="container-fluid">
    <main role="main" class="mx-auto col-md-9 col-lg-10 pt-3 px-4 mt-4">
        <h3 class="mb-3">
            <span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-tools"></i>
            </span></i> Your Repairs</h3>
        <div class="table-responsive ">
            <table class="table table-sm table-striped table-hover table-borderless" style="text-align:center;"
                   id="empTable">
                <thead>
                <tr>
                    <th scope="col">Type</th>
                    <th scope="col">Address</th>
                    <th scope="col">Cost</th>
                    <th scope="col">State</th>
                    <th scope="col">Scheduled Date</th>
                    <th scope="col">Description</th>
                </tr>
                </thead>
                <tbody>
                <#if repairs??>
                    <#list repairs as rep>
                        <tr>
                            <td>${rep.typeOfRepair}</td>
                            <td>${rep.address}</td>
                            <td>${rep.cost} € </td>
                            <td>${rep.state}</td>
                            <td>${rep.scheduledDate}</td>
                            <td>${rep.textDesc!''}</td>
                        </tr>
                    </#list>
                </#if>
                </tbody>
            </table>
        </div>
    </main>
</div>
</div>
<#include "../partials/scripts_repair.ftlh">
</body>

</html>