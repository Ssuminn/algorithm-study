import java.util.*;

class Solution {
    public int[] solution(int n) {
        int a = 0;
            
        for(int i = 1; i < n+1; i++){
            if(n % i == 0){
                a++;
            }
        }
        
        int[] answer = new int [a];
        int k = 0;
        
        for(int i = 1; i < n+1; i++){
            if(n % i == 0){
                answer[k] = i;
                k++;
            }
        }
        // answer 오름차순정렬
        Arrays.sort(answer);
        
        return answer;
    }
}