<#import "/spring.ftl" as spring />

<h4 class="mb-3">Edit Owner</h4>


<form id="createForm" action="/owner/edit" method="post">
    <input type="hidden" name="id" value="${owner.id}">

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="cost">Name</label>
            <div class="input-group">
                <input type="text" class="form-control" value="${owner.name}" id="name" name="name">
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="cost">Surname</label>
            <div class="input-group">
                <input type="text" class="form-control" value="${owner.surname}" id="surname" name="surname">
            </div>
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="title">Address</label>
            <div class="input-group">
                <input type="text" class="form-control" id="address" value="${owner.address}" name="address">
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="cost">Afm</label>
            <div class="input-group">
                <input type="text" class="form-control" value="${owner.afm}" id="afm" name="afm">
            </div>
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="title">Email</label>
            <div class="input-group">
                <input type="text" class="form-control" id="email" value="${owner.email}" name="email">
            </div>
        </div>

        <div class="form-group col-md-6 text-left">
            <label for="inputPassword3" class=" control-label">Password</label>
            <div class="inputGroupContainer">
                <input type="password" class="form-control" name="password"
                       id="password" value="${owner.password}">

            </div>
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="title">Telephone</label>
            <div class="input-group">
                <input type="text" class="form-control" id="tel" value="${owner.tel}" name="tel">
            </div>
        </div>
    </div>

    <div class="form-group col-md-6 text-left">
        <label for="state">Type Of Property</label>
        <div class="input-group">
            <select class="custom-select d-block w-100" id="state" name="state">
                <#if PropertyTypes??>
                    <#list PropertyTypes as type>
                        <option value="${type}"<#if owner.typeOfProperty == type> selected</#if>>${type}</option>                    </#list>
                </#if>
            </select>
        </div>
    </div>

    <#--    <div class="mb-3">-->
    <#--        <label for="ownersName">Owner's Name</label>-->
    <#--        <div class="input-group">-->
    <#--            <input type="text" class="form-control" id="owner-first-name" value="${owner.ownersName}"name="ownerFirstName">-->
    <#--        </div>-->
    <#--    </div>-->


    <button class="btn btn-primary btn-lg mt-4" type="submit">Submit</button>
</form>