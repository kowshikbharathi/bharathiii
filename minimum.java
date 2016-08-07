# bharathiii
package assign;

import java.util.Scanner;

public class guvi {
	
	public static void main(String ar[])
	{
	    int r,t,k;
	    int p[]=new int[100];
	Scanner sc=new Scanner(System.in);
	guvi m1=new guvi();
	String s=new String();
	s=sc.next();
	k=sc.nextInt();
	int n=Integer.parseInt(s);
	t=0;
	while(n>0)
	{
	r=n%10;
	p[t++]=r;
	n/=10;
	}
	m1.sort(p,k,t);
	}
	public void sort(int l[],int m,int g)
	{
	    int t;
	for(int i=0;i<g-1;i++)
	{
	for(int j=i+1;j<g;j++)
	{
	if(l[i]>l[j])
	{
	t=l[i];
	l[i]=l[j];
	l[j]=t;
	}
	}
	}
	for(int i=0;i<m;i++)
	    System.out.print(l[i]);
	}
	}

