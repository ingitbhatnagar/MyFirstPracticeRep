package honeyWell;
import java.util.*;

class Question2 {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            ArrayList<Long> Posset=new ArrayList<Long>();
            ArrayList<Long> Negset=new ArrayList<Long>();
            int N=s.nextInt();
            for(int y=0;y<N;y++)
            {
                long number=s.nextLong();
                if(number<0)
                Negset.add(number);
                else
                Posset.add(number);
            }
            Collections.sort(Posset);
            Collections.sort(Negset, Collections.reverseOrder());
            long sum=0;
            for(int y=0;y<Posset.size();y++)
            {
            	sum=sum+Posset.get(y);
            }
            if(sum%2!=0)
            	System.out.println(sum);
            else
            {
            	int x=0,y=0;
            	int noOddPos=0,noOddNeg=0;
            	if(!Posset.isEmpty())
            	while(Posset.get(x)%2==0)
            	{
            		if(x==(Posset.size()-1))
            		{
            			noOddPos=1;
            			break;
            		}
            		else
            		x++;
            	}
            	else
            		noOddPos=1;
            	if(!Negset.isEmpty())
            	while((Math.abs(Negset.get(y)))%2==0)
            	{
            		if(y==(Negset.size()-1))
            		{
            			noOddNeg=1;
            			break;
            		}
            		else
            		y++;
            	}
            	else
            		noOddNeg=1;
        		if(noOddNeg==1)
        		{
        			sum=sum-Posset.get(x);
        		}
        		else if(noOddPos==1)
        		{
        			sum=sum+Negset.get(y);
        		}
        		else
        		{
            	if(Math.abs(Posset.get(x))>Math.abs(Negset.get(y)))
            	{
            		sum=sum+Negset.get(y);
            	}
            	else
            		sum=sum-Posset.get(x);
        		}
        		System.out.println(sum);
        	}
        }
        s.close();
    }
}
