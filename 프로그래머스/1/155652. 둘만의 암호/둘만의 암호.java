import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int count = 0;
            while(count < index){
                c++; // 다음 문자로 이동
                if(c > 'z') c -= 26; // 'z'를 넘어가면 'a'로 돌아감
                
                if(!skip.contains(String.valueOf(c))) { // skip에 포함되지 않은 경우에만 count 증가
                    count++;
                }
            }
            answer += c;
        }
        return answer;
    }
}
