<#import "/spring.ftl" as spring />

<h3 class="mb-3">
            <span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-user-edit"></i>
            </span></i> Edit User</h3>

<form id="editProperty" action="/property/edit" method="post">
    <input type="hidden" name="id" value="${property.id}">

    <div class="row">

        <div class="form-group col-md-6 text-left">
            <label for="typeOfRepair">Type of Repair</label>
            <div class="input-group">
               <select class="custom-select d-block w-100" id="propertyTypes" name="propertyTypes">
                    <#if propertyTypes??>
                        <#list propertyTypes as type>
                             <option value="${type}"<#if editProperty.typeOfProperty == type> selected</#if>>${type}</option>
                        </#list>
                   </#if>
               </select>
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="cost">Property E9</label>
            <div class="input-group">
                <@spring.bind "editProperty.propertyE9"/>
                <input type="text" class="form-control" value="${editProperty.propertyE9}" id="propertyE9" name="propertyE9">
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
                <input type="text" class="form-control" id="address" value="${prop.address}" name="address">
            </div>
        </div>
        <div class="form-group col-md-6 text-left">
            <label for="type">Type of Property</label>
            <div class="input-group">
                <select class="custom-select d-block w-100" id="typeOfProperty" name="typeOfProperty">
                    <#if propertyTypes??>
                        <#list propertyTypes as type>
                            <option value="${type}"<#if prop.type == type> selected</#if>>${type}
                            </option>
                        </#list>
                    </#if>
                </select>
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="cost">Afm</label>
            <div class="input-group">
<#--                <@spring.bind "property.afm"/>-->
                <input type="text" class="form-control" value="${prop.afm}" id="afm" name="afm">
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
            <label for="title">Email</label>
            <div class="input-group">
                <@spring.bind "owner.email"/>
                <input type="text" class="form-control" id="email" value="${owner.email}" name="email">
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
            <label for="title">Property E9</label>
            <div class="input-group">

                <@spring.bind "owner.tel"/>
<#--                -->
                <input type="text" class="form-control" id="propertyE9" value="${property.propertyE9}" name="propertyE9">
                <input type="text" class="form-control" id="propertyE9" name="propertyE9">
            </div>
<#--            <#if spring.status.error>-->
<#--                <ul>-->
<#--                    <#list spring.status.errorMessages as error>-->
<#--                        <li style="color: #dc3545">${error}</li>-->
<#--                    </#list>-->
<#--                </ul>-->
<#--            </#if>-->
        </div>
    </div>

    <button class="btn btn-lg mt-4 btnblue" type="submit">Submit</button>
</form>