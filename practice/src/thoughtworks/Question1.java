package thoughtworks;
import java.io.*;

public class Question1 {
	public static void main(String args[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int T =Integer.parseInt(br.readLine());
for(int i=0;i<T;i++)
{
	int N=Integer.parseInt(br.readLine());
	String numbers[]=br.readLine().split(" ");
	int count=0,j=0,flag=1;
	while(j<N)
	{
		if(numbers[j].equals("1"))
		{
			count++;
			j++;
		}
		else
		{
			String X=numbers[j];
			if(j==N-1)
			{
				flag=0;
			}
			else
			{
				int semicount=1;
				j++;
				int x=Integer.parseInt(X);
				while(semicount<x&&j<N)
				{
					if(!(numbers[j].equals(X)))
					{
						flag=0;
						break;
					}
					else
					{
						j++;
						semicount++;
					}
				}
			}
			if(flag==0)
			{
				break;
			}
			count++;
		}
	}
	if(flag==0)
		System.out.println("Invalid Data");
	else
		System.out.println(count);
}
}
}
