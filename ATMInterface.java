import java.util.Scanner;
class BankAccount{
    double balance;
    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void Deposit(double DepositedAmount){
        balance+=DepositedAmount;
        System.out.println("Deposit Successful. Current Balance: "+balance);
    }
    public void Withdraw(double WithdrawalAmount){
        if(balance >= WithdrawalAmount){
            balance -= WithdrawalAmount;
            System.out.println("WithDrawal Successful. Current Balance: "+balance);
        }
        else
        System.out.println("Insufficient Funds. Withdrawal Failed.");
    }
}
class ATM{
 BankAccount Account;
 public ATM(BankAccount Account){
     this.Account=Account;
 }
 public void DisplayMenu(){
     System.out.println("Welcome to the ATM");
     System.out.println("1. Withdraw");
     System.out.println("2. Deposit");
     System.out.println("3. Check Balance");
     System.out.println("4. Exit");
 }
 public void Withdraw(double WithdrawalAmount){
     Account.Withdraw(WithdrawalAmount);
 }
 public void Deposit(double DepositedAmount){
     Account.Deposit(DepositedAmount);
 }
 public void CheckBalance(){
     System.out.println("Current Balance: "+Account.getBalance());
 }
}
public class ATMInterface{
    public static void main(String[] args){
        BankAccount account = new BankAccount(1000);
        ATM atm = new ATM(account);
        Scanner sc = new Scanner(System.in);
        while(true){
            atm.DisplayMenu();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            double amount;
            switch(choice){
                case 1:
                    System.out.print("Enter the amount to be withdrawn: ");
                    amount=sc.nextDouble();
                    atm.Withdraw(amount);
                    break;
                case 2:
                    System.out.print("Enter the amount to be deposited: ");
                    amount=sc.nextDouble();
                    atm.Deposit(amount);
                    break;
                case 3:
                    atm.CheckBalance();
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thankyou! Visit Again.");
                    sc.close();
                    return;
                default:
                System.out.print("Invalid choice. Please try Again.");
            }
        }
    }
}