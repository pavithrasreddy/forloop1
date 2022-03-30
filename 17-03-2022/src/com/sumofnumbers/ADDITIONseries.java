package com.sumofnumbers;

public class ADDITIONseries
{

	public static void main(String[] args)
	{
		int sum,n;
		n=10;
		sum=0;
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum-i;
		
			}
			else
			{
				sum=sum+i;
			}
			
		}
          System.out.println("The sum of the series is="+sum);
	}

}
