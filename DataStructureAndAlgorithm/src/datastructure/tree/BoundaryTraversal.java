package datastructure.tree;

import java.util.ArrayList;
import java.util.Collections;

public class BoundaryTraversal {

    static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    static class Tree {
        Node root;

        Tree(Node node) {
            root = node;
        }

        public boolean isLeafNode(Node node) {
            return node.left == null && node.right == null;
        }

        // traverse the tree in left direction excluding the leaf nodes
        public void addLeftNodes(Node node, ArrayList<Integer> list) {
            Node temp = node.left;
            while (temp != null) {
                if (!isLeafNode(temp)) list.add(temp.key);
                if (temp.left != null) temp = temp.left;
                else temp = temp.right;
            }
        }

        // Inorder traversal for getting leaf nodes
        public void addLeaves(Node node, ArrayList<Integer> list) {
            if (isLeafNode(node)) {
                list.add(node.key);
                return;
            }
            if (node.left != null) addLeaves(node.left, list);
            if (node.right != null) addLeaves(node.right, list);
        }

        // Traverse the tree in right direction in reverse order excluding the leaf nodes
        public void addRightNodesReverse(Node node, ArrayList<Integer> list) {
            Node temp = node.right;
            // create a data structure for storing the right nodes and then will reverse that
            ArrayList<Integer> ds = new ArrayList<>();
            while (temp != null) {
                if (!isLeafNode(temp)) ds.add(temp.key);
                if (temp.right != null) temp = temp.right;
                else temp = temp.left;
            }
            // reverse the ds and then add it in the list
            Collections.reverse(ds);
            for (Integer i : ds) {
                list.add(i);
            }

        }

        public void getBoundaryOfBinaryTree(Node node, ArrayList<Integer> list) {
            if (!isLeafNode(node)) list.add(node.key);
            addLeftNodes(node, list);
            addLeaves(node, list);
            addRightNodesReverse(node, list);

            for (Integer i : list) {
                System.out.print(i + " ");
            }
        }


    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.left = new Node(3);
        node.left.left.right = new Node(4);
        node.left.left.right.left = new Node(5);
        node.left.left.right.right = new Node(6);
        node.right = new Node(7);
        node.right.right = new Node(8);
        node.right.right.left = new Node(9);
        node.right.right.left.left = new Node(10);
        node.right.right.left.right = new Node(11);

        ArrayList<Integer> list = new ArrayList<>();
        Tree tree = new Tree(node);
        System.out.println("Boundary of the Tree is in anticlockwise is :: ");
        tree.getBoundaryOfBinaryTree(node, list);
    }
}
