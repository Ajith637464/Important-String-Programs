/* Count_Upper_Lower_SpecialChars_Integers
Input: A$abcDM87bc
Output: Uppercase: 3
	Lowercase: 5
	Speialchars: 1
	Integers: 2
*/
import java.util.Scanner;
class Find_Frequency_Of_The_String
{
	public static void solve(String s) 
	{
		int uc=0,lc=0,sc=0,integer=0;
		char[]ch=s.toCharArray();
		for (int i=0;i<ch.length ;i++ )
		{
			if(ch[i]>='0' && ch[i]<='9')
				integer++;
			else if(ch[i]>='a' && ch[i]<='z')
				lc++;
			else if(ch[i]>='A' && ch[i]<='Z')
				uc++;
			else 
				sc++;
		}
		System.out.println("Uppercase: "+uc);
		System.out.println("Lowercase: "+lc);
		System.out.println("Speialchars: "+sc);
		System.out.println("Integers: "+integer);
	}
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Input:");
		String s=sc.nextLine();
		
		solve(s);
	}
}
