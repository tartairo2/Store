import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author hugod
 */

public class ConnBDD {
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdc:mysql://localhost:3306/istore","root","0000");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connecction faieled ERROR");
        }
        return connection;

    }     
}
