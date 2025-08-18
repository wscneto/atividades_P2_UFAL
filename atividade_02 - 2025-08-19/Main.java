// Data de entrega: 19/08/2025

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int numTaxPayers;
        char indOrComp; // Individual or Company
        String name;
        double annualIncome;
        double healthExpenditures;
        int numEmployees;

        System.out.print("Enter the number of tax payers: ");
        numTaxPayers = sc.nextInt();

        for(int i = 0; i < numTaxPayers; i++)
        {
            System.out.println("Tax payer #" + i + " data:");
            
            System.out.print("Individual or Company (i/c)? ");
            indOrComp = sc.next().charAt(0);

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Annual income: ");
            annualIncome = sc.nextDouble();

            if(indOrComp == 'i')
            {
                System.out.print("Health Expenditures: ");
                healthExpenditures = sc.nextLine();
            }
            else
            {
                System.out.print("Number of employees: ");
                numEmployees = sc.nextInt();
            }
        }

        sc.close();
    }
}
