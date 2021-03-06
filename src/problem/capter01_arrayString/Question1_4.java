package problem.capter01_arrayString;

import timecheck.ProcessTimeCheck;

/**
 * PAGE: 137
 * 주제: 회문순열
 * 문제: 주어진 문자열이 회문의 순열인지 아닌지 확인하는 함수를 작성하라 회문이란 앞으로 읽으나 뒤로 읽으나 같은 단어
 * 혹은 구절을 의미하며 순열이란 무자열을 재배치하는 것을 뜻한다 회문이 꼭 사전에 등장하는 단어로 제한될 필요는 없다.
 *
 * input: Tact Coa
 * output: true(순열: "taco cat", "atco cta" 등)
 */
public class Question1_4 {
    private static void solution(String str){
        
    }

    private static boolean solutionBook(String phrase){
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a')+1];

        for(char c : phrase.toCharArray()){
            int x = getCharNumber(c);
            if(x != -1){
                table[x]++;
                if(table[x] % 2 == 1){
                    countOdd++;
                }else{
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }

    private static int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(a <= val && val <= z){
            return val-a;
        }
        return -1;
    }

    public static void main(String[] args) {
        ProcessTimeCheck processTimeCheck = new ProcessTimeCheck();
        System.out.println(solutionBook("Tact Coa"));
        processTimeCheck.processReport();
    }
}
