<#import "/spring.ftl" as spring />

<h3 class="mb-3">
            <span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-user-edit"></i>
            </span></i> Edit Property</h3>

<form id="editProperty" action="/admin/property/edit" name="editProperty" method="post">
    <input type="hidden" name="id" value="${editProperty.id}">

    <div class="row">

        <div class="form-group col-md-6 text-left">
            <label for="typeOfProperty">Type of Property</label>
            <div class="input-group">
                <select class="custom-select d-block w-100" id="typeOfProperty" name="typeOfProperty">
                    <#if propertyTypes??>
                        <#list propertyTypes as type>
                            <option value="${type}"<#if editProperty.typeOfProperty == type> selected</#if>>${type}</option>
                        </#list>
                    </#if>
                </select>
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="propertyE9">Property Identity</label>
            <div class="input-group">
                <@spring.bind "editProperty.propertyE9"/>
                <input type="text" class="form-control" value="${editProperty.propertyE9}" id="propertyE9"
                       name="propertyE9">
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
                <@spring.bind "editProperty.address"/>
                <input type="text" class="form-control" id="address" value="${editProperty.address}" name="address" >
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
            <label for="cost">Afm</label>
            <div class="input-group">

                <p>  ${editProperty.afm} </p>
            </div>
        </div>
    </div>


    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="title">Property Year</label>
            <div class="input-group">

                <@spring.bind "editProperty.year"/>
                <input type="text" class="form-control" id="year" value="${editProperty.year}" name="year">

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

    <button class="btn btn-lg mt-4 btnblue" type="submit">Submit</button>
</form>