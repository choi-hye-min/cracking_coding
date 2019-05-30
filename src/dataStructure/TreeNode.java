package dataStructure;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;

    private int data;
    private static int size = 0;

    public TreeNode() {
        this.left = null;
        this.right = null;
        size++;
    }

    public TreeNode(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
        size++;
    }

    public int getData() {
        return data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public static int getSize() {
        return size;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getRight() {
        return right;
    }
}
