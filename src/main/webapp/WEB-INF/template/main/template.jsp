<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SICEC</title>

        <tiles:insertAttribute name="head" ignore="true" />
    </head>
    <body>
        <tiles:insertAttribute name="header" />
        <div id="module" class="row affix-row">
            <div class="col-sm-3 col-md-3 affix-sidebar">
                <tiles:insertAttribute name="menu" />
            </div>
            <div class="col-sm-7 col-md-9 affix-content">
                <div class="container">
                    <tiles:insertAttribute name="body" />
                </div>
            </div>
        </div>
    </body>   
</html>