/* Find_Frequency_Of_The_String
Input: javajava
Output: j : 2
		a : 4
		v : 2
*/
import java.util.Scanner;
class Find_Frequency_Of_The_String
{
	public static void solve(String s) 
	{
			char[]ch=s.toCharArray();
			for (int i=0;i<ch.length ;i++ )
			{
				int count=1;
				for (int j=i+1;j<ch.length ;j++ )
				{
					if (ch[i]==ch[j] && ch[i] != ' ')
					{
						count++;
						ch[j]=' ';
					}
				}
				if (ch[i] != ' ')
					System.out.println(ch[i]+" : "+count);
			}
		
		
	}
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Input:");
		String s=sc.nextLine();
		
		solve(s);
		//System.out.println("Output: "+res);

	}
}
