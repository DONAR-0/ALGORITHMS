package aw.some;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Scenario10
*/
public class Scenario10 {

	public static Logger LOGGER = LoggerFactory.getLogger(Scenario10.class);
	
	public List<List<Integer>> threeSum(int[] nums) {
		// find sum of numbers
		// what we can do is put all the numbers in linked list
		// get all the values as next and next
		// than add all the sum values
		// issue it would not work in case at the end of linked list
		//
		// steps: 1 Put all the values in linked list
		List<List<Integer>> vList = new ArrayList<>();
		for(int i = 0; i < nums.length;i++) {
			for(int j = i;j < nums.length;j++) {
				for(int k = j;k < nums.length;k++) {
					if(i != j && j != k && k != i) {

					//LOGGER.info("[{},{},{}]",i,j,k);
						int sum = nums[i] + nums[j] + nums[k];
						if(sum == 0) {
							//LOGGER.info("[{},{},{}]",nums[i],nums[j],nums[k]);	
							//LOGGER.info("{}",sum);
							vList.add(Arrays.asList(nums[i],nums[j],nums[k]));
						}
					 } 
				}
			}
		}

		return vList;
	}

//	public List<List<Integer>> threeSumOne(int[] nums) {
//		Arrays.sort(nums);
//		List<List<Integer>> ans = new ArrayList<>();


//	}
	

}

class LocalLinked extends LocalNode {

	private LocalNode head;
	private int size;
	public LocalLinked() {
		this.head = null;
		this.size = 0;
	}
	
	public void add(LocalNode node) {
		LocalNode curr = head;
		while(curr!= null) {
			if (curr.nextNode == null) {
				curr.nextNode = node;
				break;
			}
			curr = curr.nextNode;
			this.size++;
		}
	}

	public void add(int[] array) {
		for(int val:array) {
			LocalNode node = new LocalNode(val);
			this.add(node);
		}
	}
}


class LocalNode {

	int dataInTheNode;
	LocalNode nextNode;
	public LocalNode() {}
	public LocalNode(int value) {
		this(value,null);
	}

	public LocalNode (int value,LocalNode next) {
		this.dataInTheNode = value;
		this.nextNode = next;
	}
}
