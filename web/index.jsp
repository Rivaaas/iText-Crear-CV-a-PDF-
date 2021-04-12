<%-- 
    Document   : index
    Created on : 12-abr-2021, 2:01:31
    Author     : Erik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>


<%

    String mensaje = "";
    try {
        mensaje = request.getParameter("m");
        if(mensaje == null){
            
            mensaje = "";
            
        }
    } catch (Exception ex) {
        mensaje = "";
    }

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>Curriculum</div>

        <form action="pdf.do" method="POST">
            <input type="text" name="nombre" placeholder="NOMBRE">
            <input type="number" name="edad" placeholder="EDAD">
            <input type="email" name="txtCorreo" placeholder="Correo Electronico">
            <input type="text" name="txtTelefono" placeholder="Telefono">
            <br>
            <br>
            <br>
            <textarea type="text" name="txtExperiencia" required placeholder="Experiencias laborales"></textarea>
            
            
            <input type="text" name="nombreAr" placeholder="INGRESE NOMBRE DEL ARCHIVO A GUARDAR">
            <%--><input type="file" name="Imagen" accept="image/png, .jpeg, .jpg, image/gif"><%--%>

            <input type="submit" value="GENERAR"  class="waves-effect waves-light btn">
        </form>
            
            <a href="test.jsp">TEST</a>


        <div>
            <h1><%= mensaje%></h1>
        </div>
    </body>
    
    <script type="text/javascript" src="js/materialize.min.js"></script>
</html>
