/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exavaluebean.company;
import java.util.Scanner;

/**
 *
 * @author Thomas
 */
public class companyInput {
    
    public static company create_company() {
        company company = new company();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Want to Create company Yes/No=");
            String yes = sc.next();
            if ("Yes".equals(yes)) {
                System.out.println("Enter Company Detials--");
                System.out.println("Enter company Id=");
                int company_id = sc.nextInt();
                System.out.println("Enter company Name=");
                String companyname = sc.next();
                System.out.println("Enter company Address=");
                String companyAddress = sc.next();
                System.out.println("Enter company email=");
                String companyEmail = sc.next();
                System.out.println("Enter company phoneNumber=");
                String company_phonenumber = sc.next();
                company.setCompany_id(company_id);
                company.setCompanyName(companyname);
                company.setAddress(companyAddress);
                company.setCompanyEmail(companyEmail);
                company.setPhoneNumber(company_phonenumber);
                
            } else {
                break;
            }
        }
        return company;
    }
    
}
