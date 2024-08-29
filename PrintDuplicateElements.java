/* PrintDuplicateElements 
Input: abcdab
Output: ab

Input: abcd
Output: $
*/
import java.util.Scanner;
class PrintDuplicateElements 
{
	public static String solve(String s) 
	{
		String res="";
		char[]ch=s.toCharArray();
		boolean flag=false;
		for (int i=0;i<ch.length ;i++ )
		{
			int count=1;
			for (int j=i+1;j<ch.length ;j++ )
			{
				if (ch[i]==ch[j] && ch[j] !=' ')
				{
					count++;
					flag= true;
					ch[j]=' ';
				}
			}
			if (count>1)
			{
				res+=ch[i];
			}
		}
		if (flag)
		{
			return res;
		}
		else
			return "$";
	}
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Input: ");
		String s=sc.nextLine();
		
		String res=solve(s);
		System.out.println("Output: "+res);

	}
}
