class Solution {
    public int solution(String myString, String pat) {
        // 문자열 바꾸기 A -> B, B -> A
        // 예시 ABBAA -> BAABB (ABBAA -> XBBXX -> XAAXX -> BAABB)
        String s = myString.replace('A','X').replace('B','A').replace('X','B');
        
        // 문자열 s와 pat을 비교하여 s에 pat이 포함되면 1 아니면 0 출력
        if(s.contains(pat)) {
            return 1;
        }
        
        return 0;
    }
}