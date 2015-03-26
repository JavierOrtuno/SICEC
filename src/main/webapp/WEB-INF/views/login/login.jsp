<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
        <meta name="viewport" content="width=device-width, initial-scale=1" >
        <title>Login</title>

        <spring:url value="bootstrap/css/bootstrap.min.css" var="bootstrap" />
        <link href="${bootstrap}" rel="stylesheet" >
    </head>

    <body style="padding-top: 10%">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-4">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label for="username" class="col-sm-4 control-label">Username:</label>
                            <div class="col-sm-8">
                                <input type="user" class="form-control" id="username" placeholder="Username">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="passwordId" class="col-sm-4 control-label">Password:</label>
                            <div class="col-sm-8">
                                <input value="" type="password" class="form-control" id="passwordId" placeholder="Password">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-4 col-sm-8">
                                <button type="submit" class="btn btn-default">Submit</button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-4"></div>
            </div>
        </div>
    </body>
</html>
