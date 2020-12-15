<!DOCTYPE html>
<html>

<head>
    <title>Admin Home Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link href="/../css/main2.css" rel="stylesheet"/>
    <link rel="icon" href="/../css/helmet.png" type="image/x-icon">
</head>


<body>
<#include "../partials/topnavbar2.ftlh">

<div class="container-fluid">
    <div class="row mt-4">
        <#include "../partials/sidebar2.ftlh">
        <#--Table for the repair items-->
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <h3 class="mb-3">Owners</h3>
            <div class="table-responsive">
            <#if error??>
                 ${error}
            </#if>
                <table class="table table-sm table-striped table-hover table-borderless" style="text-align:center;"
                       id="empTable">
                    <thead>
                    <tr>
                        <th scope="col">AFM</th>
                        <th scope="col">Name</th>
                        <th scope="col">Surname</th>
                        <th scope="col">Address</th>
                        <th scope="col">Tel. Number</th>
                        <th scope="col">Email</th>
                        <th scope="col">Type Of Property</th>
                        <th scope="col">Edit</th>
                        <th scope="col">Remove</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#if top10owners??>
                        <#list top10owners as owner>
                            <#if owner.userType == "OWNER">
                            <tr>
                                <td>${owner.afm}</td>
                                <td>${owner.name}</td>
                                <td>${owner.surname}</td>
                                <td>${owner.address}</td>
                                <td>${owner.tel}</td>
                                <td>${owner.email}</td>
                                <td>${owner.typeOfProperty}</td>
                                <td class="text-center"><a class="btn btn-link" href="/owner/${owner.id}/edit"><span data-feather="tool"></span></a></td>
                                <td class="text-center">

                                    <button
                                            class="btn btn-link"
                                            data-toggle="modal"
                                            data-target="#modal"
                                            data-id="${owner.afm}"
                                    >
                                        <span data-feather="x"></span>
                                    </button>

                                </td>
                            </tr>
                            </#if>
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