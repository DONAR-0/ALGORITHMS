package aw.some;

import java.util.ArrayList;
import java.util.List;

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


    public void twoSumBackTrack(int[] array) {

    }

    private void twoSumBackTrack(int[] array,StringBuilder stringBuilder) {}
}