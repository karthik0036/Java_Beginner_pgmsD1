package com.bridge.D1_assignments;


public class Invalid_int {

	public static void main(String a[]) {
		// TODO Auto-generated method stub
		int n, count=0, sum=0;
		
		for(int i=0;i<a.length;i++)
		{
		try
		{
		n=Integer.parseInt(a[i]);
		sum= sum+n;
		}
		catch (NumberFormatException e)
		{
		//system.out.println("invalid integer:");
		count++;
		}
		}
		System.out.println("Sum of only valid integers is= "+sum) ;

		System.out.println("Invalid integers are: "+count) ;

	}

}
