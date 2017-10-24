package replace_Consec_Odd_numbers_with_Max;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int x;
		while(true)
		{
			x=sc.nextInt();
			if(x<0)
			{
				break;
			}
			else
			{
				list.add(x);
			}
		}
		int size=processArray(list);
		sc.close();
	}
static int processArray(ArrayList<Integer> list)
{
	int max;
	for(int i=0;i<list.size();i++)
	{
		int temp=list.get(i);
		if(temp%2!=0)
		{
			if(i==(list.size()-1))
			{
				break;
			}
			else
			{
			max=temp;
			int y=i+1;
			temp=list.get(y);
			while(temp%2!=0)
			{
				if(max>=temp)
				{
					list.remove(y);
				}
				else if(temp>max)
				{
					list.remove(i);
					max=temp;
				}
				temp=list.get(y);
			}
			}
		}
	}
	Iterator it=list.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	return list.size();
}
}
