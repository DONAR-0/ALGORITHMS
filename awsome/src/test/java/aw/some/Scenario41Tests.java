package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
@DisplayName("find index of substring")
public class Scenario41Tests {

    @Test
    @DisplayName("TEST_1")
    public void testIndexOfSubString(){
        String str = "thisishowiamgoingtowriteastring";
        String subStr = "is";
        assertThat(Scenario41.substrIndex(str,""),is(equalTo(0)));
        assertThat(Scenario41.substrIndex(str,subStr),is(equalTo(2)));
        assertThat(Scenario41.substrIndex(str,"z"),is(equalTo(-1)));
    }


    @Test
    @DisplayName("TEST_2")
    public void testIndexOfSubString_2(){
        String str = "thisishowiamgoingtowriteastring";
        String subStr = "is";
        assertThat(Scenario41.subStrIndex(str,""),is(equalTo(0)));
        assertThat(Scenario41.subStrIndex(str,subStr),is(equalTo(2)));
        assertThat(Scenario41.subStrIndex(str,"z"),is(equalTo(-1)));
    }
}
