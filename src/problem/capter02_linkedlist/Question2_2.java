package problem.capter02_linkedlist;

import timecheck.ProcessTimeCheck;

/**
 * PAGE:141
 * 주제: 뒤에서 k번째 원소 구하기
 * 문제: 단방향 연결리스트가 주어졌을때 뒤에서 k번째 원소를 찾는 알고리즘을 구현하라
 */
public class Question2_2 {
    private static SimpleLinkedList solution(SimpleLinkedList simpleLinkedList, int k){
        SimpleLinkedList head = simpleLinkedList;
        SimpleLinkedList tail = simpleLinkedList;

        for (int i = 1; i < k; i++) {
            tail = tail.getNext();
        }

        while (tail.getNext() != null) {
            head = head.getNext();
            tail = tail.getNext();
        }

        return head;
    }

    private static void solutionBook(String str){
        
    }

    public static void main(String[] args) {
        ProcessTimeCheck processTimeCheck = new ProcessTimeCheck();

        SimpleLinkedList simpleLinkedList = new SimpleLinkedList(5);
        simpleLinkedList.appendToTail(3);
        simpleLinkedList.appendToTail(8);
        simpleLinkedList.appendToTail(10);
        simpleLinkedList.appendToTail(2);

        int k = 2;
        SimpleLinkedList solution = solution(simpleLinkedList, k);
        System.out.println(solution.getData());

        processTimeCheck.processReport();
    }
}
