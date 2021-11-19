package datastructure.tree;

import java.util.ArrayList;

public class RightLeftViewBinaryTree {

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
        ArrayList<Node> arrayList = new ArrayList<>();

        Tree(Node node) {
            root = node;
        }

        // Recursive traversal
        // Will do Reverse preorder traversal Root -> Right -> Left
        public void rightView(Node node, int level) {
            if (node == null) return;
            if (level == arrayList.size()) {
                arrayList.add(node);
            }
            // move to right node
            rightView(node.right, level + 1);
            // move to left node
            rightView(node.left, level + 1);
        }

        public void leftView(Node node, int level) {
            if (node == null) return;
            if (level == arrayList.size()) {
                arrayList.add(node);
            }
            // move to right node
            leftView(node.left, level + 1);
            // move to left node
            leftView(node.right, level + 1);
        }

        public void printRightView(){
            for (Node n:arrayList) {
                System.out.print(n.key+" ");
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

        System.out.println("Right View of Binary Tree:: ");
        Tree tree = new Tree(node);
        tree.rightView(tree.root, 0);
        tree.printRightView();

        tree.arrayList.clear();
        tree.leftView(tree.root, 0);
        System.out.println("\nLeft View of Binary Tree:: ");
        tree.printRightView();
    }
}
