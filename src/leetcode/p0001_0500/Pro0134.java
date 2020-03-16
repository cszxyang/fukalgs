package leetcode.p0001_0500;

/**
 * see 0001-0500/0134. 加油站.md
 * @author cszxyang
 * @since 2020-03-04
 */
public class Pro0134 {
    static class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int totalTank = 0, currTank = 0, startingStation = 0;
            for (int i = 0; i < gas.length; ++i) {
                totalTank += gas[i] - cost[i];
                currTank += gas[i] - cost[i];
                // 存油不足，无法到达目的地
                if (currTank < 0) {
                    // 选下一个站重新出发
                    startingStation = i + 1;
                    // 先清空油箱
                    currTank = 0;
                }
            }
            return totalTank >= 0 ? startingStation : -1;
        }
    }
}
