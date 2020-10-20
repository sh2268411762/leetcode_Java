/**
 * 
 */
package Easy;

/**
*  @Description     给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，
*  					并返回他们的数组下标。
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月20日下午11:43:11
*/
public class L10_20
{
	public static int[] twoSum(int[] nums, int target) 
	{
		int[] a = new int[]{-1,-1};
		F1:for(int i = 0;i < nums.length;i++)
		{
			for(int j = i + 1;j < nums.length;j++)
			{
				if(nums[i] + nums[j] == target)
				{
					a[0] = i;
					a[1] = j;
					break F1;
				}
			}
		}
		return a;
    }
	public static void main(String[] args)
	{
		int[] nums = {3,2,4};
		int target = 6;
		nums = twoSum(nums,target);
		for(int i = 0;i < nums.length;i++)
		{
			System.out.println(nums[i]);
		}
	}

}
