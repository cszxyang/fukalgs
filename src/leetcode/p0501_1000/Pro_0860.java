package leetcode.p0501_1000;

/**
 * see 0501-1000/0860. 柠檬水找零.md
 *
 * @author cszxyang
 * @since 2020-03-04
 */
public class Pro_0860 {

    static class Solution {

        /**
         * O(n), O(1)
         *
         * @param bills bills
         * @return can change or not
         */
        public boolean lemonadeChange(int[] bills) {
            int five = 0, ten = 0;
            for (int bill : bills) {
                if (bill == 5) {
                    five++;
                } else if (bill == 10) {
                    if (five >= 1) {
                        five--;
                        ten++;
                    } else {
                        return false;
                    }
                } else {
                    if (five >= 1 && ten >= 1) {
                        five--;
                        ten--;
                    } else if (five >= 3) {
                        five -= 3;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}

