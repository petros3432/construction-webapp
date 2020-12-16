<#import "/spring.ftl" as spring />

<h3 class="mb-3">
            <span style="font-size: 1em; color: #E63946;">
            <i class="fas fa-search"></i>
            </span></i> Search Repairs</h3>

<form id="createForm" action="/repair/search" method="post">

    <div class="mb-3">
        <label for="datepicker">Starting Date</label>
        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><span data-feather="calendar"></span></span>
            </div>
            <input type="text" class="form-control datepicker" name="scheduledDateStart">
        </div>
    </div>
    <div class="mb-3">
        <label for="datepicker">Ending Date</label>
        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text"><span data-feather="calendar"></span></span>
            </div>
            <input type="text" class="form-control datepicker" name="scheduledDateEnd">
        </div>
    </div>

    <div class="mb-3">
        <label for="ownersAfm">Owner's AFM</label>
        <div class="input-group">
            <input type="text" class="form-control" id="owner-afm" name="afm">
        </div>
    </div>
    <button class="btn btn-lg mt-4 btnblue" type="submit">Search</button>
</form>