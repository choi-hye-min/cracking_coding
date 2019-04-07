package problem.arrayString;

import timecheck.ProcessTimeCheck;

import java.util.Arrays;

/**
 * PAGE: 136
 * 주제: 순열 확인
 * 문제: 문자열 두 개가 주어졌을 때 이 둘이 서로 순열 관계에 있는지 확인하는 메서드를 작성하라
 */
public class Question1_2 {
    private static boolean solution(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        String sort1 = sort(str1);
        String sort2 = sort(str2);

        return sort1.equals(sort2);
    }

    private static String sort(String str){
        char[] charAr = str.toCharArray();

        for (int i = 0; i < charAr.length; i++) {
            if(i == 0) continue;

            for (int j = 0; j < i; j++) {
                if(charAr[i] < charAr[j]){
                    char temp = charAr[i];

                    charAr[i] = charAr[j];
                    charAr[j] = temp;
                }
            }
        }

        return Arrays.toString(charAr);
    }

    private static boolean solutionBook(String str1, String str2){
        if (str1.length() != str2.length()) return false;

        return sortBook(str1).equals(sortBook(str2));
    }

    private static String sortBook(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);

        return new String(content);
    }

    public static void main(String[] args) {
        ProcessTimeCheck processTimeCheck = new ProcessTimeCheck();

        String str1 = "ndb e";
        String str2 = "db ne";

        System.out.println(solution(str1, str2) ? "순열o" : "순열x");

        processTimeCheck.processReport();
    }
}
