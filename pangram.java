# bharathiii
package assign;
import java.util.*;
public class longstring {
	

	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	String s="String is not pangram";
	String s1="String is pangram";
	System.out.println("enter the string ");
	String a=sc.nextLine();
	if(a.length()<26)
	{
		System.out.println(s);
	}
	else 
	{
		for(char d='a';d<='z';d++)
		{
		if((a.indexOf(d)<0))
		{
			s1="String is not palgram";
			break;
			
		}
		
		
	}
		System.out.println(s1);
	}}}

