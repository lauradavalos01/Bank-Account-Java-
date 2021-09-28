import java.util.*;

public class Account {

double checkingBalance = 200.0;
int feeAmount = 1;

public void deposit(double amount){
    checkingBalance = checkingBalance + amount;
    System.out.println("Your new balance is $" + checkingBalance);
}
public void withdraw (double amount){
    if(amount <= checkingBalance){

        checkingBalance = checkingBalance - amount;
        System.out.println("Your new balance is $" + (checkingBalance-feeAmount));
    }else {
        System.out.println("Your withdraw amount exceeds balance amount.");
    }
}

public double getcheckingBalance(){
    return checkingBalance;
}

}
