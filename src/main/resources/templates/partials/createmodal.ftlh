<#import "/spring.ftl" as spring />
<div class="modal fade" id="AddNew" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">
                    <h4><b>Στοιχεία Ιδιοκτήτη</b></h4>
                </h5>
                <#if errorMessage??>
                    <h2>${errorMessage}</h2>
                </#if>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">

                <div class="container-fluid">
                    <form class="well form-horizontal" action="/registerOwner" name="registerOwner" method="POST">
                        <div class="row">
                            <div class="form-group col-md-6 text-left">
                                <label for="" class="control-label">Όνομα</label>
                                <div class="inputGroupContainer">
                                    <@spring.bind "registerOwnerForm.firstName"/>
                                    <input type="text" class="form-control" name="firstName" id="firstName"
                                           placeholder="Όνομα" required>
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
                                <label for="" class=" control-label">Επίθετο</label>
                                <div class="inputGroupContainer">
                                    <@spring.bind "registerOwnerForm.lastName"/>
                                    <input type="text" class="form-control" name="lastName" id="lastName"
                                           placeholder="Eπίθετο" required>
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
                                <label for="" class=" control-label">Διεύθυνση</label>
                                <div class="inputGroupContainer">
                                    <@spring.bind "registerOwnerForm.address"/>
                                    <input type="text" class="form-control" name="address" id="address"
                                           placeholder="Διεύθυνση" required>
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
                                <label for="AFM" class="control-label">ΑΦΜ</label>
                                <div class="inputGroupContainer">
                                    <@spring.bind "registerOwnerForm.afm"/>
                                    <input type="text" class="form-control" id="Afm" name="afm"
                                           placeholder="ΑΦΜ" required>
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
                                           placeholder="Email" required>
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
                                <label for="" class="control-label">Τηλέφωνο</label>
                                <div class="inputGroupContainer">
                                    <@spring.bind "registerOwnerForm.tel"/>
                                    <input type="tel" class="form-control" id="tel" name="tel"
                                           placeholder="Τηλέφωνο" pattern="[0-9]{10}" required>
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
                            <div class="form-group col-md-6 text-left" style="margin-top: -5%;">
                                <label for="inputPassword3" class=" control-label">Password</label>
                                <div class="inputGroupContainer">
                                    <@spring.bind "registerOwnerForm.password"/>
                                    <input type="password" class="form-control" name="password"
                                           id="inputPassword3" placeholder="Password">
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
                        <fieldset class="form-group">
                            <div class="row">
                                <legend class="col-md-4 control-label" style="font-style: normal; font-size: 15px">Τύπος
                                    Ιδιοκτησίας
                                </legend>
                                <div class="col-md-4 offset-md-2 text-left">
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="gridRadios"
                                               id="gridRadios1" value="option1" checked>
                                        <label class="form-check-label" for="gridRadios1" style="font-style: normal;">
                                            Μονοκατοικία
                                        </label>
                                    </div>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="gridRadios"
                                               id="gridRadios2" value="option2">
                                        <label class="form-check-label" for="gridRadios2" style="font-style: normal;">
                                            Μεζονέτα
                                        </label>
                                    </div>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="gridRadios"
                                               id="gridRadios3" value="option3">
                                        <label class="form-check-label" for="gridRadios3" style="font-style: normal;">
                                            Πολυκατοικία
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </fieldset>
                        <div class="form-group row">
                            <div class="col-md-4 ">
                            </div>
                            <div class="col-md-4 text-center">
                                <button type="submit" name="submit" class="btn btn-success">Προσθήκη</button>
                            </div>
                            <div class="col-md-4 nopadding">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <#-- <div class="modal-footer"> -->
        </div>
    </div>
</div>