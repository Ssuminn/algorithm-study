import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // "x"를 기준으로 문자열을 분할
        String[] strArr = myString.split("x");
        
        ArrayList<String> list = new ArrayList<>();
        
        // strArr의 각 문자열을 확인하면서, 비어있지 않은 문자열이라면 list에 추가
        for(String str : strArr) { 
            if(!str.isEmpty()) {
                list.add(str);
            }
        }
        
        // String[] answer = list.toArray(new String[0]);
        // 리스트를 배열로 변환
        String[] answer =  list.toArray(new String[list.size()]);
        
        // 사전순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}
