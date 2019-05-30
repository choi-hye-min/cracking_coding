package problem.capter04_treeGraph;

import dataStructure.BinarySearchTree;
import dataStructure.TreeNode;
import timecheck.ProcessTimeCheck;

/**
 * PAGE: 163
 * 주제: BST 검증
 * 문제: 주어진 이진트리가 이진탐색트리(BST)인지 확인하는 함수를 작성하라
 *
 * input:
 * output:
 *
 * [풀이]
 *  => 트리에 중복이 있나요 ?
 *  => 주어진 노드를 받았을때 재귀로 계속 검증
 *  => 재귀로 검증할때 최상위에서부터 검사해야함
 *  => * 위에서 부터 타고 내려왔다면 노드마다 범위가 있음
 *
 * [해법]
 *  => 01. 중위순회
 *  => 02. left <= current < right
 *  => 전체크기를 알고 있는가 ?
 *      => 알고있다면 배열
 *      => 모른다면 리스트
 */
public class Question4_5 {

    private static void solution(BinarySearchTree tree){
        TreeNode root = tree.getRoot();

    }

    static Integer lastPrinted = null;
    private static boolean checkBST(TreeNode node){
        if(node == null) return true;

        return true;
    }

    private static void solutionBook(String str){
        
    }

    public static void main(String[] args) {
        ProcessTimeCheck processTimeCheck = new ProcessTimeCheck();

        // BST 생성
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertBST(8);
        binarySearchTree.insertBST(3);
        binarySearchTree.insertBST(10);
        binarySearchTree.insertBST(2);
        binarySearchTree.insertBST(5);
        binarySearchTree.insertBST(14);
        binarySearchTree.insertBST(11);
        binarySearchTree.insertBST(16);

        //binarySearchTree.printBST();

        // BST 검증
        solution(binarySearchTree);


        processTimeCheck.processReport();
    }
}
