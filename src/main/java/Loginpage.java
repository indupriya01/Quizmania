
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;

public class Loginpage {
public static boolean validate(String email,String password)
{
	boolean status = false;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "indupriya@2001");
        PreparedStatement ps = con.prepareStatement("SELECT * FROM login WHERE email=?");
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            String storedPassword = rs.getString("password");
            if (password.equals(storedPassword)) {
                status = true;
            }
        }
        con.close(); // Close the connection
    } catch (Exception e) {
        e.printStackTrace();
    }
    return status;
}
}
