package problem.capter02_linkedlist;

import timecheck.ProcessTimeCheck;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * PAGE:141
 * 주제: 중복 없애기
 * 문제: 정렬되어 있지 않은 연결리스트가 주어졌을때 이 리스트에서 중복되는 원소를 제거하는 코드를 작성하라
 *
 * input:
 * output:
 */
public class Question2_1 {
    private static void solution(LinkedList<Integer> integerLinkedList){
        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.addAll(integerLinkedList);

        System.out.println("before : "+integerLinkedList);
        System.out.println("after : "+integerHashSet);
    }

    private static void solutionBook(String str){
        
    }

    public static void main(String[] args) {
        ProcessTimeCheck processTimeCheck = new ProcessTimeCheck();

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.addAll(Arrays.asList(6,3,8,9,3,2,5,6,3,8));

        solution(integerLinkedList);

        processTimeCheck.processReport();
    }
}
