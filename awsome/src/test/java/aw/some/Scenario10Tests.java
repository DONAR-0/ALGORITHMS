package aw.some;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
/**
* Scenario10Tests
*/

@DisplayName("Array Problem")
public class Scenario10Tests {
	
	@Test
	@DisplayName("scenario10_Test_01")
	public void scenario10_Test_01(){
		int[] nums = new int[]{-1,0,1,2,-1,-4};
		Scenario10 scenario10 = new Scenario10();
		List<List<Integer>> valueList = scenario10.threeSum(nums);

		List<List<Integer>> expectList = new ArrayList<>();
		expectList.add(new ArrayList(Arrays.asList(-1,-1,2)));
		expectList.add(new ArrayList( Arrays.asList(-1,-1,2)));
		expectList.add(new ArrayList( Arrays.asList(-1,0,-1)));
		assertThat(valueList,Is.is(equalTo(expectList)));
	}
}
