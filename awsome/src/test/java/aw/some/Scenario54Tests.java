package aw.some;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Valid Bracket")
public class Scenario54Tests {
	
	@Test
	@DisplayName("TEST_1")
	public void testValidBracket(){
		String bracketValues = "[(){}({})]";
		Scenario54.isValid(bracketValues);
		assertThat(Scenario54.isValid(bracketValues), is(equalTo(Boolean.TRUE)));
	}
}
