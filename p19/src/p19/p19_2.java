package p19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p19_2 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("�п�J�A�O�k�Ͷ�?");
		System.out.println("�п�JY��N");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
	
		String str=br.readLine();
		char letter=str.charAt(0);
		
		if (letter=='Y' || letter=='y')
		{
			System.out.println("�A�O�k�ͪ�!");
		}
		else if(letter=='N' || letter=='n')
		{
			System.out.println("�p�O�k�Ͱ�!");
		}
		else
		{
			System.out.println("�п�JY��N");
		}
	}
}
