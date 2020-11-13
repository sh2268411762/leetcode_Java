package _01;

public class Java_1
{
    //*********Found**********
    public static void main(String args[])
    {
        byte  b = 8;
        long  g = 567L;
        float f = 3.1415f;
        double d = 2.789;
        int ii = 207;
        //*********Found**********
        long gg = g + ii;
        float ff = b*f;
        double dd = ff/ii+d;
        System.out.println("ii= "+ii);
        System.out.println("gg= "+gg);
        System.out.println("ff= "+ff);
        System.out.println("dd= "+dd);
    }
}