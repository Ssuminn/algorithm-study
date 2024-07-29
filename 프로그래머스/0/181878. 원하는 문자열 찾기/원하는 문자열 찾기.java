class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        //두 문자열을 소문자로 교체
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        // myString과 pat이 포함여부 확인
        if(myString.contains(pat)) {
            answer = 1;
        }
        else{
            answer = 0;
        }
        
        return answer;
    }
}