<#import "/spring.ftl" as spring />

<h4 class="mb-3">Search Owner</h4>

<form action="/owner/search" method="post">
    <div class="mb-3">
        <label for="emailpicker">Email</label>
        <div class="input-group">
            <input type="email" class="form-control" id="emailpicker" name="email">
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