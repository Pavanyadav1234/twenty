class Sample15
{
	public static void main(String[] args) 
	{
		char ch1='a';
		int a=8;
		for (int i=10;i>=3;i--,a--)
		{
			if(i%2==1)
				if(a%2==1)
			{
		     System.out.print(i+""+ch1+""+a+" ");
			 ch1++;
			}
		}
	}
}