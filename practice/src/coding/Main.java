package coding;
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
	Integer array[]=list.toArray(new Integer[list.size()]);
	int[] intArray = new int[array.length];
    for (int i=0; i < intArray.length; i++)
    {
        intArray[i] = array[i];
    }
    sc.close();
    processArray(intArray);
	}
	static void processArray(int arr[])
	{
		int temp;
	for(int i=0;i<arr.length;i++)
	{
		temp=arr[i]%10;
		if(arr[i]%3==0)
		{
			if(temp==3)
			{
				System.out.println("-3");
			}
			else
				System.out.println("-1");
		}
		else if(temp==3)
		{
			System.out.println("-2");
		}
		else
			System.out.println(arr[i]);
	}
	}
}
