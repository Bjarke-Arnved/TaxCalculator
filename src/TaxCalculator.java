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
        return 0;
    }
}
