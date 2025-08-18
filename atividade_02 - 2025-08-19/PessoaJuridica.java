// Data de entrega: 19/08/2025
public class PessoaJuridica extends Pessoa
{
    private int numEmployees;

    public PessoaJuridica(String name, double annualIncome, int numEmployees)
    {
        super(name. annualIncome);
        this.numEmployees = numEmployees;
    }

    @Override
    public double calculateTax()
    {
        private double tax;

        if(numEmployees > 10) { tax = getAnnualIncome() * 0.14; }
        else { tax = getAnnualIncome() * 0.16; }

        return tax;
    }
}
