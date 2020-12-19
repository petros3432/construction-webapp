<#import "/spring.ftl" as spring />

<h3 class="mb-3">
            <span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-search"></i>
            </span></i> Search Repairs</h3>

<form id="createForm" action="/property/search" name="propertySearchForm" method="post">

    <div class="mb-3">
        <label for="propertyE9">E9 Number</label>
        <div class="input-group">
            <@spring.bind "propertySearchForm.propertyE9"/>
            <input type="text" class="form-control" id="propertyE9" name="propertyE9"
                   placeholder="E9 Number">
<#--                   placeholder="E9 Number" value="${propertySearchForm.propertyE9!''}">-->
        </div>
<#--        <#if spring.status.error>-->
<#--            <ul>-->
<#--                <#list spring.status.errorMessages as error>-->
<#--                    <li style="color: #dc3545">${error}</li>-->
<#--                </#list>-->
<#--            </ul>-->
<#--        </#if>-->
    </div>

    <div class="mb-3">
        <label for="ownersAfm">Owner's AFM</label>
        <div class="input-group">
<#--            <@spring.bind "propertySearchForm.afm"/>-->
            <input type="text" class="form-control" id="owner-afm" name="afm"
                   placeholder="Owner's ΑΦΜ" >
<#--                   placeholder="Owner's ΑΦΜ" value="${propertySearchForm.afm!''}">-->
        </div>
<#--        <#if spring.status.error>-->
<#--            <ul>-->
<#--                <#list spring.status.errorMessages as error>-->
<#--                    <li style="color: #dc3545">${error}</li>-->
<#--                </#list>-->
<#--            </ul>-->
<#--        </#if>-->

    </div>
    <button class="btn btn-lg mt-4 btnblue" type="submit">Search</button>
</form>