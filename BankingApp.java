package com.bridgelabz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        int capacity=0;
        int choice;
        boolean flag = false;
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        BankDetails bankDetails;
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, BankDetails> hashMap = new HashMap<>();
        System.out.println("~~~~~~~~~Welcome TO Banking Application~~~~~~~~~");
        System.out.println("How many Number of person details you want to enter");
        int number = scanner.nextInt();

        do {
            bankDetails = new BankDetails();
            System.out.println("Enter Account Holder Name");
            String name = scanner.next();
            int accountNumber = (int)(Math.random() * range) + min;
            System.out.println("Enter phone number");
            long phoneNumber = scanner.nextLong();
            bankDetails.setAccHolderName(name);
            bankDetails.setAccNo(accountNumber);
            bankDetails.setPhoneNo(phoneNumber);
            capacity++;
            hashMap.put(accountNumber,bankDetails);
        } while(capacity<number);
do {
        System.out.println("1.withdraw Money\n2.Deposite Money\n3.Show Account Balance");
        choice = scanner.nextInt();
        System.out.println(""+ Arrays.asList(hashMap));
        System.out.println("Enter Account number");
        int personAccount = scanner.nextInt();

        BankDetails bd = hashMap.get(personAccount);
        switch (choice) {
            case 1 :

                System.out.println("Enter amount you want to withdraw");
                double debitAmount = scanner.nextDouble();
                bd.withdrawAmount(debitAmount);
                break;
            case 2 :
                System.out.println("Enter amount you want to deposit");
                double depositAmount = scanner.nextDouble();
                bd.depositMethod(depositAmount);
            case 3 :
                double balance1 = bd.getAccBalance();
                System.out.println("Your account balance is :"+balance1);
                break;
        }
    System.out.println("Do you wan to continue ");
    System.out.println("1.Yes\n2.No");
    choice = scanner.nextInt();
    if (choice==2) {
        flag = true;
    }
    } while(flag = true);
    }
}
