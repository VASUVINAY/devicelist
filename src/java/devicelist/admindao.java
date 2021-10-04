/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devicelist;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class admindao {
    Connection con=null;
public Connection getConnection() throws Exception
    {
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/device_list","root","");
 return conn;

    }
public ArrayList<sheet1pojo> Fetch1() throws Exception
{
    ArrayList<sheet1pojo> data=new ArrayList<sheet1pojo>();
    con=getConnection();
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from sheet1");
    while(rs.next())
    {
     sheet1pojo obj=new sheet1pojo();
     obj.setDescription_of_item(rs.getString(1));
     obj.setModel_no(rs.getString(2));
     obj.setFrom_invoice(rs.getString(3));
     obj.setQty(rs.getInt(4));
     obj.setPowered_up(rs.getString(5));
     obj.setConsole(rs.getString(6));
     obj.setManagement(rs.getString(7));
     obj.setComments(rs.getString(8));
     data.add(obj);
    }
    return data;
}
public ArrayList<sheet2pojo> Fetch2() throws Exception
{
    ArrayList<sheet2pojo> data=new ArrayList<sheet2pojo>();
    con=getConnection();
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from sheet2");
    while(rs.next())
    {
     sheet2pojo obj=new sheet2pojo();
     obj.setIs_power(rs.getString(1));
     obj.setDevice(rs.getString(2));
     obj.setUser_info(rs.getString(3));
     obj.setDevice_type(rs.getString(4));
     obj.setManagement_ip(rs.getString(5));
     obj.setConsole_details(rs.getString(6));
     obj.setRemarks(rs.getString(7));
     data.add(obj);
    }
    return data;
}
public ArrayList<HiosList> Fetch3() throws Exception
{
    ArrayList<HiosList> data=new ArrayList<HiosList>();
    con=getConnection();
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from hios_list");
    while(rs.next())
    {
     HiosList obj=new HiosList();
     obj.setPort(rs.getString(1));
     obj.setIs_power(rs.getString(2));
     obj.setDevice(rs.getString(3));
     obj.setUser_info(rs.getString(4));
     obj.setDevice_type(rs.getString(5));
     obj.setManagement_ip(rs.getString(6));
     obj.setConsole_details(rs.getString(7));
     obj.setRemarks(rs.getString(8));
     
     data.add(obj);
    }
    return data;
}
public int updatesheet1(String description,String model,String finvoice,int qty,
        String poweredup,String console,String management,String comments) throws Exception
{
    int i=0;
    con=getConnection();
    Statement stmt=con.createStatement();
    i=stmt.executeUpdate("update sheet1 set  Description_of_item='"+description+"',From_invoice='"+finvoice+"',qty='"+qty+"',powered_up='"+poweredup+"',console='"+console+"',management='"+management+"',comments='"+comments+"' where Model_no='"+model+"'");
    return i;
}
public int updatesheet2(String ispower,String device,String user_info,
        String devicetype,String managementip,String console,String remarks) throws Exception
{
    int i=0;
    con=getConnection();
    Statement stmt=con.createStatement();
    i=stmt.executeUpdate("update sheet2 set  is_power='"+ispower+"',device='"+device+"',user_info='"+user_info+"',device_type='"+devicetype+"',management_ip='"+managementip+"',console_details='"+console+"',remarks='"+remarks+"' where device='"+device+"'");
    return i;
}
public int updatehios(String port,String ispower,String device,
        String user,String devicetype,String managementip,String console,String remarks) throws Exception
{
    int i=0;
    con=getConnection();
    Statement stmt=con.createStatement();
    i=stmt.executeUpdate("update hios_list set  port='"+port+"',is_power='"+ispower+"',device='"+device+"',user_info='"+user+"',device_type='"+devicetype+"',management_ip='"+managementip+"',console_details='"+console+"',Remarks='"+remarks+"' where device='"+device+"'");
    return i;
}
}
