// Data de entrega: 19/08/2025
public class PessoaFisica extends Pessoa
{
    private double healthExpenditures;

    public PessoaFisica(String name, double annualIncome, double healthExpenditures)
    {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double calculateTax()
    {
        private double tax;
        if(getAnnualIncome() < 20000)
        {
            tax = getAnnualIncome() * 0.15;
        }
        else
        {
            tax = getAnnualIncome() * 0.25;
        }

        tax -= healthExpenditures * 0.5;

        return tax;
    }
}
