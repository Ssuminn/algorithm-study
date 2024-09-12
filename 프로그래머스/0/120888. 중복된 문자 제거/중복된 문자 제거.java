class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            //answer에 my_string.charAt(i)가 포함되어 있지 않으면 answer에 그 문자 추가
            if(!answer.contains(String.valueOf(my_string.charAt(i)))) {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}