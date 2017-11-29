<%-- 
    Document   : Seller
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
        <script type="text/javascript" src="js/opciones.js"></script>
        <title>PRODUCTOS</title> 
    </head>
    <body>
    <center><h1>CREAR, ELIMINAR Y MODIFICAR VENDEDOR</h1></center>

    <div class="Botones">
        <button class="b1" type="submit" value="REGISTRAR CLIENTE">REGISTRAR VENDEDOR</button>
        <button class="b2" type="submit" value="MODIFICAR CLIENTE">MODIFICAR VENDEDOR</button>
        <button class="b3" type="submit" value="ELIMINAR CLIENTE">ELIMINAR VENDEDOR</button>

    </div>
    <center>
        <a class="registrarVendedor" style="margin-top: 1.5%;">
            <a>REGISTRAR VENDEDOR</a>
            <form action="SellerSrt" method="POST">
                <table border="0">
                    <tbody>
                        <tr>
                            <td>Cedula:</td>
                            <td><input type="text" name="txtCedula" value="" /></td>
                        </tr>
                        <tr>
                            <td>Nombre</td>
                            <td><input type="text" name="txtNombre" value="" /></td>
                        </tr>
                        <tr>
                            <td>Apellido</td>
                            <td><input type="text" name="txtApellido" value="" /></td>
                        </tr>
                        <tr>
                            <td>Telefono celular</td>
                            <td><input type="text" name="txtPhoneNumbre" value="" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="REGISTRAR" /></td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </a>

        <div class="modificarVendedor" style="margin-top: 2.5%;">
            <a>MODIFICAR VENDEDOR</a>
            <form action="SellerSrt" method="POST">
                <table border="0">
                    <tbody>
                        <tr>
                            <td>Cedula:</td>
                            <td><input type="text" name="txtCedulaM" value="" /></td>
                        </tr>
                        <tr>
                            <td>Nombre</td>
                            <td><input type="text" name="txtNombreM" value="" /></td>
                        </tr>
                        <tr>
                            <td>Apellido</td>
                            <td><input type="text" name="txtApellidoM" value="" /></td>
                        </tr>
                        <tr>
                            <td>Telefono celular</td>
                            <td><input type="text" name="txtPhoneNumbreM" value="" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="MODIFICAR" /></td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
        <div class="eliminarVendedor" style="margin-top: 2.5%;">
            <a>ELIMINAR VENDEDOR</a>
            <form action="SellerSrt" method="POST" >
                <table border="0">
                    <tbody>
                        <tr>
                            <td>IdCedula</td>
                            <td><input type="text" name="txtCedulaE" value="" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="ELIMINAR" /></td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </center>
</body>
</html>

