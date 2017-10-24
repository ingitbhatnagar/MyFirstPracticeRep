package swiggy;
import java.util.*;
public class Que3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0;i<T;i++)
		{
			int X=s.nextInt();
			int Y=s.nextInt();
			int Z=s.nextInt();
			int a[][][]=new int[Z][X][Y];
			for(int z=0;z<Z;z++)
			{
				for(int x=0;x<X;x++)
				{
					for(int y=0;y<Y;y++)
					{
						a[z][x][y]=s.nextInt();
					}
				}
			}
			findVolume(a,X,Y,Z);
		}
		s.close();
	}
public static void findVolume(int a[][][],int X,int Y,int Z)
{
/*	System.out.println("---BEFORE---");
	for(int z=0;z<Z;z++)
	{
		for(int x=0;x<X;x++)
		{
			for(int y=0;y<Y;y++)
			{
				System.out.print(a[z][x][y]+" ");
			}System.out.println();
		}System.out.println();
	}System.out.println("--End of BEFORE--");
*/	for(int z=0;z<Z;z++)
		for(int x=0;x<X;x++)
		{
				if(a[z][x][0]==0)
					a[z][x][0]=-1;
				if(a[z][x][Y-1]==0)
					a[z][x][Y-1]=-1;
		}	
	for(int z=0;z<Z;z++)
		for(int y=0;y<Y;y++)
		{
			if(a[z][0][y]==0)
				a[z][0][y]=-1;			
			if(a[z][X-1][y]==0)
				a[z][X-1][y]=-1;
		}
	for(int x=0;x<X;x++)
		for(int y=0;y<Y;y++)
		{
			if(a[0][x][y]==0)
				a[0][x][y]=-1;
			if(a[Z-1][x][y]==0)
				a[Z-1][x][y]=-1;			
		}
	while(true)
	{
		int found=0;
		int flag=0;
	for(int z=1;z<(Z-1);z++)
	{
		for(int x=1;x<(X-1);x++)
		{
			for(int y=1;y<(Y-1);y++)
			{
				if(a[z][x][y]==0)
				found=convertAdjacent(a,x,y,z,X,Y,Z);
				if(found==1)
				{
					flag=1;
				}
			}
		}
	}
	if(flag==0)
	break;
	}
	int count=0;
	for(int z=1;z<(Z-1);z++)
	{
		for(int x=1;x<(X-1);x++)
		{
			for(int y=1;y<(Y-1);y++)
			{
				if(a[z][x][y]==0)
					count++;
			}
		}
	}
	System.out.println(count);
}
public static int convertAdjacent(int arr[][][],int i, int j,int k,int X,int Y,int Z)
{
	int found=0;
	if(arr[k][i][j-1]==-1)
	{
		arr[k][i][j]=-1;
		found=1;
	}
	if(arr[k][i][j+1]==-1)
	{
		arr[k][i][j]=-1;
		found=1;
	}
	if(arr[k][i-1][j]==-1)
	{
		arr[k][i][j]=-1;
		found=1;
	}
	if(arr[k][i+1][j]==-1)
	{
		arr[k][i][j]=-1;
		found=1;
	}
	if(arr[k+1][i][j]==-1)
	{
		arr[k][i][j]=-1;
		found=1;
	}
	if(arr[k-1][i][j]==-1)
	{
		arr[k][i][j]=-1;
		found=1;
	}
	return found;
}
}
