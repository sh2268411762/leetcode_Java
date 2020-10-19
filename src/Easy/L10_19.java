/**
 * 
 */
package Easy;

import java.util.Scanner;

/**
*  @Description     两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
					给出两个整数 x 和 y，计算它们之间的汉明距离。
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月19日下午8:11:59
*/
public class L10_19
{
	public static int hammingDistance(int x, int y)
	{
		if ((x < 0) || (y >= Math.pow(2, 31)))
		{
			return -1;
		} else
		{
			int count = 0;
			int num = x ^ y;
			while (num != 0)
			{
				count++;
				num = (num - 1) & num;
			}
			return count;
		}
//		return Integer.bitCount(x ^ y); 
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("x = ");
		int x = sc.nextInt();
		System.out.print("y = ");
		int y = sc.nextInt();
		sc.close();
		System.out.println(hammingDistance(x, y));
	}
}
