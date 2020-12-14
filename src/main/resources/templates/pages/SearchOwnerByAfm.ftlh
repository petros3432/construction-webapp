<!DOCTYPE html>
<html>

<head>
    <title>Admin Home Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link href="/../css/main2.css" rel="stylesheet"/>
    <link rel="icon" href="/../css/helmet.png" type="image/x-icon">
</head>


<body>
<#include "../partials/topnavbar1.ftlh">
<h2 class="hello-title">Search Owner By Afm</h2>

<form class="well form-horizontal" action="/owner/search" name="searchOwner" method="POST">
    <label for="afm" class=" control-label">AFM</label>
    <input type="text" class="form-control" name="afm" id="afm"
           placeholder="afm" required>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>


<#include "../partials/scripts.ftlh">
</body>

</html>