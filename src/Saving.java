import java.util.*;

 

 class Saving extends Account {

    double userAdd, interestBalance, result;
    Double savingBalance = 100.0;
    Double interestRate= 0.05;
    

   
    public void savingStart(){

      
        System.out.println("\n Welcome to your savings account. \n");
        
        System.out.println("Your balance is " + savingBalance + 
        " with an interest rate of 5%\n" );

        System.out.println("Would you like to add to your savings?\n" +
        "1 for yes and 2 for no");
        
        Scanner input = new Scanner(System.in);
        Double savingAcc = input.nextDouble();

        if (savingAcc== 1) {

            System.out.println("\nHow much would you like to add?");
           Scanner myObj = new Scanner(System.in);
            Double userAdd = myObj.nextDouble();

             calculateInterest(userAdd);
       
            //System.out.println("Your account balance is now: $" + result + " with added interest of $" + interestBalance );
           

        } else if (savingAcc == 2) {
            System.out.println("Have a nice day!");
        } else{
            System.out.println("Sorry you typed it incorrect.");
        }
    }

    public void calculateInterest(double userAdd){
        
    result = savingBalance + userAdd;
   interestBalance = interestRate * result;    
    
    System.out.println("Your account balance is now: $" + result + " with added interest of $" + interestBalance );

    }
    
 }

