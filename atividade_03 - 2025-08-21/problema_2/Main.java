// Data de entrega: 21/08/2025

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number;
        String holder;
        double balance;
        double withdrawLimit;
        double amount;

        System.out.println("Enter account data:");
        
        System.out.print("Number: ");
        number = sc.nextInt();
        
        System.out.print("Holder: ");
        sc.nextLine();
        holder = sc.nextLine();

        System.out.print("Initial balance: ");
        balance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit); // Create new Account object

        System.out.println();

        try
        {
            System.out.print("Enter amount for withdraw: ");
            amount = sc.nextDouble();

            account.withdraw(amount);

            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
