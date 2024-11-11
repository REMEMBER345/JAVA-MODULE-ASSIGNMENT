package com.transactionpackage;
public class Transaction {
    double balance;
    public Transaction(double initialBalance){
        if (initialBalance>0){
            this.balance= initialBalance;
        }
        else{
            this.balance=1000;
        }
    }
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
        }
        else {
            System.out.println("Deposited amount must be greater than shs.1000");
        }
    }
}
