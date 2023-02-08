// package javasql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertData {
    private static Connection conn;
    private static Statement stmt;
    private static String sql;
    private static String url = "jdbc:mysql://localhost/studentdb";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, "root", "");
            stmt  = conn.createStatement();
            sql = "INSERT INTO students VALUES('999','สมชาย','ชาย','วิทยากร')";
            // sql = "UPDATE students SET name = 'สมหญิง' , gender = 'หญิง' WHERE id = '999'";
            // sql = "DELETE FROM students WHERE id = '999'";

            stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
