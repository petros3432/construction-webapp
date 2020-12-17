<#import "/spring.ftl" as spring />

<h3 class="mb-3">
            <span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-user-tag"></i>
            </span></i> Search Owner</h3>

<form action="/owner/search" name="ownerSearchForm" method="post" >
    <div class="mb-3">
        <label for="emailpicker">Email</label>
        <div class="input-group">
            <@spring.bind "ownerSearchForm.email"/>
            <input type="email" class="form-control" id="emailpicker" name="email">
        </div>
            <#if spring.status.error>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>

    </div>

    <div class="mb-3">
        <label for="ownersAfm">Owner's AFM</label>
        <div class="input-group">
            <@spring.bind "ownerSearchForm.afm"/>
            <input type="text" class="form-control" id="owner-afm" name="afm">
        </div>
            <#if spring.status.error>
                <ul>
                    <#list spring.status.errorMessages as error>
                        <li style="color: #dc3545">${error}</li>
                    </#list>
                </ul>
            </#if>

    </div>
    <button class="btn btn-lg mt-4 btnblue" type="submit">Search</button>
</form>