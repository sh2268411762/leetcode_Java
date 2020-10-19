/**
 * 
 */
package Easy;

import java.util.Scanner;

/**
*  @Description     机器人能否返回原点
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月19日上午12:28:23
*/
public class L10_18
{
	public static boolean judgeCircle(String moves) 
	{
		boolean isTrue = false;
		int countUp = 0;
		int countRight = 0;
		for(int i = 0;i < moves.length();i++)
		{
			String c = moves.substring(i, i+1);
			if (c.equals("U"))
			{
				countUp++;
			}
			if (c.equals("D"))
			{
				countUp--;
			}
			if (c.equals("R"))
			{
				countRight++;
			}
			if (c.equals("L"))
			{
				countRight--;
			}
		}
		if (countUp == 0 && countRight == 0)
		{
			isTrue = true;
		}
		return isTrue;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean ret = judgeCircle(str);
		System.out.println(ret);
		sc.close();
	}
}
