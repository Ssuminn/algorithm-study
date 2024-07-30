class Solution {
    public String[] solution(String[] names) {
        // 배열의 개수 ex) 배열이 5개일때 1개의 그룹 
        // names.length/5 + 1 -> 배열이 5개일때 2개의 그룹
        String[] answer = new String[(names.length + 4) / 5];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = names[i * 5];
        }
        
        return answer;
    }
}