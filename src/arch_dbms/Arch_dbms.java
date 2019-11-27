/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arch_dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Divya Ann
 */
public class Arch_dbms {
static final String DB_URL =
      "jdbc:mysql://localhost:3306/sampdb";
   static final String DB_DRV =
      "com.mysql.jdbc.Driver";
   static final String DB_USER = "root";
   static final String DB_PASSWD = "dak1234561!)000";

   public static void main(String[] args){

      Connection connection = null;
      Statement statement = null;
      ResultSet resultSet = null;

      try{
         connection=DriverManager.getConnection
            (DB_URL,DB_USER,DB_PASSWD);
         statement=connection.createStatement();
         resultSet=statement.executeQuery
            ("SELECT * FROM tab1");
         while(resultSet.next()){
            System.out.printf("%d\t%s\n",
            resultSet.getInt(1),resultSet.getString(2));
       
         }

      }catch(SQLException ex){
      }finally{
         try {
            resultSet.close();
            statement.close();
            connection.close();
         } catch (SQLException ex) {
         }
      }
   }
}
