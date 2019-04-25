package problem.capter02_linkedlist;

import timecheck.ProcessTimeCheck;

/**
 * PAGE:142
 * 주제: 중간 노드 삭제
 * 문제: 단방향 연결리스트가 주어졌을 때 중간(정확히 가운데 노드일 필요는 없고 처음과 끝 노드만 아니면 된다)
 * 에있는 노드 하나를 삭제하는 알고리즘을 구현하라.
 * 단, 삭제할 노드에만 접근할수 있다.
 */
public class Question2_3 {
    private static void solution(SimpleLinkedList simpleLinkedList){
        if(simpleLinkedList.getNext() != null){
            simpleLinkedList.setNext(simpleLinkedList.getNext());
            simpleLinkedList.setData(simpleLinkedList.getData());
        }
    }

    private static void solutionBook(String str){
        
    }

    public static void main(String[] args) {
        ProcessTimeCheck processTimeCheck = new ProcessTimeCheck();

        processTimeCheck.processReport();
    }
}
