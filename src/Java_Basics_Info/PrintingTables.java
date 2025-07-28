package Java_Basics_Info;

import java.util.Scanner;

public class PrintingTables
{
	public static void printTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" X "+i+" = "+(num*i));	
		}
		System.out.println("");
	}
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			PrintingTables.printTable(i);
		}
		
		
	}

}
