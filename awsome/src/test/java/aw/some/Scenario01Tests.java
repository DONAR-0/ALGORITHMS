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
	scenario01.add(5);
	scenario01.add(5);
        assertThat("Null Check", !Objects.isNull(scenario01), is(true));
    }

    @DisplayName("TEST_2:Dynamic Array get Test")
    @Test
    public void scenario01_Test_02() {
	Scenario01 scenario01 = new Scenario01();
	scenario01.add(2);
	scenario01.add(3);
	scenario01.add(4);
	scenario01.add(6);
	assertThat("Add Test and Get Test",scenario01.get(0),is(2));
    }

    @Test
    @DisplayName("TEST_3:Remove and check")
    public void scenario01_Test_03() {
	    Scenario01 scenario01 = new Scenario01();
	    scenario01.add(1);
	    scenario01.add(2);
	    scenario01.add(3);
	    scenario01.add(4);
	    scenario01.remove(2);
	    assertThat("Check Value at 2",scenario01.get(2),is(4));

    }
}
