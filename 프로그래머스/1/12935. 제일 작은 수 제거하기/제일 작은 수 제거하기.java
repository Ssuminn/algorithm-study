import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if (arr.length == 1) { // 빈 배열인 경우 answer에 -1 담는다
            answer = new int[] {-1};
        } else {
            List<Integer> list = new ArrayList<>();
            for (int a : arr) { // arr 배열의 모든 요소를 a에 저장한다
                list.add(a);
            }
            
            list.remove(Collections.min(list)); // list의 가장 작은 수를 제거한다
            answer = new int[arr.length - 1]; // 최소값이 제거된 리스트를 기반으로 새로운 배열 answer를 생성하는 부분
        
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i); // list를 answer에 저장한다
            }
        }
        return answer;
    }
}