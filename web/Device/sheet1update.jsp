<%@page import="java.util.StringTokenizer"%>
<%@page import="javafx.scene.control.Alert" %>
<jsp:useBean id="Admin" class="devicelist.admindao"></jsp:useBean>
<%
    String data = request.getParameter("data");
    StringTokenizer st = new StringTokenizer(data,"*");
    String desc = st.nextToken();
      String model = st.nextToken();
      String finvoice = st.nextToken();
    int qty = Integer.parseInt(st.nextToken());
      String poweredup = st.nextToken();
      String console = st.nextToken();
      String managememt = st.nextToken();
      String comments = st.nextToken();
      int i = Admin.updatesheet1(desc, model, finvoice,qty, poweredup, console, managememt, comments);
    if(i>0)
        out.print("Record Updated");
    else
        out.print("Record not Updated");
%>