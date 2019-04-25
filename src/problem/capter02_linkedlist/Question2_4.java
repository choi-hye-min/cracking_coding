package problem.capter02_linkedlist;

import timecheck.ProcessTimeCheck;

/**
 * PAGE:142
 * 주제: 분할
 * 문제: 값 x가 주어졌을 때 x보다 작은 노드들을 x보다 크거나 같은 노드들보다 앞에 오도록 하는 코드를 작성하라. 만약 x가
 * 리스트에 있다면 x는 그보다 작은 원소들보다 뒤에 나오기만 하면된다. 즉 원소x는 '오른쪽 그룹' 어딘가에만 존재하면 된다.
 * 왼쪽 과 오른쪽 그룹 사이에 있을 필요는 없다.
 *
 * input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [분할값 x=5]
 * output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 */
public class Question2_4 {
    private static void solution(SimpleLinkedList simpleLinkedList, int x){

    }

    private static void solutionBook(String str){
        
    }

    public static void main(String[] args) {
        ProcessTimeCheck processTimeCheck = new ProcessTimeCheck();

        SimpleLinkedList simpleLinkedList = new SimpleLinkedList(3);
        simpleLinkedList.appendToTail(5);
        simpleLinkedList.appendToTail(8);
        simpleLinkedList.appendToTail(5);
        simpleLinkedList.appendToTail(10);
        simpleLinkedList.appendToTail(2);
        simpleLinkedList.appendToTail(1);

        int x = 5;
        solution(simpleLinkedList, x);

        processTimeCheck.processReport();
    }
}
