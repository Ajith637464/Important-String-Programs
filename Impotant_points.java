class Impotant_points
{
	public static void main(String[] args) 
	{
		String s1="Ajith";
		String s2="Vijay";
		
		// To compare to Strings use " equals( String ) method "
		
		if (s1.equals(s2))
		{
			//false;
		}
		// if you want ignore case use " equalsIgnoreCase( String ) " 
		
		if (s1.equalsIgnoreCase(s2))
		{
			//false;
		}
		// If you want String number into integer number use this Syntax...
		
		String s="10";
		int n=Integer.parseInt(a);//n--->10
		//long
		long nn=Long.parseLong(a);//nn--->10
		
		//-->   for find length                            length()
		//-->   extract letter                            charAt(index)
		//-->   to convert string to character array      toCharArray()
		
		//-->   to convert String (multiple words)		 split(" ")   ---> split the words based on space
		//      String Array                              split("")   --->if dont put space then individual 
		//                                                                letter convert String Array
		
		// --> to convert upper case string					toUpperCase();
		// --> to convert lower case string					toLowerCase();

		// '0'- ascii value - 48
		// 'A'- ascii value - 65
		// 'a'- ascii value - 97

		//char number to integer    ('2' ---> 2 )
		        int n=(int)(s.charAt(i)-48)
	}
}
