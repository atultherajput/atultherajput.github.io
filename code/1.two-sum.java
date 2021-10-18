import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

 /*
 Q. Given an array of integers nums and an integer target, 
 return indices of the two numbers such that they add up to target.
 */

// @lc code=start
class Solution {
    //TC: O(n) & SC: O(n)
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if(map.containsKey(target - val)){
                return new int[] {map.get(target - val), i};
            }
            map.put(val, i);
        }

        return new int[2];
        
    }
}
// @lc code=end

