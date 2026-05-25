/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class db {
    
    public static Connection mycon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_db", "root", "deneth");
        } catch (Exception e) {
            System.out.println("Database Connection Error: " + e.getMessage());
        }
        return con;
    }
}