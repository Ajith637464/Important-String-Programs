/* Create_Frequency_Match_Pattern
Input:  a3b2c5d1
Output: aaabbcccccd
*/
import java.util.Scanner;
class Create_Frequency_Match_Pattern
{
	static Scanner sc = new Scanner (System.in);
	public static String solve(String s) 
	{
		String res="";
		for (int i=0;i<s.length() ;i+=2)
		{
			for (int j=1;j<=(int)(s.charAt(i+1)-48);j++)
			{
				
				res+=s.charAt(i);
			}
		}
		return res;
    }
 

	public static void main(String[] args) 
	{
		System.out.print("Input:");
		String s=sc.nextLine();
		
		String res=solve(s);
		System.out.print("Ouput:"+res);

	}
}
