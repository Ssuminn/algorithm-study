class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        // i를 c-1로 시작하고, i가 m만큼씩 증가하면서 my_string의 범위 안에서 반복
        for(int i = c - 1; i < my_string.length(); i += m) {
            // 각 구간에서 c번째 문자 추출하여 answer에 추가
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}
