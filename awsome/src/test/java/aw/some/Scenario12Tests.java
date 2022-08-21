package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Scenario 12 Tests
 *
 */
@DisplayName("Recursion Tests")
public class Scenario12Tests {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scenario12Tests.class);

    @Test
    @DisplayName("scenario12_Test_01")
    public void scenario12_Test_01() {
        Scenario12 scenario12 = new Scenario12();
        int inputValue = 5;
        Integer expectedValue = 120;
        Integer actualValue = scenario12.factorialRecursion(inputValue);
        assertThat(actualValue,is(equalTo(expectedValue)));
    }


    @Test
    @DisplayName("scenario12_Test_02")
    public void scenario12_Test_02() {
        Scenario12 scenario12 = new Scenario12();
        int inputValue = 8;
        // 0 + 1
        // 1 + 1
        // 1 + 2
        // 3 + 2
        // 5 + 3
        // 8 + 5
        // 13 + 8
        // 21 + 13
        Integer expectedValue = 34;
        Integer actualValue = scenario12.fibonacciRecusrion(inputValue);
        assertThat(actualValue,is(equalTo(expectedValue)));
    }

    @Test
    @DisplayName("scenario12_Test_03")
    public void scenario12_Test_03() {
        Scenario12 scenario12 = new Scenario12();
        int inputValue = 5;
        Integer expectedValue = 20;
        Integer actualValue = scenario12.recursionFunction(inputValue,5);
        assertThat(actualValue,is(equalTo(expectedValue)));
    }

    @Test
    @DisplayName("scenario12_Test_04")
    public void scenario12_Test_04() {
        Scenario12 scenario12 = new Scenario12();
        int inputValue = 5;
        Integer expectedValue = 2;
        Integer actualValue = scenario12.recursionFunctionTwo(inputValue);
        assertThat(actualValue,is(equalTo(expectedValue)));
    }

    @Test
    @DisplayName("scenario12_Test_05")
    public void scenario12_Test_05() {
        Scenario12 scenario12 = new Scenario12();
        int inputValue = 7;
        String expectedValue = "111";
        String actualValue = scenario12.recursionDecimalToBinary(inputValue,new StringBuilder());
        assertThat(actualValue,is(equalTo(expectedValue)));
        inputValue = 8;
        expectedValue = "0001";
        actualValue = scenario12.recursionDecimalToBinary(inputValue,new StringBuilder());
        assertThat(actualValue,is(equalTo(expectedValue)));
    }

    @Test
    @DisplayName("scenario12_Test_05")
    public void scenario12_Test_06() {
        Scenario12 scenario12 = new Scenario12();
        int inputValue = 7;
        //String expectedValue = "111";
        LOGGER.info("DEBUG CODE FOR UNDERSTANDING");
        scenario12.functionRecursionLoop(inputValue);
//        assertThat(actualValue,is(equalTo(expectedValue)));
    }
}