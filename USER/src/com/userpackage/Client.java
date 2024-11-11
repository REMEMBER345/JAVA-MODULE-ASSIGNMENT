package com.userpackage;
import com.userpackage.Client;
public class Client {
    String clientName;
    int clientId;
    int registrationCode;
    String address;
    public void displayUserDetails(String clientName, int clientId, int registrationCode, String address)
    {
       System.out.println("\nUser Details: ");
        System.out.println("Client Name:" + clientName);
        System.out.println("Client Id: "+ clientId);
        System.out.println("Registration code: " + registrationCode);
        System.out.println("Client address: " + address);
    }

}
