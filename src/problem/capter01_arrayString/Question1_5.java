package problem.capter01_arrayString;

import timecheck.ProcessTimeCheck;

/**
 * PAGE:137
 * 주제:하나빼기
 * 문제:문자열을 편집하는 방법에는 세가지 종류가있다. 문자 삽입, 문자삭제, 문자교체. 문자열 두개가 주어졌을때, 문자열을
 * 같게 만들기 위한 편집횟수가 1회 이내인지 확인하는 함수를 작성하라
 * <p>
 * input:
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */
public class Question1_5 {
    private static boolean solution(String first, String second) {
        if (Math.abs(first.length() - second.length()) > 1) return false;

        int[] table = new int[Character.getNumericValue('z') + 1];
        for (char c : first.toCharArray()) {
            table[Character.getNumericValue(c)]++;
        }

        for (char c : second.toCharArray()) {
            table[Character.getNumericValue(c)]--;
        }

        int flag = 0;
        for (int i1 : table) {
            if (i1 != 0) {
                flag += Math.abs(i1);
            }
        }

        if (first.length() == second.length() && flag == 2) return true;

        return flag <= 1;
    }

    private static boolean solutionBook(String first, String second) {
        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (foundDifference) return false;
                foundDifference = true;

                if (s1.length() == s2.length()) {
                    index1++;
                }
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }

    public static void main(String[] args) {
        ProcessTimeCheck processTimeCheck = new ProcessTimeCheck();

        System.out.println(solution("pale", "ple")); // true
        System.out.println(solution("pales", "pale")); //true
        System.out.println(solution("pale", "bale")); // true
        System.out.println(solution("pale", "bake")); // false

        processTimeCheck.processReport();
    }
}
