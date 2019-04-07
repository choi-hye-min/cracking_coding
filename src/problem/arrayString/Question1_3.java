package problem.arrayString;

import timecheck.ProcessTimeCheck;

/**
 * PAGE: 136
 * 주제: URL화
 * 문제: 문자열에 들어있는 몯느공백을 '%20'으로 바꿔주는 메서드를 작성하라, 최종적으로 모든 문자를 다담을수 있을 만큼 충분한 공간이 이미 확도되어 있으며 문자열의 최종길이가
 * 함께 주어진다고 가정해도된다
 *
 * 입력: "Mr John Smith", 13
 * 출력: "Mr%20John%20Smith"
 */
public class Question1_3 {
    private static String solution(char[] str, int size) {
        String replaceStr = new String(str).replaceAll("( )", "%20");
        return replaceStr;
    }

    private static char[] solutionBook(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') spaceCount++;
        }

        index = (trueLength-spaceCount) + (spaceCount*3)+1;
        //if (trueLength < str.length) str[trueLength] = '\0';

        char[] outputChar = new char[index+1];

        for (i = str.length-1; i >= 0; i--) {
            if (str[i] == ' ') {
                outputChar[index - 3] = '%';
                outputChar[index - 2] = '2';
                outputChar[index - 1] = '0';
                index -= 4;
            } else {
                outputChar[index] = str[i];
                index -= 1;
            }
        }

        return outputChar;
    }

    public static void main(String[] args) {
        String str = "Mr John Smith";
        int inputSize = str.length();
        char[] input = str.toCharArray();

        ProcessTimeCheck processTimeCheck2 = new ProcessTimeCheck();
        System.out.println(solutionBook(input, inputSize));
        processTimeCheck2.processReport();

        ProcessTimeCheck processTimeCheck = new ProcessTimeCheck();
        System.out.println(solution(input, inputSize));
        processTimeCheck.processReport();
    }
}
