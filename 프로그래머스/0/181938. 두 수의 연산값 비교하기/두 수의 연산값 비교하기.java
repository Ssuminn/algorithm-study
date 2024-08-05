class Solution {
    public int solution(int a, int b) {
        int ab2 = 2 * a * b;
        // 두 정수를 문자열 형태로 -> 문자열에서 정수 형태로 
        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));

        if(ab2 > ab) {
            return ab2;
        }
        else {
            return ab;
        }
        
    }
}