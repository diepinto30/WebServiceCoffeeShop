package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Seller_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/opciones.js\"></script>\n");
      out.write("        <title>PRODUCTOS</title> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center><h1>CREAR, ELIMINAR Y MODIFICAR VENDEDOR</h1></center>\n");
      out.write("\n");
      out.write("    <div class=\"Botones\">\n");
      out.write("        <button class=\"b1\" type=\"submit\" value=\"REGISTRAR CLIENTE\">REGISTRAR VENDEDOR</button>\n");
      out.write("        <button class=\"b2\" type=\"submit\" value=\"MODIFICAR CLIENTE\">MODIFICAR VENDEDOR</button>\n");
      out.write("        <button class=\"b3\" type=\"submit\" value=\"ELIMINAR CLIENTE\">ELIMINAR VENDEDOR</button>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <center>\n");
      out.write("        <a class=\"registrarVendedor\" style=\"margin-top: 1.5%;\">\n");
      out.write("            <a>REGISTRAR VENDEDOR</a>\n");
      out.write("            <form action=\"SellerSrt\" method=\"POST\">\n");
      out.write("                <table border=\"0\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Cedula:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtCedula\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nombre</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtNombre\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Apellido</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtApellido\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Telefono celular</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtPhoneNumbre\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" value=\"REGISTRAR\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <div class=\"modificarVendedor\" style=\"margin-top: 2.5%;\">\n");
      out.write("            <a>MODIFICAR VENDEDOR</a>\n");
      out.write("            <form action=\"SellerSrt\" method=\"POST\">\n");
      out.write("                <table border=\"0\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Cedula:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtCedulaM\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nombre</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtNombreM\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Apellido</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtApellidoM\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Telefono celular</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtPhoneNumbreM\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" value=\"MODIFICAR\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"eliminarVendedor\" style=\"margin-top: 2.5%;\">\n");
      out.write("            <a>ELIMINAR VENDEDOR</a>\n");
      out.write("            <form action=\"SellerSrt\" method=\"POST\" >\n");
      out.write("                <table border=\"0\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>IdCedula</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtCedulaE\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" value=\"ELIMINAR\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
