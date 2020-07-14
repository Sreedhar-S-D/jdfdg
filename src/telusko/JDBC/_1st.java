package telusko.JDBC;

import java.sql.*;
public class _1st {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "";
        String uername = "sreedhar";
        String password = "ssd04071712";
        Connection con = DriverManager.getConnection(url,uername,password);

    }
}
