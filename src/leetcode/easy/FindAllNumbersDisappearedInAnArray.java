/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 448. Find All Numbers Disappeared in an Array
 * Problem Address: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
 * elements appear twice and others appear once. Find all the elements of [1,
 * n] inclusive that do not appear in this array. Could you do it without extra
 * space and in O(n) runtime? You may assume the returned list does not count
 * as extra space.
 * -----------------------------------------------------------------------------
 * Example:
 * <p>
 * Input:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * Output:
 * [5,6]
 */

package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<Integer>();

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;

    }

}
