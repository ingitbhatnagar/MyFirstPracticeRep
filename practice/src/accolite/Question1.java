package accolite;
import java.io.*;
import java.util.*;
public class Question1 {
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
        LinkedList<Integer> list=new LinkedList<Integer>();
        for(int i=0;i<length;i++)
        	list.add(new Integer(i));
        for(int i=0;i<length;i++)
        {
        	int size=list.size();
        	int index;
        	if(size==1)
        		index=0;
        	else
        	{
        	if(size%2==0)
        		index=size/2-1;
        	else
        		index=size/2;
        	}
        	arr[list.get(index)]=s.charAt(i);
        	list.remove(index);
        }
        String x=new String(arr);
        return x;
    }
}