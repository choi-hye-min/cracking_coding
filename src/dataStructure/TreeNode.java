package dataStructure;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;

    private int data;

    public TreeNode() {
        this.left = null;
        this.right = null;
    }

    public TreeNode(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getRight() {
        return right;
    }
}
