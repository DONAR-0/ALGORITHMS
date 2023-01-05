package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisplayName("String Subsequences")
public class Scenario53Tests {

    private static final Logger LOG = LoggerFactory.getLogger(Scenario53Tests.class);
    @Test
    @DisplayName("TEST_1")
    public void testStringSequences(){
        String str = "lookawaylookawaydismay";
        LOG.info("{}",Scenario53.getSubsequences(str));
    }
}
