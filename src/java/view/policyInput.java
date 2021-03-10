/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exavaluebean.policy;
import java.util.Scanner;

/**
 *
 * @author Thomas
 */
public class policyInput {
    
    public static policy create_policy() {
        policy policy = new policy();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Want to Create policy Yes/No=");
            String yes = sc.next();
            if ("Yes".equals(yes)) {
                System.out.println("Enter policy Details=");
                System.out.println("Enter policy id=");
                int pid = sc.nextInt();
                System.out.println("Enter policy name=");
                String pname = sc.next();
                System.out.println("expirydate=");
                int expirydate = sc.nextInt();
                System.out.println("Enter launchdate=");
                int launchdate = sc.nextInt();
                System.out.println("Enter premiumammount=");
                int premiumammount = sc.nextInt();
                System.out.println("Enter CoverageAmmount=");
                int coverageammount = sc.nextInt();
                System.out.println("Enter minimum age=");
                int miniumage = sc.nextInt();
                System.out.println("Enter maxAge=");
                int maxage=sc.nextInt();
                policy.setPid(pid);
                policy.setName(pname);
                policy.setExpiryDate(expirydate);
                policy.setLaunchDate(launchdate);
                policy.setPremimumAmmount(premiumammount);
                policy.setCoverageammount(coverageammount);
                policy.setMinumumage(miniumage);
                policy.setMaxage(maxage);
                
            } else {
                break;
            }
            
           
            
        }
         return policy;
    }
}
