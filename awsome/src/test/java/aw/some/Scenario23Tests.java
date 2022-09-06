package aw.some;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Scenario23Tests
*/
@DisplayName("An Immuatble object")
public class Scenario23Tests {


	private static final Logger LOG = LoggerFactory.getLogger(Scenario23Tests.class);

	@Test
	@DisplayName("scenario23_Test_01")
	public void scenario23_Test_01(){
	Scenario23[] a = new Scenario23[4];
        a[0] = new Scenario23("Turing   6/17/1990  644.08");
        a[1] = new Scenario23("Tarjan   3/26/2002 4121.85");
        a[2] = new Scenario23("Knuth    6/14/1999  288.34");
        a[3] = new Scenario23("Dijkstra 8/22/2007 2678.40");

        LOG.info("Unsorted");
        for (int i = 0; i < a.length; i++)
            LOG.info("{}",a[i]);
        System.out.println();

        System.out.println("Sort by date");
        Arrays.sort(a, new Scenario23.WhenOrder());
        for (int i = 0; i < a.length; i++)
            LOG.info("{}",a[i]);
        System.out.println();

        System.out.println("Sort by customer");
        Arrays.sort(a, new Scenario23.WhoOrder());
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
        System.out.println();

        System.out.println("Sort by amount");
        Arrays.sort(a, new Scenario23.HowMuch());
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
        System.out.println();
	}
	
}
