package ArrayProbs;

import java.util.Scanner;

public class Prob5 
{
public static void main(String arg[])
{
	int size;
	Scanner sc = new Scanner(System.in);
	size=sc.nextInt();
	int a[]=new int[size];
	int i,j,temp;
	for(i=0;i<size;i++) {
		a[i]=sc.nextInt();
	}
	for(i=0;i<size;i++)
	{
		for(j=i;j<size-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(i=0;i<size;i++)
	{
		if(i==0 || i==1 ||i==size-1 ||i==size-2)
		{
			System.out.println(a[i]);
		}
	}
	
}
}
