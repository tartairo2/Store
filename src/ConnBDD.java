import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnBDD {
    public static Connection getConnection() {
        Connection connection = null;
        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "o7hARjiKK6*pf2Mmb");
        } catch (SQLException ex) { 

            JOptionPane.showMessageDialog(null, "La connexion a échoué. Erreur : " + ex.getMessage());
        }
        return connection;
    }
}
