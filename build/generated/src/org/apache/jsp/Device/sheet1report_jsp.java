package org.apache.jsp.Device;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import devicelist.sheet1pojo;

public final class sheet1report_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Sheet1 Report</title>\n");
      out.write("<meta charset=\"UTF-8\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-responsive.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/uniform.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/select2.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/matrix-style.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/matrix-media.css\" />\n");
      out.write("<link href=\"font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" ");
      devicelist.sheet1pojo admin = null;
      synchronized (_jspx_page_context) {
        admin = (devicelist.sheet1pojo) _jspx_page_context.getAttribute("admin", PageContext.PAGE_SCOPE);
        if (admin == null){
          admin = new devicelist.sheet1pojo();
          _jspx_page_context.setAttribute("admin", admin, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("          ");
      devicelist.admindao dao = null;
      synchronized (_jspx_page_context) {
        dao = (devicelist.admindao) _jspx_page_context.getAttribute("dao", PageContext.PAGE_SCOPE);
        if (dao == null){
          dao = new devicelist.admindao();
          _jspx_page_context.setAttribute("dao", dao, PageContext.PAGE_SCOPE);
        }
      }
      out.write(" \n");
      out.write("\n");
      out.write("          <div class=\"widget-box\">\n");
      out.write("          <div class=\"widget-title\"> <span class=\"icon\"><i class=\"icon-th\"></i></span>\n");
      out.write("            <h2>Device List</h2>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"widget-content nopadding\">\n");
      out.write("            <table class=\"table table-bordered data-table\">\n");
      out.write("              <thead>\n");
      out.write("                <tr>\n");
      out.write("                   <th>Description of item</th>\n");
      out.write("                   <th>Model no</th>\n");
      out.write("                   <th>From invoice</th>\n");
      out.write("                   <th>Quantity</th>\n");
      out.write("                   <th>Powered up</th>\n");
      out.write("                   <th>Console</th>\n");
      out.write("                   <th>Management</th>\n");
      out.write("                    <th>Comments</th>\n");
      out.write("                      <th>Update</th>\n");
      out.write("                </tr>\n");
      out.write("              </thead>\n");
      out.write("              <tbody>\n");
      out.write("                ");

                   ArrayList<sheet1pojo> data=dao.Fetch1();
                   
                   for(sheet1pojo obj:data)
                   {
                   
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                      <td>");
      out.print(obj.getDescription_of_item());
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(obj.getModel_no());
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                          <td>");
      out.print(obj.getFrom_invoice());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(obj.getQty());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(obj.getPowered_up());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(obj.getConsole());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(obj.getManagement());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(obj.getConsole());
      out.write("</td>\n");
      out.write("                              \n");
      out.write("                     \n");
      out.write("                     <td><button class=\"update\" id=\"button\">Update</button></td>\n");
      out.write("                  </tr>\n");
      out.write("              ");
}
      out.write("\n");
      out.write("              </tbody>\n");
      out.write("            </table>\n");
      out.write("          </div>\n");
      out.write("              </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("           $(document).ready(function()\n");
      out.write("           {\n");
      out.write("               $('.update').click(function()\n");
      out.write("               {\n");
      out.write("                   var currentTd = $(this).parents('tr').find('td');\n");
      out.write("                   if($(this).text()==='Update')\n");
      out.write("                   {\n");
      out.write("                       var len = currentTd.length;\n");
      out.write("                       var count = 0;\n");
      out.write("                       $.each(currentTd, function()\n");
      out.write("                       {\n");
      out.write("                           if((count>0 && count<len-1) && count!==3)\n");
      out.write("                               $(this).prop('contenteditable',true);\n");
      out.write("                           count++;\n");
      out.write("                       });\n");
      out.write("                   }\n");
      out.write("                   else\n");
      out.write("                   {\n");
      out.write("                       $.each(currentTd, function()\n");
      out.write("                       {\n");
      out.write("                           $(this).prop('contenteditable',false);\n");
      out.write("                       });\n");
      out.write("                   }\n");
      out.write("                   $(this).text($(this).text()===\"Update\"?\"Save\":\"Update\");\n");
      out.write("                    if($(this).text()===\"Update\")\n");
      out.write("                    {\n");
      out.write("                        var ajaxrequst = null;\n");
      out.write("                        try\n");
      out.write("                        {\n");
      out.write("                            ajaxrequst = new XMLHttpRequest();\n");
      out.write("                        }\n");
      out.write("                        catch(exception)\n");
      out.write("                        {\n");
      out.write("                            alert(\"Browser not supported\");\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        ajaxrequst.onreadystatechange = function()\n");
      out.write("                        {\n");
      out.write("                            if(ajaxrequst.readyState===4)\n");
      out.write("                            {\n");
      out.write("                                alert(ajaxrequst.responseText);\n");
      out.write("                            }\n");
      out.write("                        };\n");
      out.write("                        var currentTd = $(this).parents('tr').find('td');\n");
      out.write("                        var txt=\"\";\n");
      out.write("                        $.each(currentTd, function()\n");
      out.write("                        {\n");
      out.write("                            txt = txt+$(this).text()+\"*\";\n");
      out.write("                        });\n");
      out.write("                        alert(txt);\n");
      out.write("                    var url = \"sheet1update.jsp?data=\"+txt;\n");
      out.write("                    ajaxrequst.open(\"GET\",url,true);\n");
      out.write("                    ajaxrequst.send();\n");
      out.write("                }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("                    \n");
      out.write("       </script>\n");
      out.write("<script src=\"js/jquery.min.js\"></script> \n");
      out.write("<script src=\"js/jquery.ui.custom.js\"></script> \n");
      out.write("<script src=\"js/bootstrap.min.js\"></script> \n");
      out.write("<script src=\"js/jquery.uniform.js\"></script> \n");
      out.write("<script src=\"js/select2.min.js\"></script> \n");
      out.write("<script src=\"js/jquery.dataTables.min.js\"></script> \n");
      out.write("<script src=\"js/matrix.js\"></script> \n");
      out.write("<script src=\"js/matrix.tables.js\"></script>\n");
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
