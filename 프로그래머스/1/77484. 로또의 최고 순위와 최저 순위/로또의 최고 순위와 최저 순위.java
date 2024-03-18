class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        int count = 0; 
        int zerocount = 0; 
        
        // lottos 배열을 순회하며 맞은 숫자의 개수와 0의 개수를 세기
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i]!=0){// lottos[i]가 0이 아닌 경우에만 비교하여 맞은 숫자의 개수를 증가시킴
                for(int j = 0; j < win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        count++;
                        break; // 이미 맞은 번호를 찾았으므로 다음 로또 번호로 넘어감
                    }
                }
            }
            else{
                zerocount++;
            }
        }
        // 맞은 숫자의 개수를 바탕으로 등수 결정
        answer[0] = (count + zerocount >= 2) ? 7 - (count + zerocount) : 6;
        answer[1] = (count >= 2) ? 7 - count : 6;
        
        return answer;
    }
}