package com.AVLTree;
class AVLTree {
    private AVLNode root;

    // Height
    private int height(AVLNode n) {
        return n == null ? 0 : n.height;
    }

    // Balance factor
    private int getBalance(AVLNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    // Right rotate
    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotate
    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert
    public void insert(int key, String value) {
        root = insertRec(root, key, value);
    }

    private AVLNode insertRec(AVLNode node, int key, String value) {
        if (node == null)
            return new AVLNode(key, value);

        if (key < node.key)
            node.left = insertRec(node.left, key, value);
        else if (key > node.key)
            node.right = insertRec(node.right, key, value);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // Rotations
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Search
    public String search(int key) {
        AVLNode node = searchRec(root, key);
        return node != null ? node.value : null;
    }

    private AVLNode searchRec(AVLNode root, int key) {
        if (root == null || root.key == key)
            return root;
        if (key < root.key)
            return searchRec(root.left, key);
        return searchRec(root.right, key);
    }

    // Inorder (sorted)
    public void displaySorted() {
        inorder(root);
    }

    private void inorder(AVLNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key + " -> " + root.value);
            inorder(root.right);
        }
    }
}
