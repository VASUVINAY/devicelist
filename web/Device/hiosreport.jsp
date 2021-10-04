<%@page import="java.util.ArrayList"%>
<%@page import="devicelist.HiosList"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>HIOS Report</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/uniform.css" />
<link rel="stylesheet" href="css/select2.css" />
<link rel="stylesheet" href="css/matrix-style.css" />
<link rel="stylesheet" href="css/matrix-media.css" />
<link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
 <jsp:useBean id="admin" class="devicelist.HiosList"></jsp:useBean>
          <jsp:useBean id="dao" class="devicelist.admindao"></jsp:useBean> 

            <div class="widget-box">
          <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
            <h5>Device List</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered data-table">
              <thead>
                <tr>
                   <th>Port</th><br></br>
                   <th>Is power</th>
                   <th>Device</th>
                   <th>User</th>
                   <th>Device type</th>
                   <th>Management Ip</th>
                   <th>Console_details</th>
                    <th>Remarks</th>
                      <th>Update</th>
                </tr>
              </thead>
              <tbody>
                <%
                   ArrayList<HiosList> data=dao.Fetch3();
                   
                   for(HiosList obj:data)
                   {
                   %>
                 <tr>
                      <td><%=obj.getPort()%></td>
                     <td><%=obj.getIs_power()%></td>
                    
                          <td><%=obj.getDevice()%></td>
                            <td><%=obj.getUser_info()%></td>
                            <td><%=obj.getDevice_type()%></td>
                            <td><%=obj.getManagement_ip()%></td>
                            <td><%=obj.getConsole_details()%></td>
                            <td><%=obj.getRemarks()%></td>
                              
                     
                     <td><button class="update" id="button">Update</button></td>
                  </tr>
              <%}%>
              </tbody>
            </table>
          </div>
              </div>
        

<script>
           $(document).ready(function()
           {
               $('.update').click(function()
               {
                   var currentTd = $(this).parents('tr').find('td');
                   if($(this).text()==='Update')
                   {
                       var len = currentTd.length;
                       var count = 0;
                       $.each(currentTd, function()
                       {
                           if((count>0 && count<len-1) && count!==3)
                               $(this).prop('contenteditable',true);
                           count++;
                       });
                   }
                   else
                   {
                       $.each(currentTd, function()
                       {
                           $(this).prop('contenteditable',false);
                       });
                   }
                   $(this).text($(this).text()==="Update"?"Save":"Update");
                    if($(this).text()==="Update")
                    {
                        var ajaxrequst = null;
                        try
                        {
                            ajaxrequst = new XMLHttpRequest();
                        }
                        catch(exception)
                        {
                            alert("Browser not supported");
                        }

                        ajaxrequst.onreadystatechange = function()
                        {
                            if(ajaxrequst.readyState===4)
                            {
                                alert(ajaxrequst.responseText);
                            }
                        };
                        var currentTd = $(this).parents('tr').find('td');
                        var txt="";
                        $.each(currentTd, function()
                        {
                            txt = txt+$(this).text()+"*";
                        });
                        alert(txt);
                    var url = "hiosupdate.jsp?data="+txt;
                    ajaxrequst.open("GET",url,true);
                    ajaxrequst.send();
                }
                });
            });
           
                    
       </script>
<script src="js/jquery.min.js"></script> 
<script src="js/jquery.ui.custom.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/jquery.uniform.js"></script> 
<script src="js/select2.min.js"></script> 
<script src="js/jquery.dataTables.min.js"></script> 
<script src="js/matrix.js"></script> 
<script src="js/matrix.tables.js"></script>
</body>
</html>
