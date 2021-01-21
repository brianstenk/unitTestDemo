import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    Calculator calculator = new Calculator();
    @Test
    public void testAdd(){
             Assert.assertEquals(6, calculator.add(1,5));
    }
}
