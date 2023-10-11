package com.pluralsight;

import java.util.Scanner;
public class AddressBuilder {
    public static void main(String[] args) {

        StringBuilder info = new StringBuilder();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please provide the following information:");
        System.out.print("Full Name: ");
        String name = myScanner.nextLine();

        System.out.print("Billing Street: ");
        String bStreet = myScanner.nextLine();

        System.out.print("Billing City: ");
        String bCity = myScanner.nextLine();

        System.out.print("Billing State: ");
        String bState = myScanner.nextLine();

        System.out.print("Billing Zip: ");
        String bZip = myScanner.nextLine();

        System.out.print("Shipping Street: ");
        String sStreet = myScanner.nextLine();

        System.out.print("Shipping City: ");
        String sCity = myScanner.nextLine();

        System.out.print("Shipping State: ");
        String sState = myScanner.nextLine();

        System.out.print("Shipping Zip: ");
        String sZip = myScanner.nextLine();


        info.append(name + "\n" );
        info.append("\n");
        info.append("Billing Address:\n");
        info.append(bStreet + "\n");
        info.append(bCity + ", ");
        info.append(bState + " ");
        info.append(bZip + "\n");
        info.append("\n");
        info.append("Shipping Address:\n");
        info.append(sStreet + "\n");
        info.append(sCity + ", ");
        info.append(sState + " ");
        info.append(sZip);

        System.out.println(info);

    }
}
