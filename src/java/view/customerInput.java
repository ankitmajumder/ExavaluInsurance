///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package view;
//
//import exavaluServices.customerService;
//import exavaluebean.Address;
//import exavaluebean.company;
//import exavaluebean.customer;
//import exavaluebean.policy;
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.*;
//
///**
// * /**
// *
// * @author Thomas
// */
//public class customerInput {
//
//    public static customer create_Customer() {
//        customer customer = new customer();
//        Address Address=new Address();
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("Want to Create Customer Yes/No=");
//            String yes = sc.next();
//            if ("Yes".equals(yes)) {
//                System.out.println("Enter Customer Details=");
//                System.out.println("Enter Customer id=");
//                int customer_id = sc.nextInt();
//                System.out.println("Enter Customer name=");
//                String customer_name = sc.next();
//                System.out.println("occupation=");
//                String occupation = sc.next();
//                System.out.println("Customer AddressOne=");
//                String addressone=sc.next();
//                System.out.println("Customer Addresstwo=");
//                String addresstwo=sc.next();
//                System.out.println("Customer city=");
//                String city=sc.next();
//                System.out.println("Customer State=");
//                String state=sc.next();
//                System.out.println("Customer country=");
//                String country=sc.next();
//                System.out.println("Customer pincode=");
//                int pincode=sc.nextInt();
//                System.out.println("Enter Customer age=");
//                int age = sc.nextInt();
//                System.out.println("Enter Customer gender=");
//                String gender = sc.next();
//                System.out.println("Enter Customer annualIncome=");
//                int annual_income = sc.nextInt();
//                
////                System.out.print(customer_id + " " +  " " + customer_name + " " + occupation+ " "+ age+ " "+gender+ " "+ annual_income );
//                customer.setCustomer_id(customer_id);
//                customer.setCustomer_name(customer_name);
//                customer.setOccupation(occupation);
//                Address.setAddressone(addressone);
//                Address.setAddresstwo(addresstwo);
//                Address.setCity(city);
//                Address.setState(state);
//                Address.setCountry(country);
//                Address.setPincode(pincode);
//                customer.setAge(age);
//                customer.setGender(gender);
//                customer.setAnnual_income(annual_income);
//                customer.setAddress(Address);
//                
//
//            } else {
//                break;
//            }
//
//        }
//        return customer;
//    }
//
//    public static customer customerinput_update() {
//        customer customer = new customer();
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("Want to Update Customer Yes/No=");
//            String yes = sc.next();
//            if ("Yes".equals(yes)) {
//                //System.out.println("Enter Customer Details=");
//                System.out.println("Enter Customer id for which you want to update =");
//                int customer_id = sc.nextInt();
//                System.out.println("Enter new customername  =");
//                String customer_name = sc.next();
//                System.out.println("Enter new customeroccupation ");
//                String occupation = sc.next();
//                System.out.println("Enter new customerage ");
//                int age = sc.nextInt();
//                System.out.println("Enter new customergender ");
//                String gender = sc.next();
//                System.out.println("Enter new annualincome ");
//                int annual_income = sc.nextInt();
//                customer.setCustomer_id(customer_id);
//                customer.setCustomer_name(customer_name);
//                customer.setOccupation(occupation);
//                customer.setAge(age);
//                customer.setGender(gender);
//                customer.setAnnual_income(annual_income);
//            } else {
//                break;
//            }
//
//        }
//        return customer;
//    }
//
//    public static customer customerinput_delete() {
//        customer customer = new customer();
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("Want to delete Customer Yes/No=");
//            String yes = sc.next();
//            if ("Yes".equals(yes)) {
//                System.out.println("Enter Customer id for which you want to delete =");
//                int customer_id = sc.nextInt();
//                customer.setCustomer_id(customer_id);
//
//            } else {
//                break;
//            }
//        }
//
//        return customer;
//    }
//     public  void issue_policy(customerService customerService) throws IOException, SQLException
//     {
//          company company =new company();
//          customer customer = new customer(); 
//          policy policy=new policy();
//           Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("Want to Add policy to the Customer Yes/No=");
//            String yes = sc.next();
//            if ("Yes".equals(yes)) {
//               System.out.println("enter company id");
//               int company_id=sc.nextInt();
//               System.out.println("enter customer id");
//               int customer_id=sc.nextInt();
//               System.out.println("enter policy id");
//               int policy_id=sc.nextInt();
//               company.setCompany_id(company_id);
//               customer.setCustomer_id(customer_id);
//               policy.setPid(policy_id);
//            customerService.assignPolicy(company.getCompany_id(),customer.getCustomer_id(),policy.getPid());
//            }
//            else{
//                break;
//            }
//        } 
// 
//     }
//    
//
//}
