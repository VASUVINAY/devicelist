<%@page import="java.util.StringTokenizer"%>
<%@page import="javafx.scene.control.Alert" %>
<jsp:useBean id="Admin" class="devicelist.admindao"></jsp:useBean>
<%
    String data = request.getParameter("data");
    StringTokenizer st = new StringTokenizer(data,"*");
    String port = st.nextToken();
      String ispower = st.nextToken();
      String device = st.nextToken();
      String user = st.nextToken();
      String devicetype = st.nextToken();
      String managememtip = st.nextToken();
      String console = st.nextToken();
      String Remarks = st.nextToken();
      int i = Admin.updatehios(port, ispower, device,user, devicetype, managememtip, console, Remarks);
    if(i>0)
        out.print("Record Updated");
    else
        out.print("Record not Updated");
%>