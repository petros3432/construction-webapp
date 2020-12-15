<#import "/spring.ftl" as spring />

<h4 class="mb-3">Search Owner</h4>

<form action="/owner/search" method="post">
    <div class="mb-3">
        <label for="emailpicker">Email</label>
        <div class="input-group">
            <input type="email" class="form-control" id="emailpicker" name="email">
        </div>
    </div>

    <div class="row">
        <div class="form-group col-md-6 text-left">
            <label for="ownersAfm">Owner's AFM</label>
            <div class="input-group">
                <input type="text" class="form-control" id="owner-afm" name="afm">
            </div>
        </div>
    </div>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>