package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "INSERT INTO seller" +
                            "(Name, Email, BirthDate, BaseSalary, DepartmentId) " +
                            "VALUES " +
                            "(?, ?, ?, ?, ?);",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, "Carl Purple");
            st.setString(2, "carl@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("29/12/2004").getTime()));
            st.setDouble(4, 3000.0);
            st.setDouble(5, 1);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();

                while (rs.next()) {
                    // variavel id na coluna 01
                    int id = rs.getInt(1);

                    System.out.println("Done! the new id is " + id);
                }

            } else {
                System.out.println("Nenhuma linha alterada");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }

}
