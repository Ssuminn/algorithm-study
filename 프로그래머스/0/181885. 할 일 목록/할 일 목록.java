import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // 미완료된 할 일들을 저장할 리스트
        ArrayList<String> answerList = new ArrayList<>();
        
        // todo_list와 finished 배열을 순회하며 미완료된 일들을 answerList에 추가
        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) {
                answerList.add(todo_list[i]);
            }
        }
        // answerList를 배열로 변환        
        String[] answer = new String[answerList.size()];
        return answerList.toArray(answer);
    }
}
// toArray 메서드에 new String[0]을 전달하면, ArrayList의 크기에 맞게 새로운 배열이 생성
//         String[] answer = answerList.toArray(new String[0]);
        
//         return answer;
