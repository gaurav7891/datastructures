package datastructure.tree;

import java.util.*;

/**
 * e.g. 1.
 *
 *                       20
 *                     /    \
 *                   8       22
 *                 /   \      \
 *               5      3      25
 *                     / \
 *                   10    14
 *
 *                   Bottom View = 5, 10, 3, 14, 25
 * e.g. 2.
 *                       20
 *                     /    \
 *                   8       22
 *                 /   \    /   \
 *               5      3 4     25
 *                     / \
 *                   10    14
 *
 *                   Bottom View: 5, 10, 4, 14, 25
 *
 * Method 1 – Using Queue
 * The following are steps to print Bottom View of Binary Tree.
 * 1. We put tree nodes in a queue for the level order traversal.
 * 2. Start with the horizontal distance(hd) 0 of the root node, keep on adding left child to queue
 * along with the horizontal distance as hd-1 and right child as hd+1.
 * 3. Also, use a TreeMap which stores key value pair sorted on key.
 * 4. Every time, we encounter a new horizontal distance or an existing horizontal distance
 * put the node data for the horizontal distance as key. For the first time it will add to the map,
 * next time it will replace the value. This will make sure that the bottom most element for that
 * horizontal distance is present in the map and if you see the
 * tree from beneath that you will see that element.
 */
public class BottomViewBinaryTree {


    static class Node {
        int key;
        Node left, right;
        int hd; // horizontal distance of the node

        Node(int item) {
            left = right = null;
            key = item;
            hd = Integer.MAX_VALUE;
        }
    }

    static class Tree {
        Node root;

        public Tree(Node node) {
            root = node;
        }

        public void bottomView() {

            if (root == null) return;

            // Initialize a variable 'hd' with 0 for the root element.
            int hd = 0;

            // TreeMap which stores key value pair sorted on key value
            Map<Integer, Integer> map = new TreeMap<>();

            // Queue to store tree nodes in level order traversal
            Queue<Node> queue = new LinkedList<>();

            // Assign initialized horizontal distance value to root node
            // and add it to the queue.
            root.hd = hd;
            queue.add(root);

            // Loop until the queue is empty
            while (!queue.isEmpty()) {
                Node temp = queue.remove();
                // Extract the horizontal distance value from the dequeue tree node.
                hd = temp.hd;

                // put the dequeue tree node to TreeMap having key as horizontal distance.
                // Every time we find a node having same horizontal distance we need to
                // replace the data in the map.
                map.put(hd, temp.key);

                // if the dequeue tree node has a left child add it to the queue with a
                // horizontal distance hd-1.
                if (temp.left != null) {
                    temp.left.hd = hd - 1;
                    queue.add(temp.left);
                }

                // if the dequeue node has a right child add it to the queue with a
                // horizontal distance hd+1
                if (temp.right != null) {
                    temp.right.hd = hd + 1;
                    queue.add(temp.right);
                }
            }

            // Extract the entries of the map into a set to traverse an iterator over that.
            // Method-1 to iterate
           /* Set<Map.Entry<Integer, Integer>> set = map.entrySet();

            Iterator<Map.Entry<Integer, Integer>> iterator = set.iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> mapEntry = iterator.next();
                System.out.print(mapEntry.getValue() + " ");
            }*/

            //Method-2 to iterate
            for (Map.Entry<Integer, Integer> mapEntry: map.entrySet()){
                System.out.print(mapEntry.getValue() + " ");
            }

        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        Tree tree = new Tree(root);
        System.out.println("Bottom view of the given binary tree:");
        tree.bottomView();
    }
}
