import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import quiz_2.CalculatorTest;

@Suite
@SelectClasses({CompleteUnitTest.class, DateCheckerTest.class, CalculatorTest.class})
public class CompleteUnitTest {
    
}
