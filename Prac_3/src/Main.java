import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen n: ");
		n = sc.nextInt();

		if(n % 2 == 0)
		{
			System.out.println("so chan");
		}
		else
		{
			System.out.println("so le");
		}
	}
}