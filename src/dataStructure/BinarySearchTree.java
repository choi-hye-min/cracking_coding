package dataStructure;

/**
 * https://songeunjung92.tistory.com/31
 */
public class BinarySearchTree {
    private TreeNode root = new TreeNode();

    public void insertBST(int x) {
        root = insertKey(root, x);
    }

    public void printBST(){
        inOrder(root);
        System.out.println();
    }

    private TreeNode insertKey(TreeNode root, int x) {
        TreeNode p = root;
        TreeNode newNode = new TreeNode(x);

        if (p ==null || p.getData() == 0) {
            return newNode;
        }

        if (p.getData() > newNode.getData()) {
            p.left = insertKey(p.left, x); // 왼쪽 branch
        } else {
            p.right = insertKey(p.right, x); // 오른쪽 branch
        }

        return p;
    }

    // 잘못된 값 넣기
    public void problemUpdateValue(int x){
        TreeNode left = root.getLeft();
        if(left != null){
            left.setData(root.getData()+10);
        }
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.println(root.getData() + " ");
        inOrder(root.right);
    }

    public TreeNode getRoot() {
        return root;
    }
}
