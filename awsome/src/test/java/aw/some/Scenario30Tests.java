package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;

@DisplayName("First Repeating Character")
public class Scenario30Tests {

    @Test
    @DisplayName("TEST_1")
    public void testRepeatingCharacter(){
       Scenario30.firstRepeatingCharacter("thiswedoit");
       assertThat( Scenario30.firstRepeatingCharacter("thiswedoit"),is(equalTo('i')));
    }
    @Test
    @DisplayName("TEST_2")
    public void testRepeatingCharacter_2(){
       Scenario30.firstRepeatingCharacter("thiswedoit");
       assertThat( Scenario30.firstRepeatingCharacter_2("thiswedoit"),is(equalTo('i')));
    }
}
