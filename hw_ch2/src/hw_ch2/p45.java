package hw_ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p45 {
	public static void main(String[]args)throws IOException 
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入5個人的分數");
		int test[] = new int[5];
		
		for(int i=0;i<test.length;i++) {
			String str = br.readLine();
			test[i]=Integer.parseInt(str);
		}
		for(int s=0;s<test.length;s++) {
			for(int k=s+1;k<test.length;k++) {
				if(test[k]>test[s]) {
					int temp =test[k];
					test[k]=test[s];
					test[s]=temp;
				}
			}
		}
		
		for(int i=0;i<test.length;i++) {
			System.out.println("第"+(i+1)+"名的分數是"+test[i]+"分");
		}
	}
}
