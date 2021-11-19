package datastructure.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
// O(n)
// space (N)

// do not prefer the recursive way as we need to make an extra
public class TopViewBinaryTree {

    static class Node {
        int key;
        int hd;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null;
            hd = Integer.MAX_VALUE;
        }
    }

    static class Tree {
        Node root;

        Tree(Node node) {
            root = node;
        }

        public void topViewBT() {
            if (root == null) return;

            // create a temp variable for keeping track for the lines we traverse
            int hd = 0;
            // Map data structure for storing the sorted key value pair
            Map<Integer, Integer> map = new TreeMap<>();
            // store the node in queue while we do level order traversal
            Queue<Node> queue = new LinkedList<>();

            root.hd = hd;
            queue.add(root);

            // Level order traversal
            while (!queue.isEmpty()) {
                Node node = queue.remove();
                hd = node.hd;

                // we don't want to replace the data if the node having same horizontal distance.
                if (!map.containsKey(hd)) {
                    map.put(hd, node.key);
                }

                if (node.left != null) {
                    node.left.hd = hd - 1;
                    queue.add(node.left);
                }

                if (node.right != null) {
                    node.right.hd = hd + 1;
                    queue.add(node.right);
                }

            }

            // Iterate 
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                // Now we need to print the values in sorted order
                System.out.print(entry.getValue() + " ");
            }
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);

        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.left.right.left = new Node(6);

        node.right.right = new Node(7);
        /*Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);*/

        Tree tree = new Tree(node);
        System.out.println("Top view of BT::");
        tree.topViewBT();

    }
}
