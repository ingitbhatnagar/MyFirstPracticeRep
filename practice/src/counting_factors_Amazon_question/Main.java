package counting_factors_Amazon_question;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		long a,b,N,result;
		for(int i=0;i<T;i++)
		{
			a=sc.nextLong();
			b=sc.nextLong();
			N=sc.nextLong();
			result=findNumber(a,b,N);
			System.out.println(result);
		}
		sc.close();
	}
	public static long findNumber(long a, long b, long N)
	{
		long i,common=0;
		if(a==b)
			return a*N;
		if(b<a)
		{
			long temp=a;
			a=b;
			b=temp;
		}
		if(b%a==0)
			return a*N;
		long max=a*N;
		for(i=1;b*i<max;i++)
		{
			if((b*i)%a==0)
			{
			common++;	
			}
		}
//		System.out.println("There are "+(i-1)+" terms of "+b+" under "+N+" terms of "+a);
//		System.out.println("There are "+common+" common terms between "+N+" terms of "+a);
		long total=i-1-common;
		System.out.println("Total terms are "+(total+N));
		int flag=0;
		for(long j=1;j<=total;j++)
		{
			if(a*N>b*(i-1))
			{
//				System.out.println(a*N+" is "+(x+total-(j-1))+" term");
				N=N-1;
				flag=1;
			}
			else if(a*N<(b*(i-1)))
			{
//				System.out.println((b*(i-1))+" is "+(x+total-(j-1))+" term");
				i=i-1;
				flag=0;
			}
			else
			{				
//				System.out.println((b*(i-1))+" is "+(x+total-(j-1))+" term");
				N=N-1;
				i=i-1;
			}
		}
		if(flag==0)
			return (a*N);
		else
			return (b*(i-1));
	}

}
