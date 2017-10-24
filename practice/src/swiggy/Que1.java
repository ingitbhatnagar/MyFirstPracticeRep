package swiggy;
import java.util.*;
public class Que1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		PrimeDigitNumber(s);
		sc.close();
	}
public static void PrimeDigitNumber(String s){
	int i=s.length();
	int a=s.charAt(0)-'0';
	int prime=findMaxPrime(a);
	int b=s.charAt(1)-'0';
	int sprime=findMaxPrime(b);
	if(prime==-1)
	{
		for(int x=1;x<i;x++)
		{
			System.out.print("7");
		}
	}
	else if(prime<a)
	{
		System.out.print(prime);
		for(int x=1;x<i;x++)
		{
			System.out.print("7");
		}
	}
	else if(prime==a&&sprime==-1)
	{
		int num=findMaxPrime(a-1);
		if(num==-1)
		{
			for(int x=1;x<i;x++)
			{
				System.out.print("7");
			}
		}
		else
		{
			System.out.print(num);
			for(int x=1;x<i;x++)
			{
				System.out.print("7");
			}
		}
	}
	else
	{
		int value=-1;
		int index=1;
		int flag=-1;
		int mode=-1;
		while(index<i)
		{
			int num=s.charAt(index)-'0';
			int tprime=findMaxPrime(num);
			if(tprime==num)
			{
				int secondOption=findMaxPrime(tprime-1);
				if(secondOption!=-1)
				{
					flag=index;
					value=secondOption;
				}
				index++;
			}
			else if(tprime==-1)
			{
				if(flag==-1)
				{
					mode=2;
					break;
				}
				else
				{
					index=flag;
					mode=1;
					break;
				}
			}
			else
			{
				mode=1;
				value=tprime;
				break;
			}
		}
		if(index==i)
		{
			for(int x=0;x<i;x++)
			{
				System.out.print(s.charAt(x));
			}
		}
		else{
		if(mode==1)
		{
			for(int x=0;x<index;x++)
			{
				System.out.print(s.charAt(x));
			}
			System.out.print(value);
			for(int x=index+1;x<i;x++)
			{
				System.out.print("7");
			}
		}
		else if(mode==2) 
		{
			for(int x=1;x<i;x++)
			{
				System.out.print("7");
			}
		}
		}
	}
}
public static int findMaxPrime(int a)
{
	if(a==1||a==0)
		return -1;
	if(a==2)
		return 2;
else if(a<5&&a>=3)
	return 3;
else if(a<7&&a>=5)
	return 5;
else
	return 7;
}
}
