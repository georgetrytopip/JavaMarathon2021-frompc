package day18;

public class Task3 {
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();

        tree1.add(20);
        tree1.add(14);
        tree1.add(11);
        tree1.add(5);
        tree1.add(8);
        tree1.add(16);
        tree1.add(15);
        tree1.add(18);
        tree1.add(23);
        tree1.add(22);
        tree1.add(27);
        tree1.add(24);
        tree1.add(150);

        tree1.printTree();

        tree1.getInDepth(tree1.getHead());

    }
}