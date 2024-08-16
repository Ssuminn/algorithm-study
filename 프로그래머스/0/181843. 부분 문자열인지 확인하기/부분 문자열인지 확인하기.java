class Solution {
    public int solution(String my_string, String target) {
        // my_string에 target이 포함되는지 확인
        if(my_string.contains(target)) {
            return 1;
        }
        else {
            return 0;
        }
    }
}