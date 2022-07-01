
package Atm_Machine;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class CurrentAccount extends Atm_Machine{  
    static double Balance=6000;
    static  double money;
    
    void Withdraw (){    
    try {
        try (Formatter file = new Formatter("C:/Users/virtual/Documents/NetBeansProjects/Ultra Atm Machine/Data/Data.txt")) {
            Scanner obj=new Scanner(System.in);
            System.out.print("\t\t\t\t\tEnter the amount of Money:");
            money=obj.nextDouble();
            if (Balance < 6000) {
                System.out.println("\t\t\t\t\tYou don't have sufficient balance.");
                System.out.println("");
            }
            else {
                Balance = Balance - money;
                System.out.println("\t\t\t\t\tYour current Balance is:"+Balance);
                System.out.println("\t\t\t\t\t"+CurrenDate+" "+formatetime);
                file.format("%s %s %s %s\r\n",Balance,CurrenDate,formatetime,money);
                System.out.println("");
            }
        }
     } 
    catch(IOException e){
        System.out.println("An error occurred."+e);
    }
  }
    void Deposite(){
    try {
        try (Formatter file = new Formatter("C:/Users/virtual/Documents/NetBeansProjects/Ultra Atm Machine/Data/Data.txt")) {
            Scanner obj=new Scanner(System.in);
            System.out.print("\t\t\t\t\tEnter the amount of Money:");
            money=obj.nextDouble();
            Balance = Balance + money;
            System.out.println("");
            file.format("%s %s %s %s\r\n",Balance,CurrenDate,formatetime,money);
        }
     }
    catch(IOException e){
        System.out.println("An error occurred."+e);
     }
  }
    void  CheckBalance(){
    try { 
        try (Formatter file = new Formatter("C:/Users/virtual/Documents/NetBeansProjects/Ultra Atm Machine/Data/Data.txt")) {
            System.out.println("\t\t\t\t\tYour current balance is: "+Balance);
            System.out.println("\t\t\t\t\t"+CurrenDate+" "+formatetime);
            System.out.println("");
            file.format("%s %s %s \r\n",Balance,CurrenDate,formatetime);
        }
     }
    catch(IOException e){
        System.out.println("An error occurred."+e);
     }   
  }
    void Transfer(){
    try { 
        try (Formatter file = new Formatter("C:/Users/virtual/Documents/NetBeansProjects/Ultra Atm Machine/Data/Data.txt")) {
            Scanner obj=new Scanner(System.in);
            System.out.print("\t\t\t\t\tPlease enter his/her Transfer account number:");
            super.setTransferaccountNumbe(obj.nextInt());
            System.out.print("\t\t\t\t\tEnter the amount of Money:");
            money=obj.nextDouble();
            System.out.print("\t\t\t\t\tPlease enter your pin:");
            super.setAccountNumber(obj.nextInt());
            if (Balance < 6000) {
                System.out.println("\t\t\t\t\tYou don't have sufficient balance.");
                System.out.println("");
            }
            else {
                Balance = Balance - money;
                System.out.println("\t\t\t\t\tThe transaction is successfully.");
                System.out.println("\t\t\t\t\tYour current Balance is: "+Balance);
                System.out.println("\t\t\t\t\t"+CurrenDate+" "+formatetime);
                System.out.println("");
            }
            file.format("%s %s %s %s %s\r\n",Balance,CurrenDate,formatetime,super.getTransferaccountNumbe(),money);
        }
    }
    catch(IOException e){
        System.out.println("An error occurred."+e);
     }   
  }
   
    @Override
    void display(){
        System.out.println("\t\t\t\t\t     * Welcome to Our Bank ATM *       ");
        System.out.println("\t\t\t\t\t Please enter the type of the account  ");
        System.out.println("\t\t\t\t\t***************************************");
        System.out.println("\t\t\t\t\t*        1. current                   *");
        System.out.println("\t\t\t\t\t*        2. Savings                   *");
        System.out.println("\t\t\t\t\t*        0. Exit                      *");
        System.out.println("\t\t\t\t\t***************************************");
     }
    @Override
    void details(){
   try{
    File obj=new File("C:/Users/virtual/Documents/NetBeansProjects/Ultra Atm Machine/Data/Data.txt");
       try (Scanner obj1 = new Scanner(obj)) {
           System.out.println("\t\t\t -------------------------------------------------------------------------------------");
           System.out.println("\t\t\t|   Date          |          Send  Account        |    Dabit        |    Cresit       |");
           System.out.println("\t\t\t|-----------------|-------------------------------|-----------------|-----------------|");
           System.out.println("\t\t\t|"+CurrenDate+" |"+getTransferaccountNumbe()+"\t\t\t\t\t\t                "+Balance+"|");
           System.out.println("\t\t\t|"+formatetime    +" \t\t                                 "+ money+   "\t\t\t      |");
           System.out.println("\t\t\t---------------------------------------------------------------------------------------");
       }
        }
        catch(IOException e){
         System.out.println(e);
       }
    }
}
