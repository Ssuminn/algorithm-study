class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        // 1. s 이전 부분
        String before = my_string.substring(0, s);
        // 2. s부터 e까지의 부분을 뒤집음
        String reverse = "";
        for (int i = e; i >= s; i--) {
            reverse = reverse + my_string.charAt(i);
        }
        // 3. e이후 부분
        String after = my_string.substring(e + 1);
    
        // 4. 세 부분을 합쳐서 반환
        return before + reverse + after;
    }
}