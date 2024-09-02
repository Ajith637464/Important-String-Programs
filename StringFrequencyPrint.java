import java.util.*;
class StringFrequencyPrint
{
	static Scanner sc = new Scanner (System.in);
	public static String stringFrequencyPrint(String s)
	{
		String ans="";
		boolean flag1=false,flag2=false;
		String s1="",s2="";
		for (int i=0;i<s.length();i++ )
		{
			char ch=s.charAt(i);
			if (!(ch>='0' && ch<='9')) // to store letters
			{
				flag1=true;
				s1+=ch;
			}
			else if (ch>='0' && ch<='9') //to store count
			{
				s2+=ch;
				if (i==s.length()-1 || (!(s.charAt(i+1)>='0' && s.charAt(i+1)<='9'))) //if count>9 
				{
					flag2=true;
				}
			}

			if (flag1 && flag2) 
			{
				int n=Integer.parseInt(s2);
				for (int k=1;k<=n;k++ )
				{
					ans+=s1;
				}
				s1="";
				s2="";
				flag1=false;
				flag2=false;
			}
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		System.out.print("\nEnter the String: ");
		String s=sc.next();

		String res=stringFrequencyPrint(s);
		System.out.println("\nOutput: "+res);
	}
}
/*
Enter the String: a2b3cc10

Output: aabbbcccccccccccccccccccc
*/
