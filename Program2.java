import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=scan.nextInt();
		
		//printing pattern
		for(int i=1; i<=a; i++)
		{
			for(int j=1; j<=2*i-1; j+=2)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

