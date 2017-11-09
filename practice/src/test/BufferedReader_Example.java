package test;
import java.util.*;

class BufferedReader_Example {
    public static void main(String args[] ) throws Exception {
    	Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N=sc.nextInt();
            int K=sc.nextInt();
            if(K>N)
            	K=K%N;
            if(K==0)
            {
            	for(int j=0;j<N;j++)
            	{
            		int temp=sc.nextInt();
            		System.out.print(temp+" ");
            	}
            	System.out.println();
            }
            else
            {
            	int arr[]=new int[N];
            	for(int j=0;j<N;j++)
            	{
            		arr[j]=sc.nextInt();
            	}
            	for(int j=(N-K);j<N;j++)
            		System.out.print(arr[j]+" ");
            	for(int j=0;j<(N-K);j++)
            		System.out.print(arr[j]+" ");
            	System.out.println();
            }
        }
    }
}
