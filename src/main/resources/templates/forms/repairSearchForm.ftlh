<#import "/spring.ftl" as spring />

<h4 class="mb-3">Search Repair</h4>

<form action="/repair/search" method="post">

<#--    <div class="mb-3">-->
<#--        <label for="datepicker">Starting Date</label>-->
<#--        <div class="input-group">-->
<#--            <div class="input-group-prepend">-->
<#--                <span class="input-group-text"><span data-feather="calendar"></span></span>-->
<#--            </div>-->
<#--            <input type="text" class="form-control" id="datepicker" name="scheduledDateStart">-->
<#--        </div>-->
<#--    </div>-->
<#--    <div class="mb-3">-->
<#--        <label for="datepicker">Ending Date</label>-->
<#--        <div class="input-group">-->
<#--            <div class="input-group-prepend">-->
<#--                <span class="input-group-text"><span data-feather="calendar"></span></span>-->
<#--            </div>-->
<#--            <input type="text" class="form-control" id="datepicker" name="scheduledDateEnd">-->
<#--        </div>-->
<#--    </div>-->

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="ownersAfm">Owner's AFM</label>
            <div class="input-group">
                <input type="text" class="form-control" id="owner-afm" name="afm">
            </div>
        </div>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>