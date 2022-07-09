package com.bridgelabz;
import java.util.Scanner;
public abstract class AccountBalance {

    private double accBalance;

    public double getAccBalance()
    {
        return accBalance;
    }
    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public abstract double getBalance();

    public abstract void setBalance(double balance);
}
