package datastructure.tree;

public class BinaryTreeTraversal {

    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        BinaryTree() {
            root = null;
        }

        // Recursive mode

        // Post-order (Left, Right, Root)
        void printPostOrder(Node node) {
            if (node == null) return;
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.key + " ");
        }

        // In-order (Left, Root, Right)
        void printInOrder(Node node) {
            if (node == null) return;
            printInOrder(node.left);
            System.out.print(node.key + " ");
            printInOrder(node.right);
        }

        // Pre-order (Root, Left, Right)
        void printPreOrder(Node node) {
            if (node == null) return;
            System.out.print(node.key + " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }

        void printPostOrder() {
            printPostOrder(root);
        }

        void printInOrder() {
            printInOrder(root);
        }

        void printPreOrder() {
            printPreOrder(root);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(5);

        System.out.println("Inorder traversal");
        tree.printInOrder();
        System.out.println("\nPre traversal");
        tree.printPreOrder();
        System.out.println("\nPost traversal");
        tree.printPostOrder();

    }
}
