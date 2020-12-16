<#import "/spring.ftl" as spring />

<h4 class="mb-3">Create Repair</h4>

<form id="createForm" action="/repair/create" method="post">

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="datepicker">Date</label>
            <div class="input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"><span data-feather="calendar"></span></span>
                </div>
                <@spring.bind "repairCreateForm.scheduledDate"/>
                <input type="text" class="form-control datepicker"  name="scheduledDate">

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
                <select class="custom-select d-block w-100" id="stateOfRepair"   name="state">

                        <#list repairStates as state>
                            <option value="${state}">${state}</option>
                        </#list>

                </select>
            </div>
        </div>
    </div>
    <#else>
        <div class="form-group col-md-6 text-left">
            <label for="stateOfRepair">State of Repair</label>
            <div class="input-group">
                <select class="custom-select d-block w-100" id="stateOfRepair"   name="state">


                        <option value="WAITING" selected>WAITING</option>
                        <option value="IN PROGRESS">IN PROGRESS</option>
                        <option value="COMLETED">COMPLETED</option>
                </select>
                <ul>
                    <li style="color: #dc3545">Please pick again the state of repair</li>
                </ul>
            </div>
        </div>
        </div>

    </#if>

   <div class="row">
        <#if repairTypes??>

        <div class="form-group col-md-6 text-left">
            <label for="typeOfRepair">Type of Repair</label>
            <div class="input-group">
                <select class="custom-select d-block w-100" id="typeOfRepair" name="typeOfRepair">

                        <#list repairTypes as type>
                            <option value="${type}">${type}</option>
                        </#list>

                </select>
            </div>
        </div>
        <#else>


        <div class="form-group col-md-6 text-left">
            <label for="stateOfRepair">Types of Repair</label>
            <div class="input-group">
                <select class="custom-select d-block w-100" id="stateOfRepair"   name="typeOfRepair">


                    <option value="PAINTING" selected>PAINTING</option>
                    <option value="INSULATION">INSULATION</option>
                    <option value="FRAMES">FRAMES</option>
                    <option value="PLUMBING">PLUMBING</option>
                    <option value="ELECTRICAL">ELECTRICAL</option>

                </select>
                <ul>
                    <li style="color: #dc3545">Please pick again the type of repair</li>
                </ul>
            </div>
        </div>
        </#if>
<#--    </div>-->
        <div class="form-group col-md-6 text-left">
            <label for="cost">Cost €</label>
            <div class="input-group">
                <@spring.bind "repairCreateForm.cost"/>
                <input type="text" class="form-control" id="cost" value="${repairCreateForm.cost!''}" name="cost" >

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
                <input type="text" class="form-control" id="title" value="${repairCreateForm.address!''}" name="address" >

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
                <input type="text" class="form-control" id="textDesc"  name="textDesc">
            </div>
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="ownersAfm">Owner's AFM</label>
            <div class="input-group">
                <@spring.bind "repairCreateForm.afmOwner"/>
                <input type="text" class="form-control" id="owner-afm" value="${repairCreateForm.afmOwner!''}" name="afmOwner" >

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
    <button class="btn btn-lg mt-4 btnblue" type="submit">Create</button>
</form>