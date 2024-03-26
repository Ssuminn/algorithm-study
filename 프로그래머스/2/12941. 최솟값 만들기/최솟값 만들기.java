import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
	    Arrays.sort(B);
        for(int i = 0; i < A.length; i++) {
            // A와 B배열을 정렬하여 한 쪽의 최댓값과 다른 쪽의 최솟값을 곱해 누적하면 최소값
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }
}