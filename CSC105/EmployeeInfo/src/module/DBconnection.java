package module;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    public static Connection getMSSQLConnection(){
        try {
            System.out.println("Checkpoint: Initiate DBconnect");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String host = "202.44.9.117";
            //String host = "202.44.9.117";
            //String host = "10.4.38.210";
            String database = "EXAMPLE";
            String user = "CSC105";
            String password = "csprogramming";
            String url = String.format("jdbc:sqlserver://%s;databaseName=%s;user=%s;password=%s", host, database, user, password);
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Checkpoint: DBconnect Success");
            return conn;

        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
