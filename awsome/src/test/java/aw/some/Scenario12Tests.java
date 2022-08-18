package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Scenario 12 Tests
 *
 */
@DisplayName("Recursion Tests")
public class Scenario12Tests {

    @Test
    @DisplayName("scenario12_Test_01")
    public void scenario12_Test_01() {
        Scenario12 scenario12 = new Scenario12();
        int inputValue = 5;
        Integer expectedValue = 120;
        Integer actualValue = scenario12.factorialRecursion(inputValue);
        assertThat(actualValue,is(equalTo(expectedValue)));
    }
}