import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); // (0,1,3,5,6)
        for(int n = 0; n < citations.length; n++) {
            int h = citations.length - n; // 인용된 논문의 수
			
			if(citations[n] >= h) {
				answer = h;
				break;
			}
        }
        return answer;
    }
}