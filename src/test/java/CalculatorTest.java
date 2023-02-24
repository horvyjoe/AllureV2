import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Epic("Epic1")
public class CalculatorTest {
    @Test
    @Story(("User story1"))
    @Description("Description to testAdd")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Tag1")
    public void TestAdd() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(5, calc.Add(2, 3));
    }


    @Test
    @Story(("User story2"))
    @Description("Description to testAddWithNegative")
    @Severity(SeverityLevel.CRITICAL)
    @Tag("Tag2")
    public void TestAddWithNegaive() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(-5, calc.Add(-2, -3));

    }
}
