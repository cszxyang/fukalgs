package leetcode.p0001_0500;

import java.util.HashMap;

/**
 * @author yzx
 */
public class Pro0001 {
    /**
     * 暴力解法
     */
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                for (int j = i+1; j < len; j++) {
                    if (nums[i] + nums[j] == target) {
                        res[0] = i;
                        res[1] = j;
                        return res;
                    }
                }
            }
            return res;
        }
    }

    /**
     * 一遍哈希表
     */
    class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int sub;
            for (int i = 0; i < nums.length; i++) {
                sub = target - nums[i];
                if (map.containsKey(sub)) {
                    return new int[]{map.get(sub), i};
                } else {
                    map.put(nums[i], i);
                }
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }
}

