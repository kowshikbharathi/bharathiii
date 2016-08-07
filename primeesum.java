# bharathiii


public class primeorg {
	public int PrimeNums(int input1){
		// Write code here...
		if(input1>0)
		{
		int k[]=new int[]{11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
		int tmp=0,n=0;
		for(int i=k.length-1;i>=0;i--)
		{
			for(int j=1;k[i]*j<=input1;j++)
			{
				if((n=PrimeNums(input1-k[i]*j))!=-1||(input1-k[i]*j)==0)
				{
					  if(n==-1)
					  	tmp=j;
					  else
						tmp=tmp+j+n;
						i=0;
						break;	
				}
			}
		}
		
		if(tmp!=0)
			return tmp;
		}
		return -1;
		}
		public static void main(String args[]){
	    	primeorg obj=new primeorg();
	    	System.out.println(obj.PrimeNums(121));
}
}
