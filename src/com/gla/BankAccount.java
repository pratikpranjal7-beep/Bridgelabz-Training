package com.gla;

class BankAccount{
    int accountNumber;
    double balance;
    BankAccount(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
}
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(int accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }
    void displayAccountType(){
        System.out.println("Savings");
    }
}
class CheckingAccount extends BankAccount{
    double withdrawalLimit;
    CheckingAccount(int accountNumber,double balance,double withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit=withdrawalLimit;
    }
    void displayAccountType(){
        System.out.println("Checking");
    }
}
class FixedDepositAccount extends BankAccount{
    int tenure;
    FixedDepositAccount(int accountNumber,double balance,int tenure){
        super(accountNumber,balance);
        this.tenure=tenure;
    }
    void displayAccountType(){
        System.out.println("FixedDeposit");
    }
}
class Main2{
    public static void main(String[]args){
        BankAccount a=new SavingsAccount(1,1000,5);
        ((SavingsAccount)a).displayAccountType();
    }
}
