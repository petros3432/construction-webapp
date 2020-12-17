<#import "/spring.ftl" as spring />
<html>
<head>
    <title>Books</title>
</head>
<body>


<div class="container-fluid">
    <div class="row">
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <div class="row">
                <div class="col-md-12 order-md-1">
                    <h3 class="mb-3">Login</h3>
                    <form name='login' action="/login" method='POST'>
                        <div class="mb-3">
                            <div class="input-group">
                                <input type='text' class="form-control" name='username' value=''>
                            </div>
                        </div>

                        <div class="mb-3">
                            <div class="input-group">
                                <input type='password' class="form-control" name='password' value=''>
                            </div>
                        </div>

                        <button class="btn btn-primary btn-lg mt-4" name=submit type="submit">Login</button>
                    </form>
                </div>

            </div>

        </main>

    </div>

</div>



</body>
</html>