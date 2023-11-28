import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///travelandtourismmanagement", "root", "jeetu");
            s = c.createStatement();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
