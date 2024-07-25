class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split("\\s+");
//         trim() 함수를 사용하여 입력 문자열의 앞과 뒤에 있는 공백을 제거할 수 있다.
//         split("\s+") 메서드를 사용하여 공백을 기준으로 문자열을 분리
//         "\\s+"는 하나 이상의 공백을 의미
        
        return answer;
    }
}