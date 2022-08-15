package aw.some;

import java.util.*;

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

	public List<List<Integer>> threeSumOne(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		Set<String> seen = new HashSet<>();
		for (int i = 0; i < nums.length - 2; i++) {
			int num = -1 * nums[i];
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				int sum = nums[left] + nums[right];
				if (num == sum) {
					List<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[left]);
					list.add(nums[right]);
					if (!seen.contains("" + nums[i] + nums[left] + nums[right]))
						ans.add(list);
					if (nums[i] == nums[right] && nums[i] == nums[left]) {
						return ans;
					}
					seen.add("" + nums[i] + nums[left] + nums[right]);
					left++;
					right--;
				} else if (num < sum) {
					left++;
				} else {
					right--;
				}
			}
		}
		return ans;
	}

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