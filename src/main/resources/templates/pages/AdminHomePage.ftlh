<!DOCTYPE html>
<html>

<head>
    <title>Admin Home Page</title>
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
            <h3 class="mb-3">10 Most Recent Repairs</h3>
            <div class="table-responsive">
            <#if error??>
               ${error}
            </#if>
                <table class="table table-sm table-striped table-hover table-borderless" style="text-align:center;"
                       id="empTable">
                    <thead>
                    <tr>
                        <th scope="col">Type</th>
                        <th scope="col">Address</th>
                        <th scope="col">Cost</th>
                        <th scope="col">State</th>
                        <th scope="col">Scheduled Date</th>
                        <th scope="col">Edit</th>
                        <th scope="col">Remove</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#if top10rep??>
                        <#list top10rep as rep>
                            <tr>
                                <td>${rep.typeOfRepair}</td>
                                <td>${rep.address}</td>
                                <td>${rep.cost}</td>
                                <td>${rep.state}</td>
                                <td>${rep.scheduledDate}</td>
                                <td class="text-center"><a class="btn btn-link" href="/repair/${rep.id}/edit"><span data-feather="tool"></span></a></td>
                                <td class="text-center">

                                    <button
                                            class="btn btn-link"
                                            data-toggle="modal"
                                            data-target="#modal"
                                            data-id="${rep.id}"
                                    >
                                        <span data-feather="x"></span>
                                    </button>

                                </td>
                            </tr>

                        </#list>
                    </#if>







                    </tbody>
                </table>
            </div>
        </main>
    </div>
</div>
<#include "../partials/scripts.ftlh">
</body>

</html>