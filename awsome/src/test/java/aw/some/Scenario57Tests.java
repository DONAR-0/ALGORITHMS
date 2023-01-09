package aw.some;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Scenario57Tests
 */
@DisplayName("Sorted Array")
public class Scenario57Tests {

  private static final Logger LOG =
      LoggerFactory.getLogger(Scenario57Tests.class);

  @Test
  @DisplayName("TEST_1")
  public void testSortedArray() {
    int[] circleArray = {66, 2, 6, 7, 9, 23, 34, 45, 56, 60};
    Scenario57.minimum(circleArray);
    LOG.info("{}", Scenario57.minimum(circleArray));
    assertThat(Scenario57.minimum(circleArray), is(equalTo(2)));
  }

  @Test
  @DisplayName("TEST_2")
  public void testSortedArray_2() {
    int[] circleArray = {66, 2, 6, 7, 9, 23, 34, 45, 56, 60};
    Scenario57.minimum(circleArray);
    LOG.info("{}", Scenario57.minimum_2(circleArray));
    assertThat(Scenario57.minimum_2(circleArray), is(equalTo(2)));
  }

  @Test
  @DisplayName("TEST_3")
  public void testSortedArray_3() {
    int[] circleArray = {66, 2, 6, 7, 9, 23, 34, 45, 56, 60};
    Scenario57.minimum(circleArray);
    LOG.info("{}", Scenario57.minimum_3(circleArray));
    assertThat(Scenario57.minimum_3(circleArray), is(equalTo(2)));
  }
}
