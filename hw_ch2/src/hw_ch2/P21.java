package hw_ch2;

import java.io.*;

public class P21 {
	public static void main(String[]args)throws IOException 
	{
		System.out.println("請選擇路線?");
		System.out.println("請輸入整數?");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		char ans = (res==1)?'A':'B';
		
		System.out.println("選擇了"+ans+"的路線");
		
		
	}
}
