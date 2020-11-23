package Bit_topicEveryday._11_23;

public class AntiOrder
{
    public int count(int[] A, int n)
    {
        int ret = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                if (A[i] > A[j])
                {
                    ret++;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args)
    {
        AntiOrder a = new AntiOrder();
        int[] aa = new int[]{1, 2, 3, 4, 5, 6, 7, 0};
        System.out.println(a.count(aa, 8));
    }
}
