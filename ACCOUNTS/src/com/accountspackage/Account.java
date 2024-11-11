package com.accountspackage;

public class Account {
    double principal;
    int rate;
    int time;
    public double calculateSimpleInterest(double principal, int rate, int time){
        return(principal*rate*time);
    }
}
