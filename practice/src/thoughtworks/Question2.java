package thoughtworks;
import java.io.*;
import java.util.Arrays;

class Question2 {
    public static void main(String args[] ) throws Exception {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int T=Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
        	String str[]=br.readLine().split(" ");
        	int N=Integer.parseInt(str[0]);
        	long S=Integer.parseInt(str[1]);
        	int arr[]=new int[N];
        	String array[]=br.readLine().split(" ");
        	for(int j=0;j<N;j++)
        	{
        		arr[j]=Integer.parseInt(array[j]);
        	}
        	Arrays.parallelSort(arr);
        	diffValue(arr,S,N);
        }
    }
    static void diffValue(int arr[],long S,int N)
    {
    	int i=0,j=1,k=2,maxk=2;
    	long temp=(arr[j]-arr[i])*2;
    	long max=temp;
    	j++;
    	while(j<N)
    	{
    		k=j-i+1;
    		temp=(arr[j]-arr[i])*(k);
    		if(k>=maxk&&temp<=S)
    		{
    			if(k>maxk)
    			{
    			maxk=k;
    			max=temp;
    			}
    			else if(temp>max)
    			{
    				maxk=k;
    				max=temp;
    			}
    		}
    		if(temp>S)
    		{
    			if((j-i)==1)
    			{
    				j++;
    				i++;
    			}
    			else
    			{
    				i++;
    			}
    		}
    		else
    		{
    			j++;
    		}
    	}
    	System.out.println(maxk+" "+max);
    }
}