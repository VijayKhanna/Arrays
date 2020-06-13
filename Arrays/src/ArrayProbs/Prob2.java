package ArrayProbs;
import java.util.Scanner;
public class Prob2 {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int num,max,min;
	num=sc.nextInt();
	int arr[]=new int[num];
	int i;
	for(i=0;i<num;i++)
	{
		arr[i]=sc.nextInt();
	}
	min = arr[0];
    for(i=0;i<num;i++) 
    {
       if(arr[i]<min) 
       {
          min=arr[i];
       }
    }
    max = arr[0];
    for(i=0;i<num;i++) 
    {
       if(arr[i]>max) 
       {
          max=arr[i];
       }
    }
    System.out.println(min);
    System.out.println(max);
}
}
