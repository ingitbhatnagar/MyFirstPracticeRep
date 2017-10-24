package test;
import java.io.*;
import java.util.*;
public class StringTokenizer_Example {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		st=new StringTokenizer("what is my name");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println("A+B is:"+(a+b));
	}

}
