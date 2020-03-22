package leetcode.p5000_5500;

import java.util.LinkedList;

/**
 * see leetcode/5000-5500/5364. 按既定顺序创建目标数组.md
 * @since 2020-03-22
 * @author cszxyang
 */
public class Pro5364 {
    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            int[] res = new int[nums.length];
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < nums.length; i++) {
                linkedList.add(index[i], nums[i]);
            }
            for (int i = 0; i < linkedList.size(); i++) {
                res[i] = linkedList.get(i);
            }
            return res;
        }
    }
}
