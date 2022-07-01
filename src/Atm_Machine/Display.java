
package Atm_Machine;

import java.util.Scanner;

public class Display {
        
  public void Back(){
    Atm_Machine atm;
    atm=new CurrentAccount();
    Switch sw=new Switch();
    atm.display();
      
    Scanner obj=new Scanner(System.in);
    System.out.print("\t\t\t\t\tYour Option :");
    int choice=obj.nextInt();
      
      switch (choice) {
          case 1:
              System.out.print("\t\t\t\t\tPlease enter your account number:");
              atm.setAccountNumber(obj.nextInt());
              System.out.print("\t\t\t\t\tPlease enter your pin:");
              atm.setPin(obj.nextInt());
              atm=new SavingAccount();
              atm.display();
              sw.CurrentAccount();            
              break;
          case 2:
              System.out.print("\t\t\t\t\tPlease enter your account number: ");
              atm.setAccountNumber(obj.nextInt());
              System.out.print("\t\t\t\t\tPlease enter your pin:");
              atm.setPin(obj.nextInt());
              atm=new SavingAccount();
              atm.display();
              sw.SavingAccount();;
              break;
          case 0:
              System.out.println("\t\t\t\t\tThank You");
              break;
          default:
              System.out.println("\t\t\t\t\tThis option is not our list.");
              break;
      }
  }  
}
