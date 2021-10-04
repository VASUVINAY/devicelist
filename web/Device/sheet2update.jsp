<%@page import="java.util.StringTokenizer"%>
<%@page import="javafx.scene.control.Alert" %>
<jsp:useBean id="Admin" class="devicelist.admindao"></jsp:useBean>
<%
    String data = request.getParameter("data");
    StringTokenizer st = new StringTokenizer(data,"*");
    String ispower = st.nextToken();
      String device = st.nextToken();
      String user_info = st.nextToken();
      String devicetype = st.nextToken();
      String managementip = st.nextToken();
      String console = st.nextToken();
      String remarks = st.nextToken();
      int i = Admin.updatesheet2(ispower, device, user_info,devicetype, managementip, console, remarks);
    if(i>0)
        out.print("Record Updated");
    else
        out.print("Record not Updated");
%>