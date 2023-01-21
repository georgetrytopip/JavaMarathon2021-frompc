package day18;

import java.util.Stack;

public class BinaryTree {
    private Node head;
    public int count;

    public Node getHead() {
        return this.head;
    }

    public void add(int value) {
        if (this.getHead() == null) {
            this.head = new Node(value);
        } else {
            addTo(this.getHead(), value);
        }
        count++;
    }

    public void addTo(Node node, int value) {
        if (node.getValue() > value) {
            if (node.getLeftChild() == null) {
                node.setLeftChild(new Node(value));
            } else {
                addTo(node.getLeftChild(), value);
            }
        } else {
            if (node.getRightChild() == null) {
                node.setRightChild(new Node(value));
            } else {
                addTo(node.getRightChild(), value);
            }
        }
    }

    public Node findWithParent(int value) {
        Node current = head;
        Node parent = null;

        while (current != null) {
            if (value < current.getValue()) {
                parent = current;
                current = current.getLeftChild();
            } else if (value > current.getValue()) {
                parent = current;
                current = current.getRightChild();
            } else {
                break;
            }
        }
        return current;

    }

    public boolean contains(int value) {
        return findWithParent(value) != null;
    }

    public boolean remove(int value) {
        Node currentNode = head;
        Node parentNode = head;
        boolean isLeftChild = true;

        while (currentNode.getValue() != value) { // начинаем поиск узла
            parentNode = currentNode;
            if (value < currentNode.getValue()) { // Определяем, нужно ли движение влево?
                isLeftChild = true;
                currentNode = currentNode.getLeftChild();
            } else {
                isLeftChild = false;
                currentNode = currentNode.getRightChild();
            }
            if (currentNode == null)
                return false;
        }

        if (currentNode.getLeftChild() == null && currentNode.getRightChild() == null) {
            if (currentNode == head)
                head = null;
            else if (isLeftChild)
                parentNode.setLeftChild(null);
            else
                parentNode.setRightChild(null);
        } else if (currentNode.getRightChild() == null) {
            if (currentNode == head)
                head = currentNode.getLeftChild();
            else if (isLeftChild)
                parentNode.setLeftChild(currentNode.getLeftChild());
            else
                parentNode.setRightChild(currentNode.getLeftChild());
        } else if (currentNode.getLeftChild() == null) {
            if (currentNode == head)
                head = currentNode.getRightChild();
            else if (isLeftChild)
                parentNode.setLeftChild(currentNode.getRightChild());
            else
                parentNode.setRightChild(currentNode.getRightChild());
        } else { // если есть два потомка, узел заменяется преемником
            Node heir = receiveHeir(currentNode);// поиск преемника для удаляемого узла
            if (currentNode == head)
                head = heir;
            else if (isLeftChild)
                parentNode.setLeftChild(heir);
            else
                parentNode.setRightChild(heir);
        }
        return true;
    }

    private Node receiveHeir(Node node) {
        Node parentNode = node;
        Node heirNode = node;
        Node currentNode = node.getRightChild();
        while (currentNode != null) {
            parentNode = heirNode;
            heirNode = currentNode;
            currentNode = currentNode.getLeftChild();
        }
        if (heirNode != node.getRightChild()) {
            parentNode.setLeftChild(heirNode.getRightChild());
            heirNode.setRightChild(node.getRightChild());
        }
        return heirNode;
    }


    public void printTree() {
        Stack globalStack = new Stack();
        globalStack.push(head);
        int gaps = 32;
        boolean isRowEmpty = false;
        String separator = "-----------------------------------------------------------------";
        System.out.println(separator);
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.getValue());
                    localStack.push(temp.getLeftChild());
                    localStack.push(temp.getRightChild());
                    if (temp.getLeftChild() != null ||
                            temp.getRightChild() != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("__");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop());
        }
        System.out.println(separator);
    }

    public void getInDepth(Node head) {
        if (head != null) {
            getInDepth(head.getLeftChild());
            System.out.print(head.getValue() + " ");
            getInDepth(head.getRightChild());
        }
    }





//    if (head.getLeftChild() != null) {
//        head = head.getLeftChild();
//        System.out.print(head.getValue() + " ");
//        getInDepth(head);
//    }

    public void Clear(){
        head = null;
        count = 0;
    }
}
