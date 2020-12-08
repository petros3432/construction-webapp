<!DOCTYPE html>
<html>

<head>
    <title>Admin Home Page</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</head>


<body>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">WebSiteName</a>
            </div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="AdminHomePage.ftlh">Home</a></li>
                <li class="active"><a href="PropertyOwners.ftlh">Property Owners</a></li>
                <li class="active" style="color:white"> Admin's email</li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Out</a></li>
            </ul>
        </div>
    </nav>

    <div class="container">
        <!-- First Button Row -->
        <div class="row">
            <div class="col-md-4" style="padding-left:0%;">
                <button href="#AddNew" data-toggle="modal" class="btn btn-primary btn-sm">
                    <span class="glyphicon glyphicon-plus"></span> Add New
                </button>
            </div>
            <div class="col-md-4"></div>
            <div class="col-md-4 text-right" style="padding-right:0%;">
                <!-- Search form -->
                <form class="form-inline d-flex justify-content-center md-form form-sm active-cyan-2 mt-2">
                    <input class="form-control form-control-sm mr-3 w-75" type="text" placeholder="Search"
                        aria-label="Search">
                    <i class="fas fa-search" aria-hidden="true"></i>
                </form>
            </div>
        </div>
        <div class="row">
             <#--Table for the repair items-->
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
        </div>
        <!-- Modal for the add new repair form -->
        <div class="modal fade" id="AddNew" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
            aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">
                            <h4><b>Στοιχεία Ιδιοκτήτη</b></h4>
                        </h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">

                        <div class="container-fluid">
                            <form class="well form-horizontal">
                                <div class="row">
                                    <div class="col-md-1">
                                    </div>
                                    <div class="form-group col-md-5 text-left">
                                        <label for="" class="control-label">Όνομα</label>
                                        <div class="inputGroupContainer">
                                            <input type="text" class="form-control" name="firstName" id="firstName"
                                                placeholder="Όνομα" required>
                                        </div>
                                    </div>
                                    <div class="col-md-1">
                                    </div>
                                    <div class="form-group col-md-5 text-left">
                                        <label for="" class=" control-label">Επίθετο</label>
                                        <div class="inputGroupContainer">
                                            <input type="text" class="form-control" name="lastName" id="lastName"
                                                placeholder="Eπίθετο" required>
                                        </div>
                                    </div>
                                    <div class="col-md-1">
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-1">
                                    </div>
                                    <div class="form-group col-md-5 text-left">
                                        <label for="" class=" control-label">Διεύθυνση</label>
                                        <div class="inputGroupContainer">
                                            <input type="text" class="form-control" name="address" id="address"
                                                placeholder="Διεύθυνση" required>
                                        </div>
                                    </div>
                                    <div class="col-md-1">
                                    </div>
                                    <div class="form-group col-md-5 text-left">
                                        <label for="AFM" class="control-label">ΑΦΜ</label>
                                        <div class="inputGroupContainer">
                                            <input type="text" class="form-control" id="Afm" name="Afm"
                                                placeholder="ΑΦΜ" required>
                                        </div>
                                    </div>
                                    <div class="col-md-1">
                                    </div>
                                </div>


                                <div class="row">
                                    <div class="col-md-1">
                                    </div>
                                    <div class="form-group col-md-5 text-left">
                                        <label for="inputEmail3" class="control-label">Email</label>
                                        <div class="inputGroupContainer">
                                            <input type="email" class="form-control" id="inputEmail3" name="email"
                                                placeholder="Email" required>
                                        </div>
                                    </div>
                                    <div class="col-md-1">
                                    </div>
                                    <div class="form-group col-md-5 text-left">
                                        <label for="" class="control-label">Τηλέφωνο</label>
                                        <div class="inputGroupContainer">
                                            <input type="tel" class="form-control" id="tel" name="tel"
                                                placeholder="Τηλέφωνο" pattern="[0-9]{10}" required>
                                        </div>
                                        <small id="telHelpBlock" class="form-text text-muted">
                                            *Numbers Only*
                                        </small>
                                    </div>
                                    <div class="col-md-1">
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="col-md-1">
                                    </div>
                                    <div class="form-group col-md-5 text-left">
                                        <label for="inputPassword3" class=" control-label">Password</label>
                                        <div class="inputGroupContainer">
                                            <input type="password" class="form-control" name="password"
                                                id="inputPassword3" placeholder="Password">
                                        </div>
                                    </div>

                                </div>
                                <fieldset class="form-group">
                                    <div class="row">
                                        <div class="col-md-1">
                                        </div>
                                        <legend class="col-md-2 control-label pt-0">Τύπος ιδιοκτησίας</legend>
                                        <div class="col-md-6 col-md-offset-3 text-left">
                                            <div class="form-check">
                                                <input class="form-check-input" type="radio" name="gridRadios"
                                                    id="gridRadios1" value="option1" checked>
                                                <label class="form-check-label" for="gridRadios1">
                                                    Μονοκατοικία
                                                </label>
                                            </div>
                                            <div class="form-check">
                                                <input class="form-check-input" type="radio" name="gridRadios"
                                                    id="gridRadios2" value="option2">
                                                <label class="form-check-label" for="gridRadios2">
                                                    Μεζονέτα
                                                </label>
                                            </div>
                                            <div class="form-check disabled">
                                                <input class="form-check-input" type="radio" name="gridRadios"
                                                    id="gridRadios3" value="option3">
                                                <label class="form-check-label" for="gridRadios3">
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
                    <!-- <div class="modal-footer">
                    </div> -->
                </div>
            </div>
        </div>

        <!-- Modal for the details of the repair item -->
        <div class="modal fade" id="DetailModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
            aria-hidden="true">
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
    </div>


    <script src="/js/main.js"></script>


</body>

</html>