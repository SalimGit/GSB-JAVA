package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDDConnexion {
    String url ="jdbc:mysql://127.0.0.1:8889/gsb_java";
    String login ="root";
    String passwd="root";
    static Connection cn =null;
    public BDDConnexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        try {
            cn=DriverManager.getConnection(url,login,passwd);
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public static Connection getInstance(){
        if(cn==null){
            new BDDConnexion();
        }
        return cn;
    }

}
