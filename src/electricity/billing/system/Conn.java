package electricity.billing.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "charlie0001@#");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}