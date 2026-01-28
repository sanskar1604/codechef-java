import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t > 0){
		    int n = sc.nextInt();
		    int[] ip = new int[n];
		    
		    for(int i = 0; i < n; i++){
		        ip[i] = sc.nextInt();
		    }
		    
		    int i = 0, j = 1;
		    while(j < n){
		        if(ip[j] == ip[j-1]){
		            j++;
		        }else{
		            ip[i+1] = ip[j];
		            i++;
		            j++;
		        }
		    }
		    int m = i+1;
		    System.out.print(m);
		    System.out.println();
		    for(int k = 0; k < m; k++){
		        System.out.print(ip[k] + " ");
		    }
		    System.out.println();
		    t--;
		}

	}
}
