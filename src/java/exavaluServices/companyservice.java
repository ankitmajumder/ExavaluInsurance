///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package exavaluServices;
//
//import exavaluUtilities.connectionProvidertoDb;
//import exavaluebean.company;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
///**
// *
// * @author Thomas
// */
//public class companyservice {
//
//    public static boolean add_company(company company) throws IOException, SQLException {
//
//      //  Connection connection = connectionProvidertoDb.getConnectionObject().getConnection();
//
//        PreparedStatement ps;
//
//        ps = connection.prepareStatement("insert into company(company_id,companyname,address,companyemail,phonenumber)values(?,?,?,?,?) ");
//        ps.setInt(1, company.getCompany_id());
//        ps.setString(2, company.getCompanyName());
//        ps.setString(3, company.getAddress());
//        ps.setString(4, company.getCompanyEmail());
//        ps.setString(5, company.getPhoneNumber());
//        int i = ps.executeUpdate();
//        System.out.println(i + " records inserted");
//        return false;
//    }
//
//}
