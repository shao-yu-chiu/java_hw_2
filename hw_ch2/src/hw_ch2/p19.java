package hw_ch2;

import java.io.*;

public class p19 {
	public static void main(String[]args)throws IOException 
	{
		System.out.println("請問你是男生嗎?");
		System.out.println("請輸入Y或N?");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter =str.charAt(0);
		if(letter=='y' || letter=='Y') {
			System.out.println("你是男生阿!");
		}
		else if(letter=='n' || letter=='N') {
			System.out.println("你是女生阿!");
		}
		else {
			System.out.println("請輸入Y或N");
		}
		
	}
}
