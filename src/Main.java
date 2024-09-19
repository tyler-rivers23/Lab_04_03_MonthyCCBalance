

public class Main
{
    public static void main(String[] args)
        {
            double balance = 5000;
            final double annualInterestRate = .17;
            double monthlyInterestRate = annualInterestRate / 12;
            double interest;


            interest = balance * monthlyInterestRate;
            System.out.println("Interest due after 1 month: $" + interest);
            balance += interest;

            interest = balance * monthlyInterestRate;
            System.out.println("Interest due after 2 months: $" + interest);



        }
}
