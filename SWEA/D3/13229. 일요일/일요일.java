import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        String arr[] = {"SUN", "SAT", "FRI", "THU", "WED", "TUE", "MON"};
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String str = sc.next();
            int ans = 0;
            
            for(int i = 0; i < arr.length; i++) {
            	if(arr[i].equals(str)) {
                	ans = i;
                    break;
                }
            }
            if (ans == 0){
            	ans = 7;
            }
            System.out.println("#" + test_case + " " + ans);
		}
	}
}