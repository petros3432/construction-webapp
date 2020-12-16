<#import "/spring.ftl" as spring />
<h2 class="hello-title">Add Owner</h2>

<form class="well form-horizontal" action="/owner/create" name="registerOwnerForm" method="POST">
    <input type="hidden" name="userType" value="OWNER">
    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="name" class="control-label">Name</label>
            <div class="inputGroupContainer">
                                <@spring.bind "registerOwnerForm.name"/>
                <input type="text" class="form-control" name="name" id="name"
                       placeholder="Name" value="${registerOwnerForm.name!''}">
                                <#if spring.status.error>
                                    <ul>
                                        <#list spring.status.errorMessages as error>
                                            <li style="color: #dc3545">${error}</li>
                                        </#list>
                                    </ul>
                                </#if>
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="surname" class=" control-label">Surname</label>
            <div class="inputGroupContainer">
                                <@spring.bind "registerOwnerForm.surname"/>
                <input type="text" class="form-control" name="surname" id="surname"
                       placeholder="Surname" required value="${registerOwnerForm.surname!''}">
                                <#if spring.status.error>
                                    <ul>
                                        <#list spring.status.errorMessages as error>
                                            <li style="color: #dc3545">${error}</li>
                                        </#list>
                                    </ul>
                                </#if>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="address" class=" control-label">Address</label>
            <div class="inputGroupContainer">
                                <@spring.bind "registerOwnerForm.address"/>
                <input type="text" class="form-control"  id="address" name="address"
                       placeholder="Address" required value="${registerOwnerForm.address!''}">
                                <#if spring.status.error>
                                    <ul>
                                        <#list spring.status.errorMessages as error>
                                            <li style="color: #dc3545">${error}</li>
                                        </#list>
                                    </ul>
                                </#if>
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="AFM" class="control-label">AFM</label>
            <div class="inputGroupContainer">
                                <@spring.bind "registerOwnerForm.afm"/>
                <input type="text" class="form-control" id="Afm" name="afm"
                       placeholder="AFM" value="${registerOwnerForm.afm!''}" required>
                                <#if spring.status.error>
                                    <ul>
                                        <#list spring.status.errorMessages as error>
                                            <li style="color: #dc3545">${error}</li>
                                        </#list>
                                    </ul>
                                </#if>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="inputEmail3" class="control-label">Email</label>
            <div class="inputGroupContainer">
                                <@spring.bind "registerOwnerForm.email"/>
                <input type="email" class="form-control" id="inputEmail3" name="email"
                       placeholder="Email" value="${registerOwnerForm.email!''}" required>
                                <#if spring.status.error>
                                    <ul>
                                        <#list spring.status.errorMessages as error>
                                            <li style="color: #dc3545">${error}</li>
                                        </#list>
                                    </ul>
                                </#if>
            </div>
        </div>

                    <@spring.bind "registerOwnerForm.userType"/>
                    <input type="hidden" name="userType" value="OWNER">

        <div class="form-group col-md-6 text-left">
            <label for="" class="control-label">Telephone</label>
            <div class="inputGroupContainer">
                                <@spring.bind "registerOwnerForm.tel"/>
                <input type="tel" class="form-control" id="tel" name="tel"
                       placeholder="Telephone" pattern="[0-9]{10}" value="${registerOwnerForm.tel!''}" required>
                               <#if spring.status.error>
                                   <ul>
                                       <#list spring.status.errorMessages as error>
                                           <li style="color: #dc3545">${error}</li>
                                       </#list>
                                    </ul>
                              </#if>
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
                                <@spring.bind "registerOwnerForm.password"/>
                <input type="password" class="form-control" name="password"
                       id="inputPassword3" placeholder="Password" value="${registerOwnerForm.password!''}">
                                <#if spring.status.error>
                                    <ul>
                                        <#list spring.status.errorMessages as error>
                                            <li style="color: #dc3545">${error}</li>
                                        </#list>
                                    </ul>
                                </#if>
            </div>
        </div>
        <#if typeOfProperties??>
        <div class="form-group col-md-6 text-left">
            <label for="typeOfProperty">Type Of Property</label>
            <div class="input-group">
                <select class="custom-select d-block w-100" id="typeOfProperty" name="typeOfProperty" >

                        <#list typeOfProperties as type>

                            <option  value="${type}" >${type}</option>

                        </#list>

                </select>
            </div>
        </div>
        </#if>



    </div>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Create</button>
</form>