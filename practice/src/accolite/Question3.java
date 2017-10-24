package accolite;
import java.io.*;
import java.util.*;
public class Question3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String s = br.readLine();
            String out_ = decode(s);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static String decode(String s){
        int length=s.length();
        char arr[]=new char[length];
        int start,index;
        int i=0,counter=0;
        if(length%2==0)
        {   
        	start=length/2-1;
        	arr[start]=s.charAt(i);
        	i++;
        	counter++;
        	while(i<length)
        	{
        		index=start+counter;
        		arr[index]=s.charAt(i);
        		i++;
        		arr[start-counter]=s.charAt(i);
        		i++;
        		counter++;
        	}
        }
        for(int x=0;x<length;x++)
        	System.out.println(arr[x]);
        String str=new String(arr);
        return str;
    }
}