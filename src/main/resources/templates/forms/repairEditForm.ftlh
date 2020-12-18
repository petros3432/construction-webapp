<#import "/spring.ftl" as spring />

<h3 class="mb-3">
            <span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-edit"></i>
            </span></i> Edit Repair</h3>


<form id="createForm" action="/repair/edit" method="post">

    <input type="hidden" name="id" value="${rep.id}">

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="datepicker">Date</label>
            <div class="input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"><span data-feather="calendar"></span></span>
                </div>
                <@spring.bind "rep.scheduledDate"/>
                <input type="text" class="form-control datepicker" value="${rep.scheduledDate}"
                       name="scheduledDate">
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
            <label for="state">State of Repair</label>
            <div class="input-group">
                <select class="custom-select d-block w-100" id="state" name="state">
                    <#if repairStates??>
                        <#list repairStates as state>
                            <option value="${state}"<#if rep.state == state> selected</#if>>${state}
                            </option>
                        </#list>
                    </#if>
                </select>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="typeOfRepair">Type of Repair</label>
            <div class="input-group">
                <select class="custom-select d-block w-100" id="typeOfRepair" name="typeOfRepair">
                    <#if repairTypes??>
                        <#list repairTypes as type>
                            <option value="${type}"<#if rep.typeOfRepair == type> selected</#if>>${type}</option>
                        </#list>
                    </#if>
                </select>
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="cost">Cost € </label>
            <div class="input-group">
                <@spring.bind "rep.cost"/>
                <input type="text" class="form-control" value="${rep.cost}" id="cost" name="cost">
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
            <label for="title">Address</label>
            <div class="input-group">
                <@spring.bind "rep.address"/>
                <input type="text" class="form-control" id="address" value="${rep.address}" name="address">
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
                <#if rep.textDesc??>
                    <input type="text" class="form-control" id="textDesc" value="${rep.textDesc}" name="textDesc">
                <#else>
                    <input type="text" class="form-control" id="textDesc" name="textDesc">
                </#if>
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="ownersAFM">Owner's AFM</label>
            <div class="input-group">
                   <#if rep.ownersAFM??>
                      <input type="text" class="form-control" id="ownersAFM" value="${rep.ownersAFM}" name="ownersAFM">
                   <#else>
                      <input type="text" class="form-control" id="ownersAFM" name="ownersAFM">
                  </#if>
            </div>
        </div>
    </div>



    <button class="btn btn-lg mt-4 btnblue" type="submit">Submit</button>
</form>