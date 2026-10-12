package Encapsulation;


public class BankAccount {
    private long accountNumber;
    private double balance;


    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit: "+amount);
        }
        else{
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw: "+amount);
        }
        else{
            System.out.println("Insuficient balance!");
        }
    }


    public long getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }


}
