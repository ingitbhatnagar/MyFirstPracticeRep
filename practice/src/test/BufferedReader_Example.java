package test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class BufferedReader_Example {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for(int i=0;i<N;i++)
        {
        	int map[]=new int[26];
        	int c;
        	int cc=0;
        	while((c=br.read())>96)
        	{
        		map[c-97]++;
        		cc++;
        	}
        	while((c=br.read())!=-1&&c>96)
        	{
        		c=c-97;
        		if(map[c]!=0)
        		{
        			map[c]--;
        			cc--;
        		}
        	}
        	if(cc==0)
        		System.out.println("YES");
        	else
        		System.out.println("NO");
        }
   }
}