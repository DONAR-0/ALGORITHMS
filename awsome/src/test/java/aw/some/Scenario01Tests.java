package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@DisplayName("Dynamic Array")
public class Scenario01Tests {

    @DisplayName("TEST_1:Dynamic Array Add values")
    @Test
    public void scenario01_Test_01() {
        Scenario01 scenario01 = new Scenario01();
        scenario01.add(2);
        scenario01.add(3);
        assertThat("", !Objects.isNull(scenario01), is(true));
    }
}
