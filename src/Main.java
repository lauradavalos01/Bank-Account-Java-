import java.util.*;
public class Main {
    public static void main(String[] args) {
        
       
        
        System.out.println("Welcome. Which account would you like to open:\n" + 
        " Checking or Savings Account?");
        
        System.out.println("Type 1 for Checking or 2 for Saving.");
        Scanner input = new Scanner(System.in);
        int accountChoose = input.nextInt();
        
        
        if (accountChoose == 1) {
            Checking c = new Checking();
            c.checkingStart();
        } else if (accountChoose == 2) {
            Saving s = new Saving();
            s.savingStart();
        } else{
            System.out.println("Sorry you typed it incorrect.");
        }

    }
}
