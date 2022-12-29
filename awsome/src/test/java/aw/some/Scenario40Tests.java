package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

@DisplayName("Longest Palindrome Values")
public class Scenario40Tests {

    private static final Logger LOG = LoggerFactory.getLogger(Scenario40Tests.class);
    @Test
    @DisplayName("TEST_1")
    public void longestPalindromeTesting(){
        String palindromeString = "";
        LOG.info("{}",Scenario40.longestPalindrome(palindromeString));
        assertThat(Scenario40.longestPalindrome(palindromeString),is(equalTo(0)));
    }


    @Test
    @DisplayName("TEST_2")
    public void longestPalindromeTesting_2(){
        String palindromeString = "bab";
        LOG.info("{}",Scenario40.longestPalindrome(palindromeString));
        assertThat(Scenario40.longestPalindrome(palindromeString),is(equalTo(3)));
    }


    @Test
    @DisplayName("TEST_3")
    public void longestPalindromeTesting_3(){
        String palindromeString = "bab";
        LOG.info("{}",Scenario40.longestPalindrome(palindromeString));
        assertThat(Scenario40.longestPalindrome(palindromeString),is(equalTo(3)));
    }
}
