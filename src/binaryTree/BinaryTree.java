package binaryTree;

public class BinaryTree {
    private Node root; // The root of the BST

    // Constructor to initialize an empty tree
    public BinaryTree(){
        this.root = null;
    }

    // Method to insert a new value into the BST
    public void insert(int value){
        root = insertRecursive(root, value);
    }

    // Recursive helper method for insertion
    private Node insertRecursive(Node node, int value){
        if(node == null){
            return new Node(value);
        }

        // Rule: If value < node.value, value goes to the left
        if (value < node.value){
            node.left = insertRecursive(node.left, value); // insert in the left subtree
        // Rule: If value > node.value, values goes to the right
        } else if (value > node.value) {
            node.right = insertRecursive(node.right, value); // insert in the right subtree
        }
        return node;
    }

    // Method to search for a value in the BST
    public boolean search(int value){
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(Node node, int value){
        if (node == null){
            return false;
        }

        if (value == node.value){
            return true; // value found
        }

        if (value < node.value){
            return searchRecursive(node.left, value); // search in the left subtree
        } else {
            return searchRecursive(node.right, value); // Search in the right subtree
        }
    }

    // Method to perform an in-order traversal of the BTS
    public void inorderTransversal(){
        inorderTransversalRecursive(root);
        System.out.println(); // Move to the next line after traversal
    }

    private void inorderTransversalRecursive(Node node){
        if(node != null) {
            inorderTransversalRecursive(node.left); // Visit the left subtree
            System.out.print(node.value + " "); // Print the node value
            inorderTransversalRecursive(node.right); // Visit the right subtree
        }
    }
}

