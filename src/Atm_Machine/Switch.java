
package Atm_Machine;

import java.util.Scanner;

public class Switch extends Display{
    int choice;

  void  CurrentAccount(){
    Scanner obj=new Scanner(System.in);    
        OUTER:
        for (int i = choice; i <=10; i++) {
            System.out.print("\t\t\t\t\tPlease enter the number:");
            choice=obj.nextInt();
            CurrentAccount obj1=new CurrentAccount();
            switch (choice) {
                case 1:
                    obj1.CheckBalance();
                    break;
                case 2:
                    obj1.Deposite();
                    obj1.CheckBalance();
                    break;
                case 3:
                    obj1.Withdraw();
                    break;
                case 4:
                    obj1.Transfer();
                    break;
                case 5:
                    super.Back();
                    break;
                case 6:
                    Run ru=new Run();
                    obj1.details();
                    break;
                case 0:
                    System.out.println("\t\t\t\t\tThank You");
                    break OUTER;
                default:
                    System.out.println("\t\t\t\t\tThis option is not our list.");
                    break OUTER;
            }
        }
} 
  void  SavingAccount(){
    Scanner obj=new Scanner(System.in);    
        OUTER:
        for (int i = choice; i <=20; i++) {
            System.out.print("\t\t\t\t\tPlease enter the number:");
            choice=obj.nextInt();
            SavingAccount obj2=new SavingAccount();
            switch (choice) {
                case 1:
                    obj2.CheckBalance();
                    break;
                case 2:
                    obj2.Deposite();
                    obj2.CheckBalance();
                    break;
                case 3:
                    obj2.Withdraw();
                    break;
                case 4:
                    obj2.Transfer();
                    break;
                case 5:
                    super.Back();
                    break;
                case 6:
                    Run ru=new Run();
                    obj2.details();
                    break;
                case 0:
                    System.out.println("\t\t\t\t\tThank You");
                    break OUTER;
                default:
                    System.out.println("\t\t\t\t\tThis option is not our list.");
                    break OUTER;
            }
        }
   }
 }
