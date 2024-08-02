import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        // 마지막 원소와 그전 원소 비교
        if(num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        } 
        else {
            answer.add(num_list[num_list.length - 1] * 2);
        }
        
        // answer 리스트를 int[] 배열로 변환
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}