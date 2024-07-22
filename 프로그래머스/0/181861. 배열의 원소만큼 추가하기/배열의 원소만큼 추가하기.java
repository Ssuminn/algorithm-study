import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 정수 list 생성
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            // 현재 배열 요소의 값만큼 리스트에 해당 값을 추가
            for(int j = 0; j < arr[i]; j++) {
                list.add(arr[i]);
            }
        }
        // 리스트의 크기에 맞게 정수 배열을 생성
        int[] answer = new int[list.size()];
        // 리스트의 요소들을 배열에 저장
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}