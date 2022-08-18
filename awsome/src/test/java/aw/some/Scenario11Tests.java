package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

@DisplayName("Letter Combinations of a Phone Number")
public class Scenario11Tests {

    @Test
    @DisplayName("scenario11_Test_01")
    public void scenario11_Test_01() {
        Scenario11 scenario11 = new Scenario11();
        List<String> actual = scenario11.letterCombinationsBad("23");
        List<String> expected = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");
        assertThat(actual,is(equalTo(expected)));
    }

    @Test
    @DisplayName("scenario11_Test_02")
    public void scenario11_Test_02() {
        Scenario11 scenario11 = new Scenario11();
        List<String> actual = scenario11.letterCombinations("23");
        List<String> expected = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");
        assertThat(actual,is(equalTo(expected)));
    }

    @Test
    @DisplayName("scenario11_Test_03")
    public void scenario11_Test_03() {
        Scenario11 scenario11 = new Scenario11();
        List<String> actual = scenario11.letterCombinations("234");
        List<String> expected = List.of(
                "adg","adh","adi",
                "aeg","aeh","aei",
                "afg","afh","afi",
                "bdg","bdh","bdi",
                "beg","beh","bei",
                "bfg","bfh","bfi",
                "cdg","cdh","cdi",
                "ceg","ceh","cei",
                "cfg","cfh","cfi");
        assertThat(actual,is(equalTo(expected)));
    }

}