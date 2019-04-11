import java.io.*;
import java.util.*;
class Nodes
{
    int data;
    Nodes leftChild;
    Nodes rightChild;
    Nodes(int data)
    {
        this.data = data;
    }
}

class BinaryTree {
    Nodes rootNode;


    void printZigZagTraversal() {


        if (rootNode == null) {
            return;
        }

        Stack<Nodes> currentLevel = new Stack<>();
        Stack<Nodes> nextLevel = new Stack<>();

        currentLevel.push(rootNode);
        boolean leftToRight = true;

        while (!currentLevel.isEmpty()) {

            Nodes node = currentLevel.pop();

            System.out.print(node.data + " ");

            if (leftToRight) {
                if (node.leftChild != null) {
                    nextLevel.push(node.leftChild);
                }

                if (node.rightChild != null) {
                    nextLevel.push(node.rightChild);
                }
            }
            else {
                if (node.rightChild != null) {
                    nextLevel.push(node.rightChild);
                }

                if (node.leftChild != null) {
                    nextLevel.push(node.leftChild);
                }
            }

            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<Nodes> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }
}



public class BinaryTreeZigZag {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.rootNode = new Nodes(1);
        tree.rootNode.leftChild = new Nodes(2);
        tree.rootNode.rightChild = new Nodes(3);
        tree.rootNode.leftChild.leftChild = new Nodes(7);
        tree.rootNode.leftChild.rightChild = new Nodes(6);
        tree.rootNode.rightChild.leftChild = new Nodes(5);
        tree.rootNode.rightChild.rightChild = new Nodes(4);

        tree.printZigZagTraversal();

    }
}
