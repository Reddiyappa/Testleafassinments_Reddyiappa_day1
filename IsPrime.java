package assignment;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		//int primeno=7;
		System.out.println("enter the number to validate whether the number is prime or not ");
		Scanner sc=new Scanner(System.in);
		int primeno=sc.nextInt();
		boolean flag=true;
		for (int i = 2; i <primeno-1; i++) {
			if(primeno%i==0) 
			{
				System.out.println(primeno+" "+"is not prime no");
				flag=false;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println(primeno+" "+ "is a prime no");
		}

	}

}
