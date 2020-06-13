package ArrayProbs;
import java.util.Scanner;
public class Prob7
{
public static void main(String args[])
{
		int size;
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		int a[]=new int[size];
		int i,j=0;
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp[] = new int[size];    
	        for (i=0; i<size-1; i++)
	        {  
	            if (a[i] != a[i+1])
	            {  
	                temp[j++] = a[i];  
	            }  
	         }  
	        temp[j++] = a[size-1];       
	        for (i=0; i<j; i++)
	        {  
	            a[i] = temp[i];  
	        }  
		for(i=0;i<size;i++)
		{
			System.out.print( temp[i]);
		}
	}
}
