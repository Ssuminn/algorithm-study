

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        // 소문자로 변경
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'p') {
                p++;
            }
            else if(c == 'y') {
                y++;
            }
            answer = p == y ? true : false;
        }
        return answer;
    }
}