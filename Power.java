package sample;

import java.util.Scanner;

public class Power 
{
	private static Scanner s;
	private static int o;

	public static void main(String[] args)
	{
		s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = s.nextInt();
         o= 1;  
        if(((~num) & 1) == 1)  
        {  
            System.out.println("The number is a power of two");  
        }  
        else  
        {
            System.out.println("The number is a  NOT A power of two");  
        }
    }  
	
	    }
