class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j =1 ;
         for (int i = 0; i < num_list.length; i++) {            
             answer[i]=num_list[num_list.length-j];
             j++;
         }
        
        return answer;
    }
}