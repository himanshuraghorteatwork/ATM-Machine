import java.util.Scanner;
import java.util.*;

//class for ATM

class Atm{
    float Balance;
    int PIN=2004;
    
    // to check Pin
    public void checkpin(){
        System.out.println("Enter your Pin");
        Scanner sc = new Scanner (System.in);
        int enteredPin = sc.nextInt();
     if(enteredPin == PIN)
        menu();
else {
        System.out.println("Enter a valid pin");
        menu();
    }
}
// main menu
public void menu() {
    System.out.println("Enter your choice");
    System.out.println("1.Check A/C Balance");
    System.out.println("2.Withdraw Money");
    System.out.println("Depost Money");
    System.out.println("Exxit");
}

Scanner sc = new Scanner(System.in);
int opt = sc.nextInt();

if(opt==1){
    checkBalance();
}
else if (opt==2){
    WithdrawMoney();

}
else if (opt==3){
    depositMoney();
}
else if (opt==4){
    return;
}
else{
    System.out.println("Enter a valid choice");
}

//for checkBalance

public void checkBalance(){
    System.out.println("Balance:$"+Balance);
    menu();
}

//WIthdraw Money

public void WithdrawMoney(){
    System.out.println("Enter amount to Withdraw");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    if(amount>Balance){
        System.out.println("Insufficient Balance");
    }
    else {
        Balance = Balance-amount;
        System.out.println("Money Withdrawal Successful");

    }
    menu();
}

public void depositMoney(){
    System.out.println("Enter The Amount");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    Balance = Balance + amount;
    System.out.println("Money Deposited Successfully");
    menu();
}

public class ATMMachine {
    public static void main(String[] args) {
        
        Atm obj = new Atm();
        obj.checkpin();
    }
}