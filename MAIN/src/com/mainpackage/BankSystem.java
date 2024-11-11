package com.mainpackage;
import java.util.*;
import com.userpackage.Client;
import com.accountspackage.Account;

public class BankSystem {
    public static void main(String[]args){

        Client client = new Client();
        Account account = new Account();

        Scanner scanner = new Scanner(System.in);

        System.out.println("The following are user details:");
        System.out.println("Enter Client Name:");
        String clientName= scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter Client Id:");
        int clientId= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter registration code:");
        int registrationCode= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter address:");
        String address= scanner.nextLine();
        client.displayUserDetails(clientName,clientId,registrationCode,address);
        scanner.nextLine();

        System.out.println("Simple Interest as per User's information:");
        System.out.println("Enter Principal:");
        double principal= scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Rate per year:");
        int Rate= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter period:");
        int time= scanner.nextInt();
        scanner.nextLine();
        System.out.println("The Simple Interest is: "+ account.calculateSimpleInterest(principal,Rate,time));

        scanner.close();
    }
}
