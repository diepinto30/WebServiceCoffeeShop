<%-- 
    Document   : Cliente
    Author     : diego
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
        <script type="text/javascript" src="js/opciones.js"></script>
        <title>Cliente</title> 
    </head>
    <body>
    <center><h1>CREAR, ELIMINAR Y MODIFICAR CLIENTE</h1></center>

    <div class="Botones">
        <button class="b1" type="submit" value="REGISTRAR CLIENTE">REGISTRAR CLIENTE</button>
        <button class="b2" type="submit" value="MODIFICAR CLIENTE">MODIFICAR CLIENTE</button>
        <button class="b3" type="submit" value="ELIMINAR CLIENTE">ELIMINAR CLIENTE</button>
    </div>

    <center>
        <a class="registrarCliente" style="margin-top: 1.5%;">
            <a>REGISTRAR CLIENTE</a>
            <form action="ClienteStr" method="POST">
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
                            <td>Email</td>
                            <td><input type="text" name="txtEmail" value="" /></td>
                        </tr>
                        <tr>
                            <td>Telefono celular</td>
                            <td><input type="text" name="txtPhoneNumbre" value="" /></td>
                        </tr>
                        <tr>
                            <td>Dirección</td>
                            <td><input type="text" name="txtAddress" value="" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="REGISTRAR" /></td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </a>

        <div class="modificarCliente" style="margin-top: 2.5%;">
            <a>MODIFICAR CLIENTE</a>
            <form action="ClienteStr" method="POST">
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
                            <td>Email</td>
                            <td><input type="text" name="txtEmailM" value="" /></td>
                        </tr>
                        <tr>
                            <td>Telefono celular</td>
                            <td><input type="text" name="txtPhoneNumbreM" value="" /></td>
                        </tr>
                        <tr>
                            <td>Dirección</td>
                            <td><input type="text" name="txtAddressM" value="" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="MODIFICAR" /></td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
        <div class="eliminarCliente" style="margin-top: 2.5%;">
            <a>ELIMINAR CLIENTE</a>
            <form action="ClienteStr" method="POST" >
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
    <div>
        <jsp:useBean id="DAOSelect" scope="page" class="DAO.DAOCliente" />
        <div class="cont_tabla" style="overflow-x:auto;">
            <h1>Tabla Doctor</h1>
            <%
                ResultSet rsDoc = DAOSelect.Select();
            %>

            <table class="table table-bordered" border ="1" id="tabla">
                <tr style="background-color:#FEBE10">
                    <th>Identificacion</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Especialidad</th>
                    <th>Estado</th>
                </tr>
                <%
                    while (rsDoc.next()) {
                %>
                <tr>
                    <td><%=rsDoc.getString(1)%></td>
                    <td><%=rsDoc.getString(2)%></td>
                    <td><%=rsDoc.getString(3)%></td>
                    <td><%=rsDoc.getString(4)%></td>
                    <td><%=rsDoc.getString(5)%></td>

                </tr>
                <%
                    }
                %>


            </table>
        </div>

    </div>
</body>
</html>

