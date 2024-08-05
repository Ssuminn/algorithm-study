import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answerList = new ArrayList<>();
        
        // arr 배열의 모든 원소를 answerList에 추가
        for(int i = 0; i < arr.length; i++) {
            answerList.add(arr[i]);
        }
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < delete_list.length; j++) {
                // 배열의 값이 같으면 answerList에서 삭제
                if(arr[i] == delete_list[j]) {
                    answerList.remove(Integer.valueOf(arr[i]));
                }
            }
        }
        
        // 결과 리스트를 배열로 변환
        int[] answer = new int[answerList.size()];
        
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}