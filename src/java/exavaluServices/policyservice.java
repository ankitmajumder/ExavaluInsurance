///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package exavaluServices;
//
//import exavaluUtilities.connectionProvidertoDb;
//import exavaluebean.customer;
//import exavaluebean.policy;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.*;
//
///**
// *
// * @author Thomas
// */
//public class policyservice {
//    
//    
//     public static boolean add_customer(policy policy) throws SQLException, IOException {
//
//    //    Connection connection = connectionProvidertoDb.getConnectionObject().getConnection();
//
//       
//        PreparedStatement ps;
//
////insert
//        try {
//            
//          //  ps = connection.prepareStatement("insert into policy(pid,pname,expirydate,launchdate,preimumammount,coverageammount,minimumagecoverage,maxage) values(?,?,?,?,?,?,?,?)  ");
//            ps.setInt(1, policy.getPid());
//            ps.setString(2, policy.getName());
//            ps.setInt(3, policy.getExpiryDate());
//            ps.setInt(4,policy.getLaunchDate());
//            ps.setInt(5, policy.getPremimumAmmount());
//            ps.setInt(6,policy.getCoverageammount());
//            ps.setInt(7,policy.getMinumumage());
//            ps.setInt(8,policy.getMaxage());
//            
//            int i = ps.executeUpdate();
//            System.out.println(i + " records inserted");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        return false;
//
//    }
//    public static boolean ShowPolicy() throws IOException, SQLException{
//        Connection connection = connectionProvidertoDb.getConnectionObject().getConnection();
//        PreparedStatement ps =connection.prepareStatement("select * from policy");
//        ResultSet rs=ps.executeQuery(); 
//        while(rs.next()){  
//    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6)
//    +" "+rs.getInt(7)+" "+rs.getInt(8)
//    );  
//}     
//   
//        return false;
//    }
//    
//}
