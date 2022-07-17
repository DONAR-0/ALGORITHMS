package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisplayName("Matrix Multiplication")
public class Scenario09Tests {
	
	private static Logger LOGGER = LoggerFactory.getLogger(Scenario09Tests.class);

	@Test
	@DisplayName("TEST_01: Multiply Matrix")
	public void scenario09_Test_01(){
	   
		Scenario03 scenario03 = new Scenario03();
		int[][] matrixA = {
			{0,1,2,3},
			{9,10,11,12},
			{21,22,23,25},
			{27,30,31,32}
		};


		int[][] matrixB = {
			{0,1,2,3},
			{9,10,11,12},
			{21,22,23,25},
			{27,30,31,32}
		};
		LOGGER.info("Matrix Check");
		scenario03.printMatrix(matrixA);
		Scenario09 scenario09A = new Scenario09(matrixA);
		Scenario09 scenario09B = new Scenario09(matrixB);
		
		scenario09A.multiply(scenario09B);
		scenario03.printMatrix(scenario09A.multiply(scenario09B).data);
		//assertThat("matrxi check", ,is(true));
	}


}
