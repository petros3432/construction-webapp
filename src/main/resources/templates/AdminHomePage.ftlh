<!DOCTYPE html>
<html>

<head>
    <title>Admin Home Page</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    <script src="../js/main.js"></script>



</head>

<body style="margin:20px auto">

<#--BootSrap NavBar-->
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">WebSiteName</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="AdminHomePage.ftlh">Home</a></li>
            <li class="active"><a href="PropertyOwners.ftlh">Property Owners</a></li>
            <li class="active" style="color:white"> Admin's email  </li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-user"></span>Sign Out</a></li>
        </ul>
    </div>
</nav>

<center>
    <h2><span style="font-size:25px; color:blue; font-weight:bold;">
				Repairs</span>
    </h2>
</center>

<div class="container">
    <br /><br />
    <div class="row header col-sm-12" style="text-align:center;color:green">
			<span class="pull-left">
				<button  data-toggle="modal" class="btn btn-primary btn-sm">
					<span class="glyphicon glyphicon-plus"></span> Add New
				</button></span>
        <span class="pull-right">
				<button data-toggle="modal" class="btn btn-primary btn-sm">Advanced Search
				</button></span>

        <div style="height:50px;"></div>
        <table class="table table-striped table-bordered table-responsive table-hover" id="empTable">
            <thead>
            <th>
                <center>Type</center>
            </th>
            <th>
                <center>Address</center>
            </th>
            <th>
                <center>cost</center>
            </th>
            <th>
                <center>State</center>
            </th>
            <th>
                <center>Scheduled Date</center>
            </th>
            <th>
                <center>Action</center>
            </th>
            </thead>
            <tbody class='content'></tbody>
        </table>


        <div class="modal fade" id="DetailModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        ...
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>

                    </div>
                </div>
            </div>
        </div>


    </div>
</div>
</body>

</html>