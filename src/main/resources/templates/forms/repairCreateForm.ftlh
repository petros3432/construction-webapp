<#import "/spring.ftl" as spring />

<h4 class="mb-3">Create Repair</h4>

<form id="createForm" action="/repair/create" method="post">
    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="scheduledDate">Date</label>
            <div class="input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"><span data-feather="calendar"></span></span>
                </div>
                <input type="text" class="form-control" id="scheduledDate" name="scheduledDate">
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="stateOfRepair">State of Repair</label>
            <div class="input-group">
                <select class="custom-select d-block w-100" id="stateOfRepair" name="state">
                    <#if repairStates??>
                        <#list repairStates as state>
                            <option value="${state}">${state}</option>
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
                    <#if repairStates??>
                        <#list repairTypes as type>
                            <option value="${type}">${type}</option>
                        </#list>
                    </#if>
                </select>
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="author-first-name">Cost</label>
            <div class="input-group">
                <input type="text" class="form-control" id="cost" name="cost">
            </div>
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="title">Address</label>
            <div class="input-group">
                <input type="text" class="form-control" id="title" name="address">
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="textDesc">Description</label>
            <div class="input-group">
                <input type="text" class="form-control" id="textDesc" name="textDesc">
            </div>
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="ownersAfm">Owner's AFM</label>
            <div class="input-group">
                <input type="text" class="form-control" id="owner-afm" name="afmOwner">
            </div>
        </div>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Create</button>
</form>