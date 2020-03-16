package structure.list;

import java.util.Random;

/**
 * @author yzx
 */
public class MySkipList<E extends Comparable<E>> {

    private static final int MAX_LEVEL = 16;
    private int levelCount = 1;
    private Random random = new Random();

    /**
     * 最高 level 的头节点
     */
    Node head;

    void add(E val) {
        // 1. 找个位置
        Node temp = head;
        while (temp != null) {

        }
    }

    /**
     * @param val val
     */
    Node getNode(E val) {
        Node temp = head;
        while (temp != null) {
            if (temp.item.compareTo(val) == 0) {
                return temp;
            }
            if (temp.right == null && temp.down == null) {
                return null;
            }
            if (temp.right == null) {
                temp = temp.down;
                continue;
            }
            if (temp.down == null) {
                temp = temp.right;
                continue;
            }
            if (temp.right.item.compareTo(val) > 0) {
                temp = temp.down;
            } else {
                temp = temp.right;
            }
        }
        return null;
    }

    boolean contains(E val) {
        return getNode(val) != null;
    }

    private int randomLevel() {
        int level = 1;
        for (int i = 1; i < MAX_LEVEL; ++i) {
            if (random.nextInt() % 2 == 1) {
                level++;
            }
        }
        return level;
    }

    /**
     * 垂直添加
     */
    private void linkHorizontally(Node node, Node operandNode) {

    }

    /**
     * 垂直添加
     */
    void linkVertically(Node node, Node operandNode) {

    }

    private class Node {
        E item;
        Node left, right;
        Node down, up;

        Node() {}

        Node(E item) {
            this.item = item;
        }
    }
}
