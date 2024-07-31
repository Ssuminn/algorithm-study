class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        // endsWith 메서드를 사용하여 my_string이 is_suffix 시작하는지 확인
        if(my_string.endsWith(is_suffix)) {
            return 1;
        }
        else {
            return 0;
        }
        

    }
}