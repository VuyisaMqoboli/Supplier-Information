/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supplierinformation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author 27672
 */
public class SupplierDAO {
    static final String DATABASE_URL = "jdbc:derby://localhost:1527/Northwind";
    static final String dbUsername = "adminstrator"; 
    static final String dbPassword = "password";
    
    public static void delete(SupplierPOJO s){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = "DELETE FROM Suppliers WHERE SupplierId='"+ s.getSupplierId()+"'";    
        int ok = 0;
        
        try{
               connection = DriverManager.getConnection(DATABASE_URL, dbUsername, dbPassword);
               statement = connection.prepareStatement(sql);    
               resultSet = statement.executeQuery();
               
              while(resultSet.next()){ 
                   resultSet.getString(1);
                   resultSet.getString(2);
                   resultSet.getString(3);
                   resultSet.getString(4);
                   resultSet.getString(5);
                   resultSet.getString(6);
                   resultSet.getString(7);
                   resultSet.getString(8);
                   resultSet.getString(9);
                   resultSet.getString(10);
                   resultSet.getString(11);
                   resultSet.getString(12);
                   ok +=1;
             }
              if(ok>0){
                  JOptionPane.showMessageDialog(null, "Supplier information has been deleted.");
              }
             
           }catch(SQLException SQLExpcetion){
               JOptionPane.showMessageDialog(null,"Error: Could not read from the Database"+ SQLExpcetion);
           }catch(Exception exception){
               JOptionPane.showMessageDialog(null, "Error: "+ exception);
           }finally {
               try{
                 if(statement != null)  
                     statement.close();
               }catch(Exception exception){
                   JOptionPane.showMessageDialog(null, exception.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);
               }try{
                 if(connection != null)  
                     connection.close();
               }catch(Exception exception){
                   JOptionPane.showMessageDialog(null, exception.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);
               }
           }
        
    }
    
    public static void populateSupplier(SupplierPOJO s){
        Connection connection = null;
        Statement statement = null;
        String sql = "SELECT * FROM suppliers";      
        int ok = 0;
        try{
               connection = DriverManager.getConnection(DATABASE_URL, dbUsername, dbPassword);
               statement = connection.createStatement();
               ResultSet resultSet = statement.executeQuery(sql);
         
                   while(resultSet.next()){
                       if(s.getSupplierId().equals(resultSet.getString(1))){
                       s.setSupplierId(resultSet.getString(1));
                       s.setCompanyName(resultSet.getString(2));
                       s.setContactName(resultSet.getString(3));
                       s.setContactTitle(resultSet.getString(4));
                       s.setAddress(resultSet.getString(5));
                       s.setCity(resultSet.getString(6));
                       s.setRegion(resultSet.getString(7));
                       s.setPostalCode(resultSet.getString(8));
                       s.setCountry(resultSet.getString(9));
                       s.setPhone(resultSet.getString(10));
                       s.setFax(resultSet.getString(11));
                       s.setHomepage(resultSet.getString(12));
                       ok +=1;
                       }
                   }
                   if(ok==0)
                        JOptionPane.showMessageDialog(null, "Supplier Id does not exist", "Warning",JOptionPane.WARNING_MESSAGE);
                   
           }catch(SQLException SQLExpcetion){
               JOptionPane.showMessageDialog(null,"Error: Could not read from the Database"+ SQLExpcetion);
           }catch(Exception exception){
               JOptionPane.showMessageDialog(null, "Error: "+ exception);
           }finally {
               try{
                 if(statement != null)  
                     statement.close();
               }catch(Exception exception){
                   JOptionPane.showMessageDialog(null, exception.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);
               }try{
                 if(connection != null)  
                     connection.close();
               }catch(Exception exception){
                   JOptionPane.showMessageDialog(null, exception.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);
               }
           }
    }
    
    public static void update(SupplierPOJO s){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = "UPDATE  SET supplierId= '"+ s.getSupplierId()+"' ";
        
        int ok = 0;
        
        try{
               connection = DriverManager.getConnection(DATABASE_URL, dbUsername, dbPassword);
               statement = connection.prepareStatement(sql);    
               resultSet = statement.executeQuery();
               
              while(resultSet.next()){ 
                   
             }
              if(ok>0){
                  JOptionPane.showMessageDialog(null, "Supplier information has been deleted.");
              }
             
           }catch(SQLException SQLExpcetion){
               JOptionPane.showMessageDialog(null,"Error: Could not read from the Database"+ SQLExpcetion);
           }catch(Exception exception){
               JOptionPane.showMessageDialog(null, "Error: "+ exception);
           }finally {
               try{
                 if(statement != null)  
                     statement.close();
               }catch(Exception exception){
                   JOptionPane.showMessageDialog(null, exception.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);
               }try{
                 if(connection != null)  
                     connection.close();
               }catch(Exception exception){
                   JOptionPane.showMessageDialog(null, exception.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);
               }
           }
        
    }
}
