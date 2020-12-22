<#import "/spring.ftl" as spring />

<h3 class="mb-3">
            <span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-user-edit"></i>
            </span></i> Edit Owner </h3>

<form id="createForm" action="/admin/owner/edit" name="owner" method="post">
    <input type="hidden" name="id" value="${owner.id}">

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="cost">Name*</label>
            <div class="input-group">
                <@spring.bind "owner.name"/>
                <input type="text" class="form-control" value="${owner.name!''}" id="name" name="name" required>
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
            <label for="cost">Surname*</label>
            <div class="input-group">
                <@spring.bind "owner.surname"/>
                <input type="text" class="form-control" value="${owner.surname}" id="surname" name="surname" required>
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
            <label for="title">Home Address*</label>
            <div class="input-group">
                <input type="text" class="form-control" id="address" value="${owner.address}" name="address" required>
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="cost">Afm*</label>
            <div class="input-group">
                <@spring.bind "owner.afm"/>
                <input type="text" class="form-control" value="${owner.afm}" id="afm" name="afm" required>
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
                <input type="text" class="form-control" id="email" value="${owner.email}" name="email" readonly>
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
            <label for="title">Telephone*</label>
            <div class="input-group">
                <@spring.bind "owner.tel"/>
                <input type="text" class="form-control" id="tel" value="${owner.tel}" name="tel" required>
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
        <button class="btn btn-lg mt-4 btnblue" type="submit">Submit</button>
            </div>
        <div class="form-group col-md-6 text-right">
        <small> *Required Fields</small>
            </div>
    </div>
</form>