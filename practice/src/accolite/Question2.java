package accolite;
import java.util.*;

public class Question2 {
public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int i=0;i<T;i++)
	{
		String P=sc.next();
		String Q=sc.next();
		int N=sc.nextInt();
		int cost[]=new int[N];
		TreeSet<Integer> arr=new TreeSet<Integer>();
		for(int y=0;y<N;y++)
		{
			cost[y]=sc.nextInt();
		}
		int diff=P.length()-Q.length()+1;
		for(int y=0;y<diff;y++)
		{
			arr.add(P.indexOf(Q,y));
		}
		ArrayList<Integer> list=new ArrayList<Integer>(arr);
		if(list.get(0)==-1)
			System.out.println("0");
		else{
		int max=0;
		int index=0;
		max=findMaxCost(list,max,cost,index,Q.length());
		System.out.println(max);
		}
	}
}
public static int findMaxCost(ArrayList<Integer> arr,int max,int cost[],int index,int length)
{
	if(index==(arr.size()-1))
		return cost[arr.get(index)];
	else
	{
	if((arr.get(index+1)-arr.get(index))<length)
	{
		int max1,max2;
		int next;
		next=arr.get(index)+length;
		int i=index;
		if(arr.get(arr.size()-1)<next)
			max1=cost[arr.get(index)];
		else
		{
		while(arr.get(i)<next&&i<arr.size())
		{
			i++;
		}
		max1=cost[arr.get(index)]+findMaxCost(arr,max,cost,i,length);
		}
		max2=findMaxCost(arr,max,cost,index+1,length);
		if(max1>max2)
			max=max1;
		else
			max=max2;
	}
	else
	{
		max=cost[arr.get(index)]+findMaxCost(arr,max,cost,index+1,length);
	}
	return max;
	}
}
}
