package aw.some;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.Arrays;

/**
* Scenario28Tests
*/

@DisplayName("Remove Duplicates")
public class Scenario28Tests {

	private static final Logger LOG = LoggerFactory.getLogger(Scenario28Tests.class);
	@Test
	@DisplayName("scenario28_Test_01")
	public void scenario28_Test_01() {
		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(10,12,15,16,18,19,20,16,12,18,19));
		
		Scenario28 scenario28 = new Scenario28();
		assertThat(scenario28.remove_duplicate(array),is(equalTo(array.stream().distinct().toList())));
	}
}
