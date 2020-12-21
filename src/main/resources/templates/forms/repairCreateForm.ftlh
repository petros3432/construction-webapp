<#import "/spring.ftl" as spring />

<h3 class="mb-3">
            <span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-plus-circle"></i>
            </span></i> Add Repair</h3>

<form id="createForm" action="/admin/repair/create" name="repairCreateForm" method="post">

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="datepicker">Date</label>
            <div class="input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"><span data-feather="calendar"></span></span>
                </div>
                <@spring.bind "repairCreateForm.scheduledDate"/>
                <input type="text" class="form-control datepicker" name="scheduledDate" required>

            </div>
            <#if spring.status.error>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>
        <#if repairStates??>
        <div class="form-group col-md-6 text-left">
            <label for="stateOfRepair">State of Repair</label>
            <div class="input-group">
                <select class="custom-select d-block w-100" id="stateOfRepair" name="state">

                    <#list repairStates as state>
                        <option value="${state}">${state}</option>
                    </#list>

                </select>
            </div>
        </div>
        </#if>

    </div>

    <div class="row">
        <#if repairTypes??>

            <div class="form-group col-md-6 text-left">
                <label for="typeOfRepair">Type of Repair</label>
                <div class="input-group">
                    <select class="custom-select d-block w-100" id="typeOfRepair" name="typeOfRepair">

                        <#list repairTypes as type>
                            <option value="${type.fullName}"> ${type}</option>
                        </#list>

                    </select>
                </div>
            </div>

        </#if>

        <#--    </div>-->
        <div class="form-group col-md-6 text-left">
            <label for="cost">Cost €</label>
            <div class="input-group">
                <@spring.bind "repairCreateForm.cost"/>
                <input type="text" class="form-control" id="cost" value="${repairCreateForm.cost!''}" name="cost" required>

            </div>
            <#if spring.status.error>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>
    </div>


    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="address">Address</label>
            <div class="input-group">
                <@spring.bind "repairCreateForm.address"/>
                <input type="text" class="form-control" id="title" value="${repairCreateForm.address!''}"
                       name="address" required>

            </div>
            <#if spring.status.error>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="textDesc">Description</label>
            <div class="input-group">
                <input type="text" class="form-control" id="textDesc" name="textDesc" value="${repairCreateForm.textDesc!'-'}">
            </div>
        </div>
    </div>


    <button class="btn btn-lg mt-4 btnblue" type="submit">Create</button>
</form>