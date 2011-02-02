/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.fanani.basic;

/**
 *
 * @author fanani
 */
public class LoadDriver {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver has ben installed");
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

}
