package com.ug14.rumashsakit;
import java.sql.*;

public class DAO {
    private String url = "jbdc:sqlite:rumahsakit.db";

    public Connection connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null){
                    conn.close();
                }
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }

    public void createNewDatabase(){
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null){
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Nama DB : " +  meta.getDriverName());
                System.out.println("DB Tercipta");
            }
        }
    }

    public void inputPasien(Pasien pasien){
        
    }
}
