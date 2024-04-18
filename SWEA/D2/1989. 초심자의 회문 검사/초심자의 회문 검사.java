import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        
        for(int test_case = 1; test_case <= T; test_case++) {
            String word = sc.next();
            int answer = 1; // 기본적으로 회문이라고 가정
            
            for(int i = 0; i < word.length() / 2; i++) {
                if(word.charAt(i) != word.charAt(word.length() - i - 1)) {
                    answer = 0; // 회문이 아닌 경우
                    break; // 더 이상 비교할 필요 없음
                }
            }
            System.out.println("#" + test_case + " " + answer);
        }
    }
}
