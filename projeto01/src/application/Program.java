package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import db.DB;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();

            stmt = conn.createStatement();

            rs = stmt.executeQuery("select * from department");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name"));
                // System.out.println(rs.getString(1));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(stmt);
            DB.closeConnection();
        }

    }

}
