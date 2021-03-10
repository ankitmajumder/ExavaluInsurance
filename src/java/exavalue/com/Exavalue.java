///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package exavalue;
//
//import exavaluServices.companyservice;
//import exavaluServices.customerService;
//import static exavaluServices.customerService.customerPolicy;
//import exavaluServices.policyservice;
//import exavaluebean.company;
//import exavaluebean.customer;
//import exavaluebean.policy;
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import view.companyInput;
//import view.customerInput;
//import view.policyInput;
//
///**
// *
// * @author Thomas
// */
//public class Exavalue {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) throws SQLException, IOException {
//        // TODO code application logic here
//        Scanner sc = new Scanner(System.in);
//        customer customer;
//        policy policy;
//        company company;
//        while(true){
//        System.out.println("press 1 for create Company");
//        System.out.println("press 2 for Addcustomer");
//        System.out.println("press 3 for UpdateCustomer");
//        System.out.println("press 4 for Delete a customer");
//        System.out.println("press 5 for AddPolicy");
//        System.out.println("press 6 ShowPolicy");
//        System.out.println("press 7 Assign policy to the customer");
//         System.out.println("press 8 show customer who have policy=");
//        System.out.println("press 9 for exit");
//        System.out.println("Enter Your Choice:");
//        int n = sc.nextInt();
//        
//        switch(n) {
//
//            // customer = customerInput.customerinput_update();
//            // customer=customerInput.customerinput_delete();
//            //policy policy=policyInput.create_policy();
//          case 1:
//                company=companyInput.create_company();
//                boolean check=companyservice.add_company(company);
//                break;
//          case 2:
//                  customer = customerInput.create_Customer();
//                 boolean check1 = customerService.add_customer(customer);
//                break;
//          case 3:
//               customer = customerInput.customerinput_update();
//               boolean check2 = customerService.customer_update(customer);
//             break;
//          case 4:
//              customer=customerInput.customerinput_delete();
//              boolean check3 = customerService.customer_delete(customer);
//              break;
//          case 5:
//                policy=policyInput.create_policy();
//                boolean check4=policyservice.add_customer(policy);
//                break;
//          case 6:
//                System.out.println("*****List of policy*******");
//              boolean check5=policyservice.ShowPolicy();
//              break;
//          case 7:
//              customerInput customerInput=new customerInput();
//            customerService c=new customerService();
//           
//            customerInput.issue_policy(c);
//            break;
//          case 8:
//               System.out.println("*****List of customer who have policy*******");
//              boolean check9=customerService.customerPolicy();
//              
//              
//              break;
//               
//                
//                
//              
//          case 9:
//              break;
//          default:System.out.println("Wrong Input");
//            break;
//            //boolean check2 = customerService.customer_update(customer);
//            //boolean check3 = customerService.customer_delete(customer);
//
//    }
//    }
//    }
//
//}
