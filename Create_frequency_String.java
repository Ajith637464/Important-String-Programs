/* Create_frequency_String
Input: aaabbaac
Output: a3b2a2c1
*/
import java.util.Scanner;
class Create_frequency_String
{
	public static String solve(String s) 
	{
		String res="";
		for (int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int count=1;
			if (i == s.length()-1 && (s.charAt(i) == s.charAt(i-1)))
			{
				break;
			}
			for (int j=i+1;j<s.length() ;j++ )
			{
				if (ch==s.charAt(j))
				{
					count++;
				}
				else
				{
					i=j;
					i--;
					break;
				}
			}
			res+=ch+""+count;
		}
		return res;
	}
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Input:");
		String s=sc.nextLine();
		
		String res=solve(s);
		System.out.print("Ouput:"+res);

	}
}
