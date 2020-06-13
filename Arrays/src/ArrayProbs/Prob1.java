package ArrayProbs;
import java.util.Scanner;
public class Prob1 {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int num,sum=0,avg;
	num=sc.nextInt();
	int arr[]=new int[num];
	int i;
	for(i=0;i<num;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(i=0;i<num;i++)
	{
		sum+=arr[i];
	}
	avg=sum/num;
	System.out.println(sum);
	System.out.println(avg);
}

}
