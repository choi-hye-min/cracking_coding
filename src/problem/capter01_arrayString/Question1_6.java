package problem.capter01_arrayString;

import timecheck.ProcessTimeCheck;

/**
 * PAGE:137
 * 주제:문자열 압축
 * 문제:반복되는 문자의 개수를 세는 방식의 기본적인 문자열 압축메서드를 작성하라.
 * 예를 들어서 문자열 aabccccaaa 를 압축하면 a2b1c5a3이 된다 만약 압축된 문자열의 길이가 기존 문자열의 길이보다 길다면 기존문자열을 반환해야한다.
 * 문자열은 대소문자 알파벳(a~z)으로만 이루어져 있다.
 */
public class Question1_6 {
    private static String solution(String str) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;

            // str.charAt(i + 1) --> Method threw 'java.lang.StringIndexOutOfBoundsException' exception.
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                builder.append(str.charAt(i));
                builder.append(count);
                count = 0;
            }
        }

        return str.length() <= builder.length() ? str : builder.toString();
    }

    private static void solutionBook(String str) {

    }

    public static void main(String[] args) {
        ProcessTimeCheck processTimeCheck = new ProcessTimeCheck();
//        System.out.println(solution("aabccccaaa"));
        System.out.println(solution("aa"));
        processTimeCheck.processReport();
    }
}
