import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> X = new ArrayList<>();
        
        for(int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                // flag[i]가 true인 경우 arr[i] 값을 arr[i] * 2번 추가
                for (int j = 0; j < arr[i] * 2; j++) {
                    X.add(arr[i]);
                }
            }
            else {
                for (int j = 0; j < arr[i]; j++) {
                    if (!X.isEmpty()) {
                        X.remove(X.size() - 1);  // 마지막 원소 제거
                    }
                }
            }
        }
        
        // ArrayList를 배열로 변환
        int[] result = new int[X.size()];
        for (int i = 0; i < X.size(); i++) {
            result[i] = X.get(i);
        }
        
        return result;
    }
}