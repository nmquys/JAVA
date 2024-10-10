import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		double[] Arr1;      //khai bao mang
		Arr1 = new double[10];

		double[] Arr2 = new double[10];

		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < Arr1.length; i++)        //nhap phan tu cua mang
		{
			System.out.println("Nhap phan tu thu " + (i+1) +":");
			Arr1[i] = sc.nextDouble();
		}
		double sum = 0;
		for(int i = 0; i < Arr1.length; i++)
		{
			sum += Arr1[i];
		}

		System.out.println("Tong cua mang: " + sum);

		Arr2 = new double[]{1,2,3,4,5};     //khai bao mang khi biet phan tu
		for(int i = 0; i < Arr2.length; i++)
		{
			System.out.println(Arr2[i]);
		}
	}
}