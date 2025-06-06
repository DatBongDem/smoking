package SourceData;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContext;

/**
 *
 * @author Nguyen Tien Dat
 */
public class ConnectDb {

    private String hostName;    
    private String port;
    private String dbName;
    private String user;
    private String pass;

    /**
     * Default constructor 3 lines
     */
    public ConnectDb() {
        this.hostName = "127.0.0.1";         
        this.port  = "1433";     
        this.dbName  = "QuitSmokingDB";     
        this.user  = "sa";     
        this.pass  = "12345";
    }  
    
    public ConnectDb(ServletContext sc) {

        this.hostName = sc.getInitParameter("hostAddress");
        this.dbName = sc.getInitParameter("dbName");
        this.port = sc.getInitParameter("dbPort");
        this.user = sc.getInitParameter("userName");
        this.pass = sc.getInitParameter("userPass");        

    }
    
    public String getURLString() {
        String fm = "jdbc:sqlserver://%s:%s;databaseName=%s;user=%s;password=%s;";
        return String.format(fm, this.hostName,
                this.port, this.dbName, this.user, this.pass);

    }

    
    
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(getURLString());

    }

   

}
