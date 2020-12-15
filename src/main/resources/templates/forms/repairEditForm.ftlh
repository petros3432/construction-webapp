<#import "/spring.ftl" as spring />

<h4 class="mb-3">Edit Repair</h4>


<form id="createForm" action="/repair/edit" method="post">

    <input type="hidden" name="id" value="${rep.id}">
    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="datepicker">Date</label>
            <div class="input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"><span data-feather="calendar"></span></span>
                </div>
                <input type="text" class="form-control" value="${rep.scheduledDate}" id="datepicker"
                       name="scheduledDate">
            </div>
        </div>


        <div class="form-group col-md-6 text-left">
            <label for="state">State of Repair</label>
            <div class="input-group">
                <select class="custom-select d-block w-100" id="state" name="state">
                    <#if repairStates??>
                        <#list repairStates as state>
                            <option value="${state}"<#if rep.state == state> selected</#if>>${state}</option>                    </#list>
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
            <label for="cost">Cost</label>
            <div class="input-group">
                <input type="text" class="form-control" value="${rep.cost}" id="cost" name="cost">
            </div>
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="title">Address</label>
            <div class="input-group">
                <input type="text" class="form-control" id="address" value="${rep.address}" name="address">
            </div>
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
    </div>

    <#--    <div class="mb-3">-->
    <#--        <label for="ownersName">Owner's Name</label>-->
    <#--        <div class="input-group">-->
    <#--            <input type="text" class="form-control" id="owner-first-name" value="${rep.ownersName}"name="ownerFirstName">-->
    <#--        </div>-->
    <#--    </div>-->


    <button class="btn btn-primary btn-lg mt-4" type="submit">Submit</button>
</form>