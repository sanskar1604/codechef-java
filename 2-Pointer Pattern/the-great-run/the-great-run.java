import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] ip = new int[n];
		    for(int i = 0; i < n; i++){
		        ip[i] = sc.nextInt();
		    }
		    int sum = 0, maxSum = 0;
		    for(int i = 0; i < k; i++){
		        sum += ip[i];
		    }
		    maxSum = sum;
		    for(int i = k; i < n; i++){
		        sum = sum - ip[i - k] + ip[i];
		        maxSum = Math.max(maxSum, sum);
		    }
		    System.out.println(maxSum);
		    t--;
		}

	}
}
