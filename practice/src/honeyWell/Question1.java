package honeyWell;
import java.util.*;
public class Question1 {
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int i=0;i<T;i++)
	{
		long M=sc.nextLong();
		long N=sc.nextLong();
		long K=sc.nextLong();
		findMaxRect(M,N,K);
	}
	sc.close();
}
public static void findMaxRect(long M,long N,long K)
{
	try{
		if(K<=M||K<=N)
		{
			System.out.println(K);
		}
		else if(K>=(long)M*N)
		{
			System.out.println((long)M*N);
		}
		else
		{
			System.out.println("M is: "+M+" N is: "+N+" K is: "+K);
			long quotient=K/M;
			long rem=K%M;
			System.out.println("For factor: "+M+" remainder is: "+rem+" columns are : "+quotient);
			if(rem==0)
			{
				System.out.println(K);
			}
			else
			{
			for(long i=M-1;K/i<N;i--)
			{
				long temp=K%i;
				System.out.println("For factor: "+i+" remainder is: "+temp+" quotient is: "+(K/i));
				if(temp<rem)
				{
					System.out.println("Since remainder: "+temp+" is lesser than: "+rem+" we consider it");
					rem=temp;
					if(rem==0)
						break;
				}
			}
			System.out.println(K-rem);
			}
		}
	}
	catch(Exception e){
	    System.out.println(e);
	}
	}
}
