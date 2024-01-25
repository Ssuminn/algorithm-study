class Solution {
        public int solution(String my_string) {
            String []arr = my_string.replaceAll("[^0-9]", "").split("");

            int answer = 0;

            for(int i=0; i<arr.length; i++) {
                answer += Integer.parseInt(arr[i]);
            }           

            return answer;      
        }
    }