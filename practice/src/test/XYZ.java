package test;
import java.io.*;
import java.util.*;

class XYZ {
    public static void main(String args[] ) throws Exception {
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in)); 
        StringTokenizer st=new StringTokenizer(in.readLine());
        int N=Integer.parseInt(st.nextToken());
        int Q=Integer.parseInt(st.nextToken());
        long arr[]=new long[N];
        st=new StringTokenizer(in.readLine());
        arr[0]=Long.parseLong(st.nextToken());
        for (int i = 1; i <N; i++) {
            arr[i]=arr[i-1]+Long.parseLong(st.nextToken());
        }
       for(int i=0;i<Q;i++)
        {
            int L,R;
            long sum=0;
            st=new StringTokenizer(in.readLine());
            L=Integer.parseInt(st.nextToken());
            R=Integer.parseInt(st.nextToken());
            if(L==1)
            sum=(arr[R-1])/(R-L+1);
            else
            sum=(arr[R-1]-arr[L-2])/(R-L+1);
            System.out.println(sum);
        }
    }
}