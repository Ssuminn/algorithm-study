class Solution {
    public int solution(int[] array, int n) {
        int answer = 0; // 초기화
        for(int i=0; i<array.length; i++) //0부터 매개변수로 들어온 array의 길이까지 for문
            if(array[i]==n) { // 만약 array의 i번째 값과 들어온 n의 값이 같다면
                answer++; // answer에 +1
            }
                
        return answer;
    }
}