class Solution {
    public String solution(String myString, String pat) {
        // pat이 마지막으로 등장하는 위치 찾기
        int idx = myString.lastIndexOf(pat);
        
        // 해당 위치까지의 부분 문자열 반환
        return myString.substring(0, idx + pat.length());
    }
}
