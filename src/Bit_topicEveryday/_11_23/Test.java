package Bit_topicEveryday._11_23;

class T
{
    public static void hello()
    {
        System.out.println("hello");
    }

}
class Base
{
    Base()
    {
        System.out.print("Base");
    }
}


public class Test extends Base
{
    public static void main(String[] args) {
        new Test();
        new Base();
        System.out.println(10/3);
    }

    public static boolean isAdmin(String userId)
    {
        return userId.toLowerCase() == "admin";
    }

    public static void main3(String[] args) {
        System.out.println(isAdmin(("Admin")));
    }


    public int aMethod()
    {
        //static int i = 0;
        int i = 0;
        i++;
        return i;
    }
    public static void main2(String[] args)
    {
        Test test = new Test();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
    public static void main1(String[] args)
    {
        T t = null;
        t.hello();
    }
}
