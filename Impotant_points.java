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

		String a="Tutor Joes";	
		String b="tutor Joes";
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("A Hashcode : "+a.hashCode());
		System.out.println("B Hashcode : "+b.hashCode());
		System.out.println("Equals : "+a.equals(b));
		System.out.println("Equals Ignore Case : "+a.equalsIgnoreCase(b));
		System.out.println("Length : "+a.length());
		System.out.println("CharAt : "+a.charAt(0));
		System.out.println("to Upper Case : "+a.toUpperCase());
		System.out.println("to Lower Case : "+a.toLowerCase());
		System.out.println("Replace : "+a.replace("Joes","Stanly"));
		System.out.println("Contains : "+a.contains("Tutor"));
		System.out.println("is Empty : "+a.isEmpty());
		System.out.println("starts With : "+a.startsWith("Tut"));
		System.out.println("ends With : "+a.endsWith("oes"));
		System.out.println("sub string : "+a.substring(5));
		System.out.println("sub string : "+a.substring(0,5));
		System.out.println("to CharArray : ");
		char[]ch=a.toCharArray();
		System.out.println("a: "+Arrays.toString(ch));
		String c=" Tutor ";
		System.out.println("before trim length: "+c.length()); //7
		System.out.println("trim : "+c.trim().length()); ///5
	}
}
