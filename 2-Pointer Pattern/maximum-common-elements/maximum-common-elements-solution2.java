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
		    int[] a = new int[n];
		    int[] b = new int[n];
 		    for(int i = 0;  i < n; i++){
		        a[i] = sc.nextInt();
		    }
		    for(int i = 0; i < n; i++){
		        b[i] = sc.nextInt();
		    }
		    Set<Integer> set = new HashSet<>();
		    int count = 0;
		    for(int i: a){
		        set.add(i);
		    }
		    for(int i: b){
		        if(set.contains(i)){
		            count++;
		        }
		    }
		    System.out.println(count);
		    t--;
		}

	}
}
