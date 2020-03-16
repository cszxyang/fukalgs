package leetcode.p1001_1500;

public class Pro_1381 {

    class CustomStack {

        private int[] stack;

        private int top = -1;

        public CustomStack(int maxSize) {
            stack = new int[maxSize];
        }

        public void push(int x) {
            if (top == stack.length - 1) {
                return;
            }
            top++;
            if (top < stack.length) {
                stack[top] = x;
            }
        }

        public int pop() {
            if (top == -1) {
                return -1;
            }
            return stack[top--];
        }

        public void increment(int k, int val) {
            int bound = Math.min(k - 1, top);
            for (int i = 0; i <= bound; i++) {
                stack[i] += val;
            }
        }
    }
}

