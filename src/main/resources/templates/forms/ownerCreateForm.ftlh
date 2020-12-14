<#import "/spring.ftl" as spring />
<h2 class="hello-title">Add Owner</h2>

<form class="well form-horizontal" action="/registerOwner" name="registerOwner" method="POST">
    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="name" class="control-label">Name</label>
            <div class="inputGroupContainer">
                <#--                <@spring.bind "registerOwnerForm2.firstName"/>-->
                <input type="text" class="form-control" name="name" id="name"
                       placeholder="Name" required>
                <#--                <#if spring.status.error>-->
                <#--                    <ul>-->
                <#--                        <#list spring.status.errorMessages as error>-->
                <#--                            <li style="color: #dc3545">${error}</li>-->
                <#--                        </#list>-->
                <#--                    </ul>-->
                <#--                </#if>-->
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="surname" class=" control-label">Surname</label>
            <div class="inputGroupContainer">
                <#--                <@spring.bind "registerOwnerForm2.lastName"/>-->
                <input type="text" class="form-control" name="surname" id="surname"
                       placeholder="Surname" required>
                <#--                <#if spring.status.error>-->
                <#--                    <ul>-->
                <#--                        <#list spring.status.errorMessages as error>-->
                <#--                            <li style="color: #dc3545">${error}</li>-->
                <#--                        </#list>-->
                <#--                    </ul>-->
                <#--                </#if>-->
            </div>
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="address" class=" control-label">Address</label>
            <div class="inputGroupContainer">
                <#--                <@spring.bind "registerOwnerForm2.address"/>-->
                <input type="text" class="form-control" name="address" id="address"
                       placeholder="Address" required>
                <#--                <#if spring.status.error>-->
                <#--                    <ul>-->
                <#--                        <#list spring.status.errorMessages as error>-->
                <#--                            <li style="color: #dc3545">${error}</li>-->
                <#--                        </#list>-->
                <#--                    </ul>-->
                <#--                </#if>-->
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="AFM" class="control-label">AFM</label>
            <div class="inputGroupContainer">
                <#--                <@spring.bind "registerOwnerForm2.afm"/>-->
                <input type="text" class="form-control" id="Afm" name="afm"
                       placeholder="AFM" required>
                <#--                <#if spring.status.error>-->
                <#--                    <ul>-->
                <#--                        <#list spring.status.errorMessages as error>-->
                <#--                            <li style="color: #dc3545">${error}</li>-->
                <#--                        </#list>-->
                <#--                    </ul>-->
                <#--                </#if>-->
            </div>
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="inputEmail3" class="control-label">Email</label>
            <div class="inputGroupContainer">
                <#--                <@spring.bind "registerOwnerForm2.email"/>-->
                <input type="email" class="form-control" id="inputEmail3" name="email"
                       placeholder="Email" required>
                <#--                <#if spring.status.error>-->
                <#--                    <ul>-->
                <#--                        <#list spring.status.errorMessages as error>-->
                <#--                            <li style="color: #dc3545">${error}</li>-->
                <#--                        </#list>-->
                <#--                    </ul>-->
                <#--                </#if>-->
            </div>
        </div>
        <div class="form-group col-md-6 text-left">
            <label for="" class="control-label">Telephone</label>
            <div class="inputGroupContainer">
                <#--                <@spring.bind "registerOwnerForm2.tel"/>-->
                <input type="tel" class="form-control" id="tel" name="tel"
                       placeholder="Telephone" pattern="[0-9]{10}" required>
                <#--                <#if spring.status.error>-->
                <#--                    <ul>-->
                <#--                        <#list spring.status.errorMessages as error>-->
                <#--                            <li style="color: #dc3545">${error}</li>-->
                <#--                        </#list>-->
                <#--                    </ul>-->
                <#--                </#if>-->
            </div>
            <small id="telHelpBlock" class="form-text text-muted">
                *Numbers Only*
            </small>
        </div>

    </div>

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="inputPassword3" class=" control-label">Password</label>
            <div class="inputGroupContainer">
                <#--                <@spring.bind "registerOwnerForm2.password"/>-->
                <input type="password" class="form-control" name="password"
                       id="inputPassword3" placeholder="Password">
                <#--                <#if spring.status.error>-->
                <#--                    <ul>-->
                <#--                        <#list spring.status.errorMessages as error>-->
                <#--                            <li style="color: #dc3545">${error}</li>-->
                <#--                        </#list>-->
                <#--                    </ul>-->
                <#--                </#if>-->
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="typeOfProperty">Type Of Property</label>
            <div class="input-group">
                <select class="custom-select d-block w-100" id="typeOfProperty" name="typeOfProperty">
                    <#if typeOfProperties??>
                        <#list typeOfProperties as type>
                            <option value="${type}">${type}</option>
                        </#list>
                    </#if>
                </select>
            </div>
        </div>
    </div>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Create</button>
</form>