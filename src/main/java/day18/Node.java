package day18;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;


    Node(int value){
        this.value = value;
    }

    public  int getValue() {
        return this.value;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public void setLeftChild(final Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(final Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" + "value: " + value + "leftChild: "
                + leftChild + "rightChild: " + rightChild + "}";
    }
}
