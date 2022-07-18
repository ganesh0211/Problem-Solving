package Tree;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Math.max;

/*****
 * Author : Ganesh
 */
public class Height {

    private static class Node{
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    /**
     * Simple using recursion
     * @param node
     * @return
     */
    public static int height(Node node) {
        if(node == null) {
            return 0;
        }
        int lh = height(node.left);
        int rh = height(node.right);

        return max(lh, rh) + 1;
    }

    /**
     * Using stacks
     * @param node
     * @return
     */
    public static int height_stack(Node node) {
        int height = 0;
        if (node == null) {
           return height;
        }
        Queue<Node> nodes = new LinkedList();
        nodes.add(node);

        while(!nodes.isEmpty()) {
            int n = nodes.size();
            for(int i =0; i < n ; i++) {
                node = nodes.poll();
                if(node.left != null) {
                    nodes.add(node.left);
                }
                if(node.right != null) {
                    nodes.add(node.right);
                }
            }
            height ++;
        }
        return height;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.left.left.left = new Node(3);
        System.out.println(height(node));
        System.out.println(height_stack(node));
    }
}
