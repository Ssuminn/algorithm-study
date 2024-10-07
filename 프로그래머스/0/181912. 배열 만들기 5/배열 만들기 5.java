import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> result = new ArrayList<>();

        // 각 문자열에 대해 부분 문자열을 추출하고 처리
        for (String str : intStrs) {
            // s번 인덱스부터 시작해서 길이 l짜리 부분 문자열을 추출
            String subStr = str.substring(s, s + l);
            
            // 추출한 부분 문자열을 정수로 변환
            int num = Integer.parseInt(subStr);
            
            // 변환한 정수가 k보다 크다면 result에 추가
            if (num > k) {
                result.add(num);
            }
        }

        // ArrayList를 int[] 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
