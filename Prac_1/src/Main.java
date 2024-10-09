public class Main
{
    public static void main(String[] args)
    {
        int a = 100;
        int b = 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        float c = (float)a;     //ep kieu ngam dinh
        float d = (float)b;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        float e = 3.5f;
        float f = 9.5f;

        int g = (int)e;     //ep kieu tuong minh
        int h = (int)f;

        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //ep kieu giua bien nguyen thuy va doi tuong
        int x = new Integer(32);
        System.out.println("x = " + x);
    }
}