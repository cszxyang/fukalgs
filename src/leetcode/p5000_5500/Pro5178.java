package leetcode.p5000_5500;

import java.util.HashSet;
import java.util.Set;

/**
 * see leetcode/5000-5500/5178. 四因数.md
 * @since 2020-03-22
 * @author cszxyang
 */
public class Pro5178 {
    class Solution {
        public int sumFourDivisors(int[] nums) {
            int sum = 0;
            for (int num : nums) {
                Set<Integer> factors = getFactors(num);
                if (factors != null && factors.size() == 4) {
                    for (int factor : factors) {
                        sum += factor;
                    }
                }
            }
            return sum;
        }

        private Set<Integer> getFactors(int n) {
            Set<Integer> res = new HashSet<>();
            if (n == 0) {
                res.add(0);
                return res;
            }
            if (n == 1) {
                res.add(1);
                return res;
            }
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    res.add(i);
                    res.add(n / i);
                }
                if (res.size() > 4) {
                    return null;
                }
            }
            return res;
        }
    }
}
