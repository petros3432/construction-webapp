<!DOCTYPE html>
<html>

<head>
    <title>Home Page</title>
    <#include "../partials/header.ftlh">
</head>


<body>
<#include "../partials/topnavbar1.ftlh">

<div class="container-fluid">
    <main role="main" class="mx-auto col-md-9 col-lg-10 pt-3 px-4 mt-4">
        <h3 class="mb-3">
            <span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-tools"></i>
            </span></i> Repairs</h3>

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
                        <th scope="col">Description</th>
                        <th scope="col">Edit</th>
                        <th scope="col">Remove</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#if repairSearchForm??>
                        <#list repairSearchForm as rep>
                            <tr>
                                <td>${rep.typeOfRepair}</td>
                                <td>${rep.address}</td>
                                <td>${rep.cost} € </td>
                                <#if rep.state == "IN_PROGRESS">
                                    <td  style="color: #A8DADC">${rep.state}</td>
                                <#elseif rep.state == "COMPLETED">
                                    <td  style="color: green">${rep.state}</td>
                                <#else>
                                    <td  style="color: blue">${rep.state}</td>
                                </#if>
                                <td>${rep.scheduledDate}</td>
                                <td>${rep.textDesc!'-'}</td>
                                <td class="text-center"><a class="btn btn-link" href="/admin/repair/${rep.id}/edit"><span
                                                data-feather="tool"></span></a></td>
                                <td class="text-center">

                                    <button
                                            class="btn btn-link"
                                            data-toggle="modal"
                                            data-target="#modal"
                                            data-id="${rep.id}"
                                            data-address="${rep.address}"
                                    >
                                        <span data-feather="x"></span>
                                    </button>

                                </td>
                            </tr>
                        </#list>
                    </#if>




                    <#if top10rep??>
                        <#list top10rep as rep>
                            <tr>
                                <td>${rep.typeOfRepair}</td>
                                <td>${rep.address}</td>
                                <td>${rep.cost} € </td>
                                <#if rep.state == "ONGOING">
                                    <td  style="color: blue">${rep.state}</td>
                                <#elseif rep.state == "COMPLETED">
                                    <td  style="color: green">${rep.state}</td>
                                <#else>
                                    <td  style="color: red">${rep.state}</td>
                                </#if>

                                <td>${rep.scheduledDate}</td>
                                <td>${rep.textDesc!'-'}</td>
                                <td class="text-center"><a class="btn btn-link" href="/admin/repair/${rep.id}/edit"><span
                                                data-feather="tool"></span></a></td>
                                <td class="text-center">

                                <button
                                        class="btn btn-link"
                                        data-toggle="modal"
                                        data-target="#modal"
                                        data-id="${rep.id}"
                                        data-address="${rep.address}"
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
                            <h5 class="modal-title">Repair</h5>
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
<#include "../partials/scripts_repair.ftlh">
<#include "../partials/script-datepicker.ftlh">
</body>

</html>