
package Atm_Machine;

import java.io.File;
import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


abstract class Atm_Machine {

    private int accountNumber;
    private int pin;
    private int TransferaccountNumbe;
  
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getTransferaccountNumbe() {
        return TransferaccountNumbe;
    }

    public void setTransferaccountNumbe(int TransferaccountNumbe) {
        this.TransferaccountNumbe = TransferaccountNumbe;
    }
    
      Date date=new Date();
      DateFormat dateFormat=new SimpleDateFormat("E, MMM dd yyyy");
      String CurrenDate = dateFormat.format(date);
      LocalTime  time=LocalTime.now();
      DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
      String formatetime=time.format(formatter);
             
    void File(){
    try {  
      File obj=new File("Data");
      obj.mkdir();  
      if (obj.createNewFile()) {  
        System.out.println("File created: " + obj.getName());  
      } else {  
        System.out.println("File already exists.");  
      }
    } catch (IOException e) {
      System.out.println("An error occurred."+e);    
      }  
    }
    abstract void display();
    abstract void details(); 
}


