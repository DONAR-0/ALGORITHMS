package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@DisplayName("Three Sum Closet")
public class Scenario25Tests {


    //General Example One
    @Test
    @DisplayName("scenario25_Test_01")
    public void scenario25_Test_01() {
        Scenario25 scenario25 = new Scenario25();
        //
        int[] array = new int[]{-1, 2, -1, 4};
        int target = 1;
        //assertThat(scenario25.threeSumCloset(array, target), is(equalTo(2)));
    }

    @Test
    @DisplayName("scenario25_Test_02")
    public void scenario25_Test_02() {
        Scenario25 scenario25 = new Scenario25();
        //
        int[] array = new int[]{-1, 2, -1, 4};

        int target = 1;
        //assertThat(scenario25.threeSumCloset(array, target), is(equalTo(2)));
    }

    @Test
    @DisplayName("scenario25_Test_03")
    public void scenario25_Test_03() {
        Scenario25 scenario25 = new Scenario25();
        //
        int[] array = new int[]{3, 2, -1, 4};
        scenario25.combination(array, 4, 3);
    }
}
