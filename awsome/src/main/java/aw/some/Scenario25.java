package aw.some;

import java.util.ArrayList;
import java.util.List;

import sun.jvm.hotspot.ci.ciMethod;

/**
 * Given an array nums of length n and integer target ,
 * find three integer in nums such that
 * sum is closet to the target
 */
public class Scenario25 {

    /***
     * The method
     * @param nums array of number
     * @param target target of the number
     * @return closest to the target
     */
    public int threeSumCloset(int[] nums, int target) {
        //Strategy
        /* 1. We have to find the sum closet or equal to target from numbers array
         * now to divide this
         * 1.1 find the sums of each and compare with the target
         * 1.2 less the difference is the answer
         *
         * do anything possible to find the answer
         *
         */

        return 0;
    }

    /***
     * Three sum out put
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        //Strategy
        /* Find the combination every three words in and then sum
         *
         */
        return new ArrayList<>();
    }


    /***
     * Three sum out put
     * @param nums array of int
     */
    public void twoSum(int[] nums) {
        //One Sum
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + "-> " + nums[i]);
        }
        //Two Sum
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.println(i + "," + j + "-> " + nums[i] + "," + nums[j]);
            }
        }
        //Three sum
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    System.out.println(i + "," + j + "," + k + "-> " + nums[i] + "+" + nums[j] + "+" + nums[k] + "=" + (nums[i] + nums[j] + nums[k]));
                }
            }
        }
    }

    /***
    * Find Combination of every element 
    *
    * @param arr array of number
    * @param data data where number is stored 
    * @param start start of data storing 
    * @param end end of the data storing 
    * @param index current index of number 
    * @param r number of character 
    */
    public void combination(int arr[],int data[],int start,int end,int index,int r){
   
		if(index == r) {
			for (int j = 0; j < r;j++){
				System.out.println(data[j]+" ");
			}
			System.out.println("");
			return;
		}
		
		for (int i = start;i <= end && end - i + 1 >= r - index; i++) {
			data[index] = arr[i];
			combination(arr, data, i+1,end,index + 1,r);
		}
    }

    /***
    * Starting point of finding combination
    *
    * @param arr arr of number
    * @param n number of combination that you want
    * @param r value of the number
    */
    public void combination(int arr[],int n,int r) {
	int[] data = new int[r];
	combination(arr, data, 0, n - 1, 0, r);
    }

    public void combination(int arr[],int r) {
	int data[] = new int[r];
	int n = arr.length;
	combination(arr,data,0,n-1,0,r);
    }
    
    private static final List<String> values = new ArrayList<String>();
    
    public void combinationList(int[] arr, int r) {
	int n = arr.length;
		
   }
   
   public void combinationList(int[] arr,List<String> values,int start,int end,int index,int r) {
         if (index == r) {
           	StringBuilder stringBuilder = new StringBuilder();

	     for(int j = 0; j < r;j++) {
	    	 
	     }	
         } 
   } 
}
