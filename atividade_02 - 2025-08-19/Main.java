// Data de entrega: 19/08/2025

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

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
                healthExpenditures = sc.nextDouble();
                pessoas.add(new PessoaFisica(name, annualIncome, healthExpenditures));
            }
            else
            {
                System.out.print("Number of employees: ");
                numEmployees = sc.nextInt();
                pessoas.add(new PessoaJuridica(name, annualIncome, numEmployees));
            }
        }

        System.out.println();

        System.out.println("TAXES PAID:");
        double total = 0;
        for(Pessoa p : pessoas)
        {
            System.out.println(p.getName() + ": $" + String.format("%.2f", p.calculateTax()));
            total += p.calculateTax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", total));

        sc.close();
    }
}
