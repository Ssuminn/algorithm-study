import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
         // LinkedHashSet을 사용하여 중복을 제거하며 원래 순서를 유지하는 Set을 선언
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        // 주어진 문자열을 한 글자씩 잘라서 배열로 변환
        String[] arr = my_string.split("");
        
        // 배열의 각 문자를 set에 추가 (set은 중복을 허용하지 않음)
        for(String s : arr) {
            set.add(s);
        }

        // set에 있는 원소들을 다시 하나의 문자열로 결합하여 반환
        return String.join("", set);
        
        // for(int i = 0; i < my_string.length(); i++) {
        //     //answer에 my_string.charAt(i)가 포함되어 있지 않으면 answer에 그 문자 추가
        //     if(!answer.contains(String.valueOf(my_string.charAt(i)))) {
        //         answer += my_string.charAt(i);
        //     }
        // }
        //         
        // return answer;
    }
}
