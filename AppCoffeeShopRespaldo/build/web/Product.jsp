<%-- 
    Document   : Product
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
    <center><h1>CREAR, ELIMINAR Y MODIFICAR PRODUCTOS</h1></center>

    <div class="Botones">
        <button class="b1" type="submit" value="REGISTRAR CLIENTE">REGISTRAR PRODUCTOS</button>
        <button class="b2" type="submit" value="MODIFICAR CLIENTE">MODIFICAR PRODUCTOS</button>
        <button class="b3" type="submit" value="ELIMINAR CLIENTE">ELIMINAR PRODUCTOS</button>
    </div>

    <center>
        <a class="registrarProductos" style="margin-top: 1.5%;">
            <a>REGISTRAR PRODUCTOS</a>
            <form action="ProductSrt" method="POST">
                <table border="0">
                    <tbody>
                        <tr>
                            <td>Id Producto:</td>
                            <td><input type="text" name="txtproducto" value="" /></td>
                        </tr>
                        <tr>
                            <td>Nombre del Poducto</td>
                            <td><input type="text" name="txtNombre" value="" /></td>
                        </tr>
                        <tr>
                            <td>Unidades Disponibles</td>
                            <td><input type="text" name="txtUDisponibles" value="" /></td>
                        </tr>
                        <tr>
                            <td>Precio</td>
                            <td><input type="text" name="txtPrecio" value="" /></td>
                        </tr>
                        <tr>
                            <td>Descripción</td>
                            <td><input type="text" name="txtDes" value="" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="REGISTRAR" /></td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </a>
        <a class="registrarModificar" style="margin-top: 1.5%;">
            <a>REGISTRAR PRODUCTOS</a>
            <form action="ProductSrt" method="POST">
                <table border="0">
                    <tbody>
                        <tr>
                            <td>Id Producto:</td>
                            <td><input type="text" name="txtproducto" value="" /></td>
                        </tr>
                        <tr>
                            <td>Nombre del Poducto</td>
                            <td><input type="text" name="txtNombre" value="" /></td>
                        </tr>
                        <tr>
                            <td>Unidades Disponibles</td>
                            <td><input type="text" name="txtUDisponibles" value="" /></td>
                        </tr>
                        <tr>
                            <td>Precio</td>
                            <td><input type="text" name="txtPrecio" value="" /></td>
                        </tr>
                        <tr>
                            <td>Descripción</td>
                            <td><input type="text" name="txtDes" value="" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="MODIFICAR" /></td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </a>
        <div class="eliminarProductos" style="margin-top: 2.5%;">
            <a>ELIMINAR PRODUCTOS</a>
            <form action="ProductSrt" method="POST" >
                <table border="0">
                    <tbody>
                        <tr>
                            <td>Id Producto</td>
                            <td><input type="text" name="txtProE" value="" /></td>
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
