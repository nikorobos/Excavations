package com.nikos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikos
 * 
 * Ένωση βάσης δεδομένω απο sqlite στο java με τη μέθοδο try and catch
 * Δημιουργούμε μεταβλητή τύπου connection με το όνομα conn
 * Αν δεν καταφέρει να βρει τη φάση δεν επιστρέφει τίποτα
 */
import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;

public class javaConnect {
    Connection conn;
public static Connection ConnectDB() {   
    try{
    Class.forName("org.sqlite.JDBC");
    String dir = System.getProperty("user.dir");
    File file = new File("ExcavationNewDB.db");
    String lineSep=file.separator;
    String filename = dir+lineSep+file;
    System.out.println(filename);
    Connection conn = DriverManager.getConnection("jdbc:sqlite:"+filename);
    return conn;
}catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    return null;
}
}
}
