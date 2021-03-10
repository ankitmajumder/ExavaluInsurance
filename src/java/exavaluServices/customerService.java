//package exavaluServices;
//
//import exavaluUtilities.connectionProvidertoDb;
//import exavaluUtilities.dbparamProvider;
//import exavaluUtilities.propertiesReader;
//import exavaluebean.company;
//import exavaluebean.customer;
//import exavaluebean.policy;
//import java.io.IOException;
//import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.*;
//import view.customerInput;
//
///**
// *
// * @author Thomas
// */
//public class customerService {
//
//    public static boolean add_customer(customer customer) throws SQLException, IOException {
//
//     //   Connection connection = connectionProvidertoDb.getConnectionObject().getConnection();
//
//        //Statement stmt = connection.createStatement();
//        PreparedStatement ps;
//
////insert
//        try {
//            //String rs1 = "insert into customer values(" + customer.getCustomer_id() + ","
//            // + "'" + customer.getCustomer_name() + "','" + customer.getOccupation() + "'," + customer.getAge() + ",'" + customer.getGender() + "'," + customer.getAnnual_income() + ")";
//            // stmt.executeLargeUpdate(rs1);
//            ps = connection.prepareStatement("insert into customer(customer_id,cutomer_name,occupation,age,gender,annual_income) values(?,?,?,?,?,?)  ");
//            //System.out.println("Inserted");
//            ps.setInt(1, customer.getCustomer_id());
//            ps.setString(2, customer.getCustomer_name());
//            ps.setString(3, customer.getOccupation());
//            ps.setInt(4, customer.getAge());
//            ps.setString(5, customer.getGender());
//            ps.setInt(6, customer.getAnnual_income());
//            //  connection.close();
//            int i = ps.executeUpdate();
//
//            ps = connection.prepareStatement("insert into address(customer_id,addressone,addresstwo,city,state,country,pincode) values(?,?,?,?,?,?,?)  ");
//            ps.setInt(1, customer.getCustomer_id());
//            ps.setString(2, customer.getAddress().getAddressone());
//            ps.setString(3, customer.getAddress().getAddresstwo());
//            ps.setString(4, customer.getAddress().getCity());
//            ps.setString(5, customer.getAddress().getState());
//            ps.setString(6, customer.getAddress().getCountry());
//            ps.setInt(7, customer.getAddress().getPincode());
//            i = ps.executeUpdate();
//            System.out.println(i + " records inserted");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        return false;
//
//    }
//
//    public static boolean customer_update(customer customer) throws IOException {
//
//        Connection connection = connectionProvidertoDb.getConnectionObject().getConnection();
//        PreparedStatement ps;
//
//        try {
////            dbparamProvider p = propertiesReader.readPropertise();
////
////            //Class.forName(p.getDriver());
////            Connection con = DriverManager.getConnection(p.getDbUrl() + p.getDbName(), p.getUserName(), p.getPassword());
//
//            // Statement stmt = con.createStatement();
//            ps = connection.prepareStatement("update customer set cutomer_name=?,occupation=?,age=?,gender=?,annual_income=? where customer_id=?");
//
//            ps.setString(1, customer.getCustomer_name());
//            ps.setString(2, customer.getOccupation());
//            ps.setInt(3, customer.getAge());
//            ps.setString(4, customer.getGender());
//            ps.setInt(5, customer.getAnnual_income());
//            ps.setInt(6, customer.getCustomer_id());
//            int i = ps.executeUpdate();
//            System.out.println(i + " records Updated");
////            String rs1 = "Update customer set cutomer_name='" + customer.getCustomer_name() + "',occupation='" + customer.getOccupation() + "',age=" + customer.getAge() + ",gender='" + customer.getGender() + "',annual_income=" + customer.getAnnual_income() + "  ";
////            stmt.executeLargeUpdate(rs1);
//            // System.out.println("Updated");
//            // con.close();
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//
//        return false;
//
//    }
//
//    public static boolean customer_delete(customer customer) throws IOException {
//
//        Connection connection = connectionProvidertoDb.getConnectionObject().getConnection();
//        PreparedStatement ps;
//
//        try {
//            // dbparamProvider p = propertiesReader.readPropertise();
//
//            //Class.forName(p.getDriver());
////            Connection con = DriverManager.getConnection(p.getDbUrl() + p.getDbName(), p.getUserName(), p.getPassword());
////            
////
////            Statement stmt = con.createStatement();
//            ps = connection.prepareStatement("delete from customer where customer_id=? ");
//            ps.setInt(1, customer.getCustomer_id());
//            int i = ps.executeUpdate();
//            System.out.println(i + "Record Deleted");
//            //String rs1 = "delete from customer where customer_id=" + customer.getCustomer_id() + "";
//
//            //stmt.executeLargeUpdate(rs1);
//            // System.out.println("Updated");
//            //   con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        return false;
//    }
//
//    public void assignPolicy(int a, int b, int c) throws IOException, SQLException {
////        customerInput.issue_policy();
////        customer customer = null;
////        policy policy = null;
////        company company = null;
//        Connection connection = connectionProvidertoDb.getConnectionObject().getConnection();
//        PreparedStatement ps;
//        ps = connection.prepareStatement("insert into policyissue(company_id,customer_id,pid)values(?,?,?)  ");
//        ps.setInt(1, a);
//        ps.setInt(2, b);
//        ps.setInt(3, c);
//        int i = ps.executeUpdate();
//        System.out.println(i + "Record Inserted");
//
//    }
//
//    public static boolean customerPolicy() throws IOException, SQLException {
//        Connection connection = connectionProvidertoDb.getConnectionObject().getConnection();
//        PreparedStatement ps = connection.prepareStatement("select companyname,cutomer_name,pname from company,customer,policy,policyissue where company.company_id=policyissue.company_id and customer.customer_id=policyissue.customer_id and policy.pid=policyissue.pid ");
//        ResultSet rs = ps.executeQuery();
//        while (rs.next()) {
//            String companyname = rs.getString("companyname");
//            String customer_name = rs.getString("cutomer_name");
//                String pname = rs.getString("pname");
//            System.out.println(companyname + "  " + customer_name + "   " + pname);
//        }
//        return false;
//    }
//}
