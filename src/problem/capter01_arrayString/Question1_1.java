package problem.arrayString;

import timecheck.ProcessTimeCheck;

/**
 * PAGE: 136
 * 주제: 중복이 없는가?
 * 문제: 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라. 자료구조를 추가로 사용하지 않고 풀수 있는 알고리즘 또한 고민하라.
 */
public class Question1_1 {
    private static boolean solution(String str){
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);

            if(str.indexOf(s) != str.lastIndexOf(s)){
                System.out.println(s+" 문자가 중복입니다.");
                return true;
            }
        }

        return false;
    }

    private static boolean solutionBook(String str){
        boolean[] char_set = new boolean[128]; // 기본적으로 false로 초기화되어있음
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if(char_set[val]){
                System.out.println(str.charAt(i)+" 문자가 중복입니다.");
                return true;
            }
            char_set[val] = true;
        }

        return false;
    }

    public static void main(String[] args) {
        ProcessTimeCheck processTimeCheck = new ProcessTimeCheck();
        String str = "poijedbaodd";

        solution(str);
        //solutionBook(str);

        processTimeCheck.processReport();
    }
}
