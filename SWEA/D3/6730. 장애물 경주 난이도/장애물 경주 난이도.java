import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int[] h = new int[N];
            for(int i = 0; i < N; i++){
            	h[i] = sc.nextInt();
            }
            int maxUp = 0;
            int maxDown = 0;
            
            for(int i = 1; i < N; i++) {
            	int up = Math.max(0, h[i] - h[i - 1]); // 현재 블록에서 이전 블록으로 올라갈 때의 높이 변화 계산
            	int down = Math.max(0, h[i - 1] - h[i]); // 현재 블록에서 이전 블록으로 내려갈 때의 높이 변화 계산
                
				// 현재까지의 최대 올라갈 때와 내려갈 때의 높이 변화와 비교하여 갱신
                maxUp = Math.max(maxUp, up); // 현재까지의 최대 올라갈 때의 높이 변화와 현재 높이 변화(up) 중 큰 값을 선택하여 최대 높이 변화에 저장
                maxDown = Math.max(maxDown, down); // 현재까지의 최대 내려갈 때의 높이 변화와 현재 높이 변화(down) 중 큰 값을 선택하여 최대 높이 변화에 저장
            }
            
            System.out.println("#" + test_case + " " + maxUp + " " + maxDown);
		}
	}
}