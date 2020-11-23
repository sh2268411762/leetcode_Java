package Bit_topicEveryday._11_23;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while((n = sc.nextInt()) > 0)
        {
            int m = 0;
            int count = 0;
            while(n >= 3)
            {
                count = n / 3;
                m += count;
                n = n - 2 * count;
            }
            if(n == 2)
            {
                m += 1;
            }
            System.out.println(m);
        }
        sc.close();
    }
}
