import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a = ");
        int a = sc.nextInt();

        String ketQua = (a % 2 == 0)? "so chan" : "so le" ;  //(bolean statment)? if-true-return-this : if-false-return-this ;

        System.out.println("Ket qua: " + ketQua);
    }
}