package Bit_topicEveryday._11_22;

import java.util.*;

public class Finder {
    public static int findKth(int[] a, int n, int K)
    {
        Arrays.sort(a);
        int ret = a[n - 1];
        K--;
        for(int i = n - 2;i >= 0;i--)
        {
            if(a[i] == ret)
            {
                continue;
            }
            ret = a[i];
            K--;
            if(K == 0)
            {
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 2, 2};
        System.out.println(findKth(array, array.length, 3));
    }
}
