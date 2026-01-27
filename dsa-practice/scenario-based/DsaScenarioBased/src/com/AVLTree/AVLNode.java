package com.AVLTree;
class AVLNode {
    int key;        // score / time / patientId
    String value;   // player / event / patient
    int height;
    AVLNode left, right;

    public AVLNode(int key, String value) {
        this.key = key;
        this.value = value;
        this.height = 1;
    }
}
