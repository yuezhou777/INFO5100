package Q1;

import java.util.HashMap;
import java.util.Scanner;

public class Atm {
    private double availableAmountInMachine;
    User user;
    HashMap<Integer, Integer> userData = new HashMap<>(); // bank account number and password are stored in userData

    public Atm(User user) {
        this.user = user;
        userData.put(user.getBankAccountNumber(), user.getPassword());
    }

    public void logIn(){
        System.out.println("Welcome To Use ATM" + "\n Please Login Or Register For New User" +"\n Please Enter Account Number");
        Scanner s = new Scanner(System.in);
        int bankAccountNumber = s.nextInt();
        if(userData.containsKey(bankAccountNumber)) {
            System.out.println("Please Enter Password");
            int password = s.nextInt();
            if(password == userData.get(bankAccountNumber)) {
                System.out.println("Login Succeed");
            }
            System.out.println("Invalid Password, Press 1 To Retry, 2 To Reset Password");
            switch(s.nextInt()) {
                case 1:
                    logIn();
                    break;
                case 2:
                    forgotPassword();
                    break;
            }
            return;
        }

        System.out.println("Create Account With This Account Number?" + bankAccountNumber + "\nPress 1 To Set Password, 2 To Quit");
        if(s.nextInt() == 1) {
            System.out.println("Set Password");
            int newPass = s.nextInt();
            userData.put(bankAccountNumber, newPass);
            System.out.println("Register Succeed");
        }

        atmOption();
    }

    public void forgotPassword() {
        System.out.println("Please Enter Name");
        Scanner s = new Scanner(System.in);
        String nameIn = s.nextLine();
        System.out.println("Please Enter Age");
        int ageIn = s.nextInt();
        System.out.println("Please Enter Phone Number");
        int phoneIn = s.nextInt();
        if(nameIn.equals(user.getName()) && ageIn == user.getAge() && phoneIn == user.getPhoneNumber()) {
            System.out.println("Enter new Password");
            int newPass = s.nextInt();
            userData.put(user.getBankAccountNumber(), newPass);
            System.out.println("Password Reset");
            logIn();
        }
        System.out.println("Personal Information Incorrect");
    }

    public void atmOption() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please select an account Option: \n " +
                "Press 1 for checking account Balance \n" +
                "Press 2 for withdrawal \n" +
                "Press 3 for deposit \n" +
                "Press 4 for changing password \n" +
                "Press 5 for checking recent transactions \n" +
                "Press 6 to exit");
        switch(s.nextInt()) {
            case 1:
                availableBalance();
                break;
            case 2:
                withdrawal();
                break;
            case 3:
                deposit();
                break;
            case 4:
                changePassword();
                break;
            case 5:
                recentTransactions();
                break;
            case 6:
                return;
        }
    }

    public double availableBalance() {
        return user.getAvailableBalance();
    }

    public double withdrawal() {
        Scanner s = new Scanner(System.in);
        double amount = s.nextDouble();
        if(amount < user.getAvailableBalance() && amount < availableAmountInMachine) {
            user.setAvailableBalance(- amount);
            double transactionFee = setTransactionFee(amount);
            availableAmountInMachine -= amount;
            availableAmountInMachine += transactionFee;
        }

        user.transactions.put("withdrawal", amount);
        return user.getAvailableBalance();
    }

    public double deposit() {
        Scanner s = new Scanner(System.in);
        double amount = s.nextDouble();
        double transactionFee = setTransactionFee(amount);
        user.setAvailableBalance(amount - transactionFee);
        availableAmountInMachine += amount;
        availableAmountInMachine += transactionFee;

        user.transactions.put("deposit", amount);
        return user.getAvailableBalance();
    }

    public void recentTransactions() {
        user.print();
    }

    public void changePassword() {
        forgotPassword();
    }

    public double getAvailableAmountInMachine() {
        return availableAmountInMachine;
    }

    public void setAvailableAmountInMachine(double availableAmountInMachine) {
        this.availableAmountInMachine = availableAmountInMachine;
    }

    public double setTransactionFee(double transactionAmount) {
        return transactionAmount * 0.04;
    }

}
