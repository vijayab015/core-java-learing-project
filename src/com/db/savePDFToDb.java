package com.db;

import java.sql.*;
import java.io.*;

public class savePDFToDb {
    public static void main(String[] args) {
        DB db = new DB();
        Connection conn=db.dbConnect(
                "jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
        
        db.insertPDF(conn,"C:\\My_Unifier\\sample.pdf");
        db.getPDFData(conn);
    }
    
}

class DB {
    public DB() {}
    
    public Connection dbConnect(String db_connect_string,
            String db_userid, String db_password) {
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    db_connect_string, db_userid, db_password);
            
            System.out.println("connected");
            return conn;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void insertPDF(Connection conn,String filename) {
        int len;
        String query;
        PreparedStatement pstmt;
        
        try {
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);
            len = (int)file.length();
            query = ("insert into TableImage VALUES(?,?,?)");
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1,file.getName());
            pstmt.setInt(2, len);
            
            //method to insert a stream of bytes
            pstmt.setBinaryStream(3, fis, len); 
            pstmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getPDFData(Connection conn) {
        
        byte[] fileBytes;
        String query;
        try {
            query = 
              "select data from tableimage where filename like '%.pdf%'";
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(query);
            if (rs.next()) {
                fileBytes = rs.getBytes(1);
                OutputStream targetFile=  new FileOutputStream(
                        "d://servlet//jdbc//newtest.pdf");
                targetFile.write(fileBytes);
                targetFile.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
};
