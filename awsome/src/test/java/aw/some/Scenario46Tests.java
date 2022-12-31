package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

@DisplayName("Testing the balanced tree")
public class Scenario46Tests {

	@Test
	@DisplayName("TEST_1")
	public void testBalancedTree(){
		/**
		 * [30]
		 * [24][32]
		 * [12][25][31][35]
		 *
		 * */
		Scenario46.Tree root = new Scenario46.Tree(30);
		root.left = new Scenario46.Tree(24);
		root.right = new Scenario46.Tree(32);
		root.left.left = new Scenario46.Tree(12);
		root.left.right = new Scenario46.Tree(25);
		root.right.right = new Scenario46.Tree(35);
		root.right.left = new Scenario46.Tree(31);
		assertThat(Scenario46.isBalanced(root),is(equalTo(Boolean.TRUE)));
	}


	@Test
	@DisplayName("TEST_1")
	public void testBalancedTree_2(){
		/**
		 * [30]
		 * [24][32]
		 * [12][25][31][35]
		 *
		 * */
		Scenario46.Tree root = new Scenario46.Tree(30);
		root.left = new Scenario46.Tree(24);
		root.right = new Scenario46.Tree(32);
		root.left.left = new Scenario46.Tree(12);
		root.left.right = new Scenario46.Tree(25);
		root.right.right = new Scenario46.Tree(35);
		root.right.left = new Scenario46.Tree(31);
		assertThat(Scenario46.isBalanced_rec(root),is(equalTo(Boolean.TRUE)));
	}
}
