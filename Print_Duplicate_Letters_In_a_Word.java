/* Print_Duplicate_Letters_In_a_Word
Input: Apple Ball Null Cat Owl
Output: P
		l
		l
		$
		$
*/
import java.util.Scanner;
class Print_Duplicate_Letters_In_a_Word
{
	public static void solve(String s) 
	{
		String[]str=s.split(" ");
		for (int k=0;k<str.length ;k++ )
		{
			boolean flag=true;
			String ss=str[k];
			char[]ch=ss.toCharArray();
			for (int i=0;i<ch.length ;i++ )
			{
				int count=1;
				for (int j=i+1;j<ch.length ;j++ )
				{
					if (ch[i]==ch[j] && ch[i] != ' ')
					{
						flag=false;
						count++;
						ch[j]=' ';
					}
				}
				if (count>1)
				{
					System.out.println(ch[i]);
				}

			}
			if (flag)
			{
				System.out.println("$");
			}
		}
		
		
	}
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Input: ");
		String s=sc.nextLine();
		
		solve(s);
		//System.out.println("Output: "+res);

	}
}
