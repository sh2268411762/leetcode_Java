/**
 * 
 */
package Easy;


/**
*  @Description     给你一个整数数组 arr ，以及 a、b 、c 三个整数。请你统计其中好三元组的数量。
					如果三元组 (arr[i], arr[j], arr[k]) 满足下列全部条件，则认为它是一个 好三元组 。
					0 <= i < j < k < arr.length
					|arr[i] - arr[j]| <= a
					|arr[j] - arr[k]| <= b
					|arr[i] - arr[k]| <= c
					其中 |x| 表示 x 的绝对值。
					返回 好三元组的数量 。

*  @author          孙豪
*  @version         版本
*  @Date            2020年10月15日下午9:26:47
*/
public class L10_15
{
	public static int countGoodTriplets(int[] arr, int a, int b, int c)
	{
		int count = 0;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				for (int k = 0; k < arr.length; k++)
				{
					if (i != j && k != j && i != k)
					{
						int i1 = arr[i] - arr[j];
						if (i1 < 0)
						{
							i1 = -i1;
						}
						int j1 = arr[j] - arr[k];
						if (j1 < 0)
						{
							j1 = -j1;
						}
						int k1 = arr[i] - arr[k];
						if (k1 < 0)
						{
							k1 = -k1;
						}

						if ((0 <= i && i < j && j < k && k < arr.length) && (i1 <= a) && (j1 <= b) && (k1 <= c))
						{
							count++;
						}
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		int[] arr = { 3, 0, 1, 1, 9, 7 };
		int a = 7, b = 2, c = 3;
		int ret = countGoodTriplets(arr, a, b, c);
		System.out.println(ret);
	}
}
