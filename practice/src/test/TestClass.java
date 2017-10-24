package test;

import java.io.*;

public class TestClass {
public static void main(String args[]) throws IOException
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N=Integer.parseInt(br.readLine());
	int x;
	for(int j=0;j<N;j++){
	int arr[]=new int[26];
	while((x=br.read())!=13)
	{		
		arr[x-'a']++;
	}
	br.read();
	while((x=br.read())!=-1&&x!=13)
	{
		arr[x-'a']--;
	}
	if(x==13)
	br.read();
	int count=0;
	for(int i=0;i<26;i++)
	{
		count=count+Math.abs(arr[i]);
	}
	System.out.println(count);
}
}
}
