class Solution {
    public int solution(String str1, String str2) {
        // str2가 str1을 포함하고 있는지 확인
        if (str2.contains(str1)) {
            return 1; // 포함되어 있으면 1 반환
        } 
        else {
            return 0; // 포함되어 있지 않으면 0 반환
        }
    }
}
