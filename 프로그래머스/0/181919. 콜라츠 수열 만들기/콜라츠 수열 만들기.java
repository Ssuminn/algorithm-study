import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        // 초기 값 n을 리스트에 추가
        list.add(n);

        // n이 1이 될 때까지 반복
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } 
            else {
                n = 3 * n + 1;
            }
            // 계산된 값을 리스트에 추가
            list.add(n);
        }
        
        // 리스트를 배열로 변환하여 반환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}