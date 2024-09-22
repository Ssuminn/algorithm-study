import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // replaceAll([정규식],[바꿀문자])
        my_string = my_string.replaceAll("[a-z]", "");
        
        String[] arr = my_string.split("");
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            // 문자열 -> 숫자
            answer[i] = Integer.parseInt(arr[i]);
        }
        
        // for(int i = 0; i < arr.length(); i++){
        //     // 문자열 -> 숫자 (아스키)
        //     answer[i] = my_string.charAt(i) - '0';
        // }
        
        Arrays.sort(answer);
        
        return answer;
    }
}