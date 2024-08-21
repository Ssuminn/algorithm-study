public class Solution {
    public int solution(int num, int k) {
        // num을 문자열로 변환
        String numStr = Integer.toString(num);
        // k를 문자열로 변환
        String kStr = Integer.toString(k);
        
        // numStr에서 kStr의 위치 찾기
        int index = numStr.indexOf(kStr);
        
        // indexOf는 0부터 인덱스를 반환하므로, 위치를 1부터 시작하게 조정
        if (index != -1) {
            return index + 1;
        } 
        else {
            return -1;
        }
    }
}
