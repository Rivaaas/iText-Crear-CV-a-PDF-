<%-- 
    Document   : test
    Created on : 12-04-2021, 15:56:53
    Author     : rivaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

  
<link rel="stylesheet" href="css.css">
<!-- Compiled and minified JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<!--Import materialize.css-->
<link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>



    <center>
        <div class="row"  justify-content:center>
            <form class="form22" method="POST" action="pd2f.do">
                
                
                <div class="row" >
                    <div class="input-field col s4">

                        <i class="material-icons prefix">account_circle</i> 
                        <input  id="icon_prefix" type="text" name="txtNombreCompleto" class="white-text text-darken">
                        <label for="icon_prefix">Nombre Completo</label>
                    </div>
                    
                  

                    <div class="input-field col s7">
                        <i class="material-icons prefix">description</i>
                        <input id="icon_description" type="text" name="txtRut" placeholder="Ingrese su rut sin puntos ni guion" class="white-text text-darken" >
                    </div>
                    <br>
                    <br>
                    <br>
                    <br>
                    <div class="input-field col s4">
                        <i class="material-icons prefix">email</i>
                        <input id="icon_email" type="text" name="txtEmail" placeholder="Ingresa tu E-Mail" class="white-text text-darken" >
                    </div>

                        <div class="input-field col s6">
                        <i class="material-icons prefix">flash_on</i>
                        <input id="icon_flash_on" type="text" name="txtEdad" placeholder="Fecha de nacimiento" class="white-text text-darken" >
                    </div>
                    <br>
                    <br>
                    <br>
                    <br>

                    <div class="input-field col s4">
                        <i class="material-icons prefix">home</i>
                        <input id="icon_home" type="text" name="txtDireccion" placeholder="Ingrese su direccion" class="white-text text-darken" >
                    </div>


                    <div class="input-field col s4">
                        <i class="material-icons prefix">phone</i>
                        <input id="icon_telephone" type="text" name="txtFono" placeholder="Telefono" class="white-text text-darken" >
                    </div>

                </div>

               <div class="input-field col s4">
                   <h6>Descripcion de ti mismo</h6>
                    <textarea name="txtSobreTi" class="white-text text-darken">           
                    </textarea>
               <h7>Experiencia laboral</h7>
              
                   
                    <textarea name="txtExperiencia"class="white-text text-darken" >
                   
                    </textarea>
                
                <br>
      
                
                    <h7>Nombre de colegio en basica</h7>   
                    <textarea name="txtBasica" class="white-text text-darken">
                    </textarea>
                    
                     <h6>Nombre de colegio en media</h6>
                    <textarea name="txtMedia" class="white-text text-darken">
                   
                    </textarea>
     
                   <h7>Nombre de Universidad, Instituto o centro de formación tecnica</h7>
                    <textarea name="txtUniversidad" class="white-text text-darken">
                   
                    </textarea>
                </div>
                    
                <div class="input-field col " >
                        <i class="material-icons prefix">save</i>
                        <input id="icon_save" type="text" name="nombreAr" placeholder="Nombre del pdf a guardar" class="white-text text-darken" >
                         <input type="submit" value="guardar" class="waves-effect waves-light btn">
                    </div>
                    
                </div>
  
               
               
            </form>
            </center>

        </div>
    </body>

    <script type="text/javascript" src="js/materialize.min.js"></script>
</html>
