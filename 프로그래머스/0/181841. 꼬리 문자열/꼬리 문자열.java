class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";

        for(int i = 0; i < str_list.length; i++) {
            // str_list[i]가 ex를 포함 여부 확인
            if(!str_list[i].contains(ex)) {
                // answer에 str_list[i]문자열 추가
                answer += str_list[i]; 
            }
        }

        return answer;
    }
}