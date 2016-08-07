# bharathiii
package assign;
import java.util.*;
public class longstring {
	

	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	int n,j;
	n=sc.nextInt();
	String a[]=new String[100];
	for(int i=0;i<n;i++)
	{
	a[i]=sc.next();
	}
	String l = null,chk;
	if(a.length>0)
	l=a[0];
	for(int i=1;i<a.length;i++)
	{
	chk=a[i];
	for(j=0;j<Math.min(l.length(),a[i].length());j++)
	{
	if(l.charAt(j)!=chk.charAt(j))
	break;
	}
	l=a[i].substring(0,j);
	}
	System.out.println("longest prefix is:"+l);
	}
	}


