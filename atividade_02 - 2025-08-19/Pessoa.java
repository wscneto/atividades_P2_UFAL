// Data de entrega: 19/08/2025

public abstract class Pessoa
{
    private String name;
    private double annualIncome;

    public Pessoa(String name, double annualIncome)
    {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() { return this.name; }
    public double getAnnualIncome() { return this.annualIncome; }

    public abstract double calculateTax();
}

