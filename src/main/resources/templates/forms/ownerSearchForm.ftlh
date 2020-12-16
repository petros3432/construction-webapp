<#import "/spring.ftl" as spring />

<h4 class="mb-3">Search Owner</h4>

<form action="/owner/search" name="ownerSearchForm" method="post" >
    <div class="mb-3">
        <label for="emailpicker">Email</label>
        <div class="input-group">
            <@spring.bind "ownerSearchForm.email"/>
            <input type="email" class="form-control" id="emailpicker" name="email">
            <#if spring.status.error>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>
    </div>

    <div class="mb-3">
        <label for="ownersAfm">Owner's AFM</label>
        <div class="input-group">
            <@spring.bind "ownerSearchForm.afm"/>
            <input type="text" class="form-control" id="owner-afm" name="afm">
            <#if spring.status.error>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>
        </div>
    </div>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>