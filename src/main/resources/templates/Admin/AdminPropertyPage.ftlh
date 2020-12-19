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
<#include "../partials/topnavbar3.ftlh">

<div class="container-fluid">
    <main role="main" class="mx-auto col-md-9 col-lg-10 pt-3 px-4 mt-4">
        <h3 class="mb-3">
            <span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-home"></i>
            </span></i> Properties</h3>

        <div class="table-responsive">
            <table class="table table-sm table-striped table-hover table-borderless" style="text-align:center;"
                   id="empTable">
                <thead>
                <tr>
                    <th scope="col">E9</th>
                    <th scope="col">Address</th>
                    <th scope="col">Year of Construction</th>
                    <th scope="col">Owner's Afm</th>
                    <th scope="col">Type of Propery</th>
                    <th scope="col">Edit</th>
                    <th scope="col">Remove</th>
                </tr>
                </thead>
                <tbody>
                <#if propertySearchForm??>
                    <#list propertySearchForm as prop>
                        <tr>
                            <td>${prop.propertyE9}</td>
                            <td>${prop.address}</td>
                            <td>${prop.year}</td>
                            <td>${prop.afm}</td>
                            <td>${prop.typeOfProperty}</td>
                            <td class="text-center"><a class="btn btn-link" href="/admin/property/${prop.id}/edit"><span
                                            data-feather="tool"></span></a></td>
                            <td class="text-center">

                                <button
                                        class="btn btn-link"
                                        data-toggle="modal"
                                        data-target="#modal"
                                        data-id="${prop.id}"
                                >
                                    <span data-feather="x"></span>
                                </button>

                            </td>
                        </tr>
                    </#list>
                </#if>

                <#if properties??>
                    <#list properties as prop>
                        <tr>
                            <td>${prop.propertyE9}</td>
                            <td>${prop.address}</td>
                            <td>${prop.year}</td>
                            <td>${prop.afm}</td>
                            <td>${prop.typeOfProperty}</td>
                            <td class="text-center"><a class="btn btn-link" href="/admin/property/${prop.id}/edit"><span
                                            data-feather="tool"></span></a></td>
                            <td class="text-center">

                                <button
                                        class="btn btn-link"
                                        data-toggle="modal"
                                        data-target="#modal"
                                        data-id="${prop.id}"
                                >
                                    <span data-feather="x"></span>
                                </button>

                            </td>
                        </tr>
                    </#list>
                </#if>





                </tbody>
            </table>

            <div id="modal" class="modal" tabindex="-1" role="dialog">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">Property</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <p>Are you sure?</p>
                        </div>
                        <div class="modal-footer">
                            <form method="post" id="deleteForm">
                                <button type="submit" class="btn btn-logout">Delete</button>
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
</div>
</div>
<#include "../partials/scripts_property.ftlh">
<#include "../partials/script-datepicker.ftlh">
</body>

</html>