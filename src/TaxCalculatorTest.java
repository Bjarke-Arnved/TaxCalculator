import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {
    @Test
    public void NoTax() {
       double actual = TaxCalculator.CalculateTax(4000);
       assertEquals(0, actual, "Hvis man ikke tjener mere end personfradraget skal man ikke betale noget i skat");
    }

    @Test
    public void SmallSalary() {
        double actual = TaxCalculator.CalculateTax(1000);
        assertEquals(0, actual, "Hvis man ikke bruger hele personfradraget får man ikke skat tilbage");
    }

    @Test
    public void SomeTax() {
        double actual = TaxCalculator.CalculateTax(10000);
        assertEquals(2220, actual, "Du skal betale 37% af det du tjener over 4000 kr. om måneden.");
    }

    @Test void HighTax() {
        double actual = TaxCalculator.CalculateTax(60000);
        assertEquals(22346.25, actual, "Du skal betale 15% skal af det beløb du tjener over 568.900 kr.");
    }
}
