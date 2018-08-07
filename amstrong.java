/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n,c=0,temp,a;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
		a=n%10;
		n=n/10;
		c=c+(a*a*a);
		}
		if(temp==c)
		System.out.println("yes");
		else
		System.out.println("no");
			// your code goes here
	}
}
