package ArrayProbs;
import java.util.Scanner;
public class Prob3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num,c=-1;
		num=sc.nextInt();
		int arr[]=new int[num];
		int i;
		for(i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key;
		key=sc.nextInt();
		for(i=0;i<num;i++)
		{
			if(key==arr[i])
			{
				System.out.println(i);
			}
			else
			{
				System.out.println("-1");
			}
		}
		
	}

}
