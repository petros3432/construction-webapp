<#import "/spring.ftl" as spring />

<h3 class="mb-3">
            <span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-search"></i>
            </span></i> Search Repairs</h3>

<form id="createForm" action="/repair/search" name="repairSearchForm" method="post">

    <div class="mb-3">
        <label for="datepicker">Starting Date</label>
        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><span data-feather="calendar"></span></span>
            </div>
            <@spring.bind "repairSearchForm.scheduledDateStart"/>
            <input type="text" class="form-control datepicker" name="scheduledDateStart"
             placeholder="First Date" value="${repairSearchForm.scheduledDateStart!''}">
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
        <label for="datepicker">Ending Date</label>
        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><span data-feather="calendar"></span></span>
            </div>
            <@spring.bind "repairSearchForm.scheduledDateEnd"/>
            <input type="text" class="form-control datepicker" name="scheduledDateEnd"
                   placeholder="Ending Date" value="${repairSearchForm.scheduledDateEnd!''}">
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
            <@spring.bind "repairSearchForm.afm"/>
            <input type="text" class="form-control" id="owner-afm" name="afm"
                   placeholder="Owner's ΑΦΜ" value="${repairSearchForm.afm!''}">
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