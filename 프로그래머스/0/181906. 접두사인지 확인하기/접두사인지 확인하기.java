class Solution {
    public int solution(String my_string, String is_prefix) {
        // startsWith 메서드를 사용하여 my_string이 is_prefix로 시작하는지 확인
        if (my_string.startsWith(is_prefix)) {
            // is_prefix가 my_string의 접두사일 경우 1 반환
            return 1; 
        } 
        else {
            // is_prefix가 my_string의 접두사가 아닐 경우 0 반환
            return 0; 
        }
    }
}