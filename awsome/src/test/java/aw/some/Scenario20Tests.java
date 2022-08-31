package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.MatcherAssert.assertThat;
/**
* Scenario20Tests
*/
@DisplayName("Vector Test")
public class Scenario20Tests {
	
	private static Logger LOG = LoggerFactory.getLogger(Scenario20Tests.class);
	
	/**
	* Basic Tests of Immutibility
	* 
	*
	* */
	@Test
	@DisplayName("scenario20_Test_01")
	public void scenario20_Test_01() {
		double[] xdata = { 1.0, 2.0, 3.0, 4.0};
		double[] ydata = { 5.0, 2.0, 4.0, 1.0};
		Scenario20 x = new Scenario20(xdata);
		Scenario20 y = new Scenario20(ydata);
		double[] zdata = { 6.0, 4.0, 7.0, 5.0};
		Scenario20 z = new Scenario20(zdata);
		assertThat(z,is(not(equalTo(x.plus(y)))));
	}


	@Test
	@DisplayName("scenario20_Test_02")
	public void scenario20_Test_02() {
		double[] xdata = { 1.0, 2.0, 3.0, 4.0};
		double[] ydata = { 5.0, 2.0, 4.0, 1.0};
		Scenario20 x = new Scenario20(xdata);
		Scenario20 y = new Scenario20(ydata);
		double[] zdata = { 6.0, 4.0, 7.0, 5.0};
		Scenario20 z = new Scenario20(zdata);
		assertThat(z.toString(),is(equalTo(x.plus(y).toString())));
	}
	

	@Test
	@DisplayName("scenario20_Test_03")
	public void scenario20_Test_03() {
		double[] xdata = { 1.0, 2.0, 3.0, 4.0};
		Scenario20 x = new Scenario20(xdata);
		double[] zdata = { 10.0, 20.0, 30.0, 40.0};
		Scenario20 z = new Scenario20(zdata);
		assertThat(z.toString(),is(equalTo(x.scale(10).toString())));
	}
	
	
	@Test
	@DisplayName("scenario20_Test_04")
	public void scenario20_Test_04() {
		double[] xdata = { 1.0, 2.0, 3.0, 4.0};
		Scenario20 x = new Scenario20(xdata);
		double[] zdata = { 10.0, 20.0, 30.0, 40.0};
		Scenario20 z = new Scenario20(zdata);
		double magnitude = 54.772255750516614;
		LOG.info("{}",z.magnitude()+"");
		assertThat(magnitude,is(equalTo(z.magnitude())));
	}
}
