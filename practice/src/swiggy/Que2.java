package swiggy;
import java.util.*;
public class Que2 {
public static void main(String arg[]){
	int N,M;
	Scanner sc=new Scanner(System.in);
	N=sc.nextInt();
	M=sc.nextInt();
	int arr[][]=new int[N][M];
	for(int x=0;x<N;x++)
		for(int y=0;y<M;y++)
			arr[x][y]=sc.nextInt();
	findMinTime(arr,N,M);
	sc.close();
}
public static void findMinTime(int arr[][],int N,int M)
{
	int flag=1;
	int count=0;
	int b[][]=new int[N][M];
	while(flag==1)
	{
		flag=0;
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
			{
				if(arr[i][j]==2&&b[i][j]!=2)
				{
					b[i][j]=1;
					flag=1;
				}
			}
		System.out.println("Flag is "+flag);
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++)
			{
					System.out.print(arr[i][j]+" ");
				}System.out.println();
			}
		System.out.println();
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++)
			{
					System.out.print(b[i][j]+" ");
				}System.out.println();
			}
		System.out.println();
		if(flag==1)
		{
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
				if(b[i][j]==1)
				{
					convertAdjacent(arr,i,j,N,M);
					b[i][j]=2;
				}
			count++;
		}
	}
	if(count==0)
		System.out.println(count);
	else
	System.out.println(count-1);
}
public static void convertAdjacent(int arr[][],int i, int j,int N,int M)
{
	for (int dx = (i > 0 ? -1 : 0); dx <= (i < (N-1) ? 1 : 0); dx++)
	{
	    for (int dy = (j > 0 ? -1 : 0); dy <= (j < (M-1) ? 1 : 0); dy++)
	    {
	        if (dx != 0 || dy != 0)
	        {
		    	if(dx==0||dy==0)
	            if(arr[i + dx][j + dy]==1)
	            {
	            	arr[i+dx][j+dy]=2;
	            }
	        }
	    }
	}
}
}
