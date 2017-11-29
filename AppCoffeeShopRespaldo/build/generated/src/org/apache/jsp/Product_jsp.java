package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <center><h1>CREAR, ELIMINAR Y MODIFICAR PRODUCTOS</h1></center>\n");
      out.write("\n");
      out.write("    <div class=\"Botones\">\n");
      out.write("        <button class=\"b1\" type=\"submit\" value=\"REGISTRAR CLIENTE\">REGISTRAR PRODUCTOS</button>\n");
      out.write("        <button class=\"b2\" type=\"submit\" value=\"MODIFICAR CLIENTE\">MODIFICAR PRODUCTOS</button>\n");
      out.write("        <button class=\"b3\" type=\"submit\" value=\"ELIMINAR CLIENTE\">ELIMINAR PRODUCTOS</button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <a class=\"registrarProductos\" style=\"margin-top: 1.5%;\">\n");
      out.write("            <a>REGISTRAR PRODUCTOS</a>\n");
      out.write("            <form action=\"ProductSrt\" method=\"POST\">\n");
      out.write("                <table border=\"0\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Id Producto:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtproducto\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nombre del Poducto</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtNombre\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Unidades Disponibles</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtUDisponibles\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Precio</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtPrecio\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Descripción</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtDes\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" value=\"REGISTRAR\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"registrarModificar\" style=\"margin-top: 1.5%;\">\n");
      out.write("            <a>REGISTRAR PRODUCTOS</a>\n");
      out.write("            <form action=\"ProductSrt\" method=\"POST\">\n");
      out.write("                <table border=\"0\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Id Producto:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtproducto\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nombre del Poducto</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtNombre\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Unidades Disponibles</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtUDisponibles\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Precio</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtPrecio\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Descripción</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtDes\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" value=\"MODIFICAR\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </a>\n");
      out.write("        <div class=\"eliminarProductos\" style=\"margin-top: 2.5%;\">\n");
      out.write("            <a>ELIMINAR PRODUCTOS</a>\n");
      out.write("            <form action=\"ProductSrt\" method=\"POST\" >\n");
      out.write("                <table border=\"0\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Id Producto</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txtProE\" value=\"\" /></td>\n");
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
