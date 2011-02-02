/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fanani.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author fanani
 */
public class MakingConnection {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            String jdbcDriver = "com.mysql.jdbc.Driver";
            Class.forName(jdbcDriver);
            System.out.println("Ping jdbc driver OK !");
            String username = "root";
            String password = "admin";
            String url = "jdbc:mysql://localhost:3306/training";
            System.out.println("Try establishing connection  . . . ");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established . . . ");

            Statement stat = conn.createStatement();
            String showTB = "select name , description from T_CATEGORY ;";
            ResultSet rs = stat.executeQuery(showTB);
            System.out.println("NAME" + "   |   " + "DESCTIPTION");
            while (rs.next()) {
                System.out.println(rs.getString("name") + "   |   " + rs.getString("description"));
//                System.out.print(rs.getString("description"));
            }
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
