<!DOCTYPE html>
<html>

<head>
    <title>Owner Page</title>
    <#include "../partials/header.ftlh">
</head>


<body>
<#include "../partials/topnavbar2.ftlh">

<div class="container-fluid">
        <main role="main" class="mx-auto col-md-9 col-lg-10 pt-3 px-4 mt-4">
            <h3 class="mb-3">
            <span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-users"></i>
            </span></i> Owners</h3>

            <div class="table-responsive">
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
                        <th scope="col">Edit</th>
                        <th scope="col">Remove</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#if top10owners??>
                        <#list top10owners as owner>
                            <#if owner.role == "USER">
                                <tr>
                                    <td>${owner.afm}</td>
                                    <td>${owner.name}</td>
                                    <td>${owner.surname}</td>
                                    <td>${owner.address}</td>
                                    <td>${owner.tel}</td>
                                    <td>${owner.email}</td>
                                    <td class="text-center"><a class="btn btn-link" href="/admin/owner/${owner.id}/edit"><span
                                                    data-feather="tool"></span></a></td>
                                    <td class="text-center">

                                        <button
                                                class="btn btn-link"
                                                data-toggle="modal"
                                                data-target="#modal"
                                                data-id="${owner.id}"
                                                data-name="${owner.name} ${owner.surname}"
                                                data-afm="${owner.afm}"
                                        >
                                            <span data-feather="x"></span>
                                        </button>

                                    </td>
                                </tr>
                            </#if>
                        </#list>
                    </#if>


                    <#if ownerSearchForm??>
                        <#list ownerSearchForm as owner>
                            <#if owner.role == "USER">
                                <tr>
                                    <td>${owner.afm}</td>
                                    <td>${owner.name}</td>
                                    <td>${owner.surname}</td>
                                    <td>${owner.address}</td>
                                    <td>${owner.tel}</td>
                                    <td>${owner.email}</td>
                                    <td class="text-center"><a class="btn btn-link" href="/admin/owner/${owner.id}/edit"><span
                                                    data-feather="tool"></span></a></td>
                                    <td class="text-center">

                                        <button
                                                id="${owner.id}"
                                                class="btn btn-link"
                                                data-toggle="modal"
                                                data-target="#modal"
                                                data-id="${owner.id}"
                                                data-name="${owner.name} ${owner.surname}"
                                                data-afm="${owner.afm}"
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
                <div id="modal" class="modal" tabindex="-1" role="dialog">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">Owner</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <p>Are you sure?</p>
                                <p>Deleting this Owner will also delete all Properties and Repairs that belongs to this Owner!</p>
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
<#include "../partials/scripts_owner.ftlh">
</body>

</html>