import java.util.*;

 class Checking extends Account{
    
    //checkingBalance = checkingBalance - feeAmount;

public void checkingStart(){
    
    System.out.println("Welcome to your checking account.\n");
    System.out.println("Your current balance is $" + checkingBalance + " with a fee amount of $" + feeAmount + " per transaction.");
    System.out.println("\nWould you like to withdraw or deposit?\n" +
        "1 for withdraw and 2 for deposit");
        
        Scanner input = new Scanner(System.in);
        Double checkinggAcc = input.nextDouble();
    
       if(checkinggAcc== 1) {
        System.out.println("How much would you like to withdraw?");
        Scanner myObj = new Scanner(System.in);
            Double amount = myObj.nextDouble();

            withdraw(amount);

       } else if (checkinggAcc == 2) {
        System.out.println("How much would you like to deposit?");
        Scanner myObj = new Scanner(System.in);
            Double amount = myObj.nextDouble();  

            deposit(amount);
             System.out.println("Your new balance is $" + checkingBalance);
        

        
    } else{
        System.out.println("Sorry you typed it incorrect.");
    }

}
}
