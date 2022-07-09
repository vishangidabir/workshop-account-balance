package com.bridgelabz;

public class BankDetails extends AccountBalance {

    private int accNo;
    private long phoneNo;
    private String accHolderName;
    private double userBalance;

    public String getAccHolderName() {
        return accHolderName;
    }
    public int getAccNo() {
        return accNo;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    @Override
    public String toString() {
        return "BankDetails{" +
                "accNo='" + accNo + '\'' +
                ", phoneNo=" + phoneNo +
                ", accHolderName='" + accHolderName + '\'' +
                '}';
    }

    public void withdrawAmount(double debitAmount) {
        if (this.getAccBalance() >= debitAmount) {
            double remainingBalance = this.getAccBalance()-debitAmount;
            setAccBalance(remainingBalance);
            //System.out.println("New Acc balance is " + remainingBalance);
        } else {
            System.out.println("No Balance");
        }
    }

    public void depositMethod(double debitAmount) {
            double remainingBalance = this.getAccBalance()+debitAmount;
            this.setAccBalance(remainingBalance);
            System.out.println("New Acc balance is " + remainingBalance);

    }
    @Override
    public double getBalance() {
        userBalance = getAccBalance();
        return userBalance;
    }
    @Override
    public void setBalance(double balance) {
        setAccBalance(balance);
    }
}
//    Create an account with Account.no, Phn no, Acc holder name, Acc balance
//        I need to perform deposit and withdraw in that account !
//        Use polymorphism and Encapsulation