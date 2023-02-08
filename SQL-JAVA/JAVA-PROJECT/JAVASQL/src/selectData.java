// package javasql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class selectData {
    private static Connection conn;
    private static Statement stmt;
    private static String sql;
    private static String url = "jdbc:mysql://localhost/studentdb";
    private static ResultSet rs = null;
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, "root" , "");
            stmt = conn.createStatement();
            sql = "SELECT * FROM students";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4));
            }
            conn.close();
        } catch (Exception e){
            System.out.println(e.toString());;
        }

    }
}
