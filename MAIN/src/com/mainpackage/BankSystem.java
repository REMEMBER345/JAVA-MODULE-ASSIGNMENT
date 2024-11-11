package com.mainpackage;
import java.util.*;
import com.userpackage.Client;

public class BankSystem {
    public static void main(String[]args){

        Client client = new Client();

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
        scanner.close();
    }
}
