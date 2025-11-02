/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BankAccount;

/**
 *
 * @author Kwize
 */
public class BankAccountDao {
    //JDBC PROPERTIES
    String jdbUrl = "jdbc:mysql://localhost:3306/logindb";
    String dbName = "JeanLucJava";
    String dbPasword = "StrongPass123!";

    //CREATE OPERATIONS 

    public Integer createBankAccount(BankAccount accountObj) {
        //
        try {
            Connection conn = DriverManager.getConnection(jdbUrl, dbName, dbPasword);
            PreparedStatement ps = conn.prepareStatement("INSERT INTO bank_account(account_number,account_name,account_type,account_amount) VALUES(?,?,?,?)");
            ps.setString(1, accountObj.getAccountNumber());
            ps.setString(2, accountObj.getAccountName());
            ps.setString(3, accountObj.getAccountType());
            ps.setDouble(4, accountObj.getAmount());
            //EXECUTE STATEMENT
            int rowAffected = ps.executeUpdate();
            return rowAffected;
            //Close connection
            //conn.close;


        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }


    public Integer updateAccount(BankAccount accountObj) {
        //
        try {
            Connection conn = DriverManager.getConnection(jdbUrl, dbName, dbPasword);
            PreparedStatement ps = conn.prepareStatement("UPDATE bank_account SET account_name=?,account_type=?,account_amount=? WHERE account_number=?");

            ps.setString(1, accountObj.getAccountName());
            ps.setString(2, accountObj.getAccountType());
            ps.setDouble(3, accountObj.getAmount());
            ps.setString(4,accountObj.getAccountNumber());
            //EXECUTE STATEMENT
            int rowAffected = ps.executeUpdate();
            return rowAffected;
            //Close connection
            //conn.close;


        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    public Integer deleteAccount(String accNum) {
        try {
            Connection conn = DriverManager.getConnection(jdbUrl, dbName, dbPasword);
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM bank_account WHERE account_number = ?"
            );
            ps.setString(1, accNum);

            int rowAffected = ps.executeUpdate();
            conn.close(); // close the connection
            return rowAffected;
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }




    public BankAccount getAccountByNumber(String accNum) {
        String sql = "SELECT * FROM bank_account WHERE account_number = ?";
        try (Connection con = DriverManager.getConnection(jdbUrl,dbName,dbPasword);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, accNum);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new BankAccount(
                        rs.getString("account_number"),
                        rs.getString("account_name"),
                        rs.getString("account_type"),
                        rs.getDouble("account_amount")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

