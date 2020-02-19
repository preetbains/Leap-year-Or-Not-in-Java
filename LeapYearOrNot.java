/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class LeapYearOrNot {
    public static void main(String[] args) {
        int a,i=1;
        Scanner sc=new Scanner(System.in);
        
        while(i!=0){
            System.out.println("Enter a year: ");
            a=sc.nextInt();
            if(a%4==0){
                if(a%100==0){
                    if(a%400==0){
                        System.out.println("Leap Year");
                    }
                    else{
                        System.out.println("Not a Leap Year");
                    }
                }
                else{
                    System.out.println("Leap Year");
                }
            }
            else{
                System.out.println("Not a Leap Year");
            }
        
        System.out.println("Press 1 to Continue ,0 to Exit");
           
        i=sc.nextInt();
        }
    }
    
}    
