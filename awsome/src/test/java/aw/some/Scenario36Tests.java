package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@DisplayName("Longest Substring without repeating character")
public class Scenario36Tests {

    private static Logger LOG = LoggerFactory.getLogger(Scenario36Tests.class);
    @DisplayName("TEST_1")
    @Test
    public void testWithoutRepeatingValues(){
        LOG.info("{}",Scenario36.longestSubStringWithoutRepeating("ihopemakeoutofherecaseisfumesihopeitimakeoutofhere"));
        assertThat(Scenario36.longestSubStringWithoutRepeating("ihopemakeoutofherecaseisfumesihopeitimakeoutofhere"),is(equalTo(9)));
    }

    @DisplayName("TEST_1")
    @Test
    public void testWithoutRepeatingValues_2(){
        LOG.info("{}",Scenario36.longestSubStringWithoutRepeating("ihopemakeoutofherecaseisfumesihopeitimakeoutofhere"));
        assertThat(Scenario36.longestSubStringWithoutRepeating_2("ihopemakeoutofherecaseisfumesihopeitimakeoutofhere"),is(equalTo(9)));
    }
}
