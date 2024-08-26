import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 문자열을 소문자로 변환
        my_string = my_string.toLowerCase();
        
        // 문자열을 문자 배열로 변환
        char[] charArray = my_string.toCharArray();
        
        // 문자 배열을 정렬
        Arrays.sort(charArray);
    
        // 정렬된 문자 배열을 문자열로 변환
        answer = new String(charArray);
        
        return answer;
    }
}