import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast din månedsløn i hele kroner: ");
        int monthlyIncome = input.nextInt();
        double monthlyTax = CalculateTax(monthlyIncome);
        System.out.println("Du skal betale " + monthlyTax  + " kr. i skat om måneden.");
    }

    public static double CalculateTax(int monthlyIncome) {
        //Skriv din implementation her.

        int personalAllowance = 48000;
        int highIncomeTax = 568900;
        double taxYearly = 0;
        double tax = 0.37;
        double highTax = 0.15;

        if(monthlyIncome * 12 > highIncomeTax) {
            taxYearly = (((monthlyIncome * 12 - personalAllowance) * tax) + (monthlyIncome * 12 - highIncomeTax) * highTax);
        }
        else if(monthlyIncome * 12 > personalAllowance) {
            taxYearly = ((monthlyIncome * 12 - personalAllowance) * tax);
        }

        taxYearly /= 12;

        return taxYearly;
    }
}
