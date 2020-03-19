package codinginterview;

/**
 * @author yzx
 */
public class Pro0101 {
    class Solution {
        public boolean isUnique(String astr) {
            boolean[] b = new boolean[128];
            int idx;
            for(int i = 0; i < astr.length(); i++) {
                idx = astr.charAt(i);
                if (b[idx]) {
                    return false;
                } else {
                    b[idx] = true;
                }
            }
            return true;
        }
    }

    class Solution2 {
        public boolean isUnique(String astr) {
            boolean[] b = new boolean[26];
            int idx;
            for(int i = 0; i < astr.length(); i++) {
                idx = astr.charAt(i) - 'a';
                if (b[idx]) {
                    return false;
                } else {
                    b[idx] = true;
                }
            }
            return true;
        }
    }

    class Solution3 {
        public boolean isUnique(String astr) {
            int x = 0, c;
            for(int i = 0; i < astr.length(); i++){
                c = astr.charAt(i) - 'a';
                // 如果这一位是1说明有重复
                if(((x >> c) & 1) == 1){
                    return false;
                }
                // 把对应位置修改为1
                x |= (1 << c);
            }
            return true;
        }
    }
}
