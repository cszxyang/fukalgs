package codinginterview;

import java.util.Arrays;

public class Pro0801 {
    class Solution {
        public int waysToStep(int n) {
            if (n < 0) {
                return 0;
            }
            if (n == 0) {
                return 1;
            }
            return waysToStep(n - 1) + waysToStep(n - 2) + waysToStep(n - 3);
        }
    }

    class Solution1 {
        public int waysToStep(int n) {
            long[] memo = new long[n + 1];
            Arrays.fill(memo, -1);
            return doStep(n, memo);
        }

        public int doStep(int n, long[] memo) {
            if (n < 0) {
                return 0;
            }
            if (n == 0) {
                return 1;
            }
            if (memo[n] > -1) {
                return (int)memo[n];
            }
            memo[n] =  (doStep(n - 1, memo) + doStep(n - 2, memo) + doStep(n - 3, memo)) % 1000000007;
            return (int)memo[n];
        }
    }

    class Solution2 {
        public int waysToStep(int n) {
            return Fibonacci(n);
        }

        private int Fibonacci(int n) {
            if (n == 0) return 1;
            if (n == 1) return 1;
            if (n == 2) return 2;
            if (n == 3) return 4;
            long fibMinusOne = 4; // f(n - 1)
            long fibMinusTwo = 2; // f(n - 2)
            long fibMinus3 = 1; // f(n - 3)
            long fibN = 0;
            for (int i = 4; i <= n; i++) {
                fibN = (fibMinusOne + fibMinusTwo + fibMinus3) % 1000000007;
                fibMinus3 = fibMinusTwo;
                fibMinusTwo = fibMinusOne;
                fibMinusOne = fibN;
            }
            return (int)fibN ;
        }
    }

    class Solution3 {
        public int waysToStep(int n) {
            if(n==0)return 0;
            if(n==1) return 1;
            if(n==2) return 2;
            double[] dp = new double [n+1];  //注意测试数据
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            for(int i = 4 ; i <= n ; i ++) {
                dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1000000007;
            }
            return (int)dp[n];
        }
    }
}

