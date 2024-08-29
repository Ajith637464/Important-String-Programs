/* sort Match the same pattern
Input:  azAZcNbM
Output: abAMcNzZ
*/
import java.util.Scanner;
class Sort_And_Match_The_Same_Pattern
{
	public static String solve(String s) 
	{
		String ss=s;
		char[]ch=ss.toCharArray();
		for (int i=0;i<ch.length ;i++ )
		{
			for (int j=0;j<ch.length-1;j++ )
			{
				if (ch[j+1]<ch[j])
				{
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		String lc="",uc="";
		for (int i=0;i<ch.length ;i++ )
		{
			if (ch[i]>='a' && ch[i]<='z' )
				lc+=ch[i];
			else if (ch[i]>='A' && ch[i]<='Z' )
				uc+=ch[i];
		}
		String res="";
		for (int i=0,j=0,k=0;i<s.length() ;i++ )
		{
			char chh=s.charAt(i);
			if (chh>='a' && chh<='z' )
			{
				res+=lc.charAt(j++);
			}
			else if (chh>='A' && chh<='Z' )
			{
				res+=uc.charAt(k++);
			}

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
