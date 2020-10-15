/**
 * 
 */
package Easy;

import java.util.*;

/**
*  @Description     输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月12日下午11:52:37
*/
public class L10_12
{
	public static int[] printNumbers(int n)
	{
		int[] a = new int[(int) Math.pow(10, n) - 1];
		for (int i = 1; i < Math.pow(10, n); i++)
		{
			a[i - 1] = i;
		}
		return a;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 0)
		{
			System.out.println("退出");
		} else
		{
			int[] arr = new int[(int) Math.pow(10, n) - 1];
			arr = printNumbers(n);
			System.out.print("[");
			for (int i = 0; i < arr.length; i++)
			{
				if (arr[i] == (Math.pow(10, n) - 1))
				{
					System.out.print(arr[i]);
				} else
				{
					System.out.print(arr[i] + ",");
				}
			}
			System.out.println("]");
		}
		sc.close();
	}
}
