class Sample16
{
	public static void main(String[] args) 
	{
		char ch1='a';
		char ch2='b';
		char ch3='c';
		for(int i=1;i<=4;i++)
			if(i%2!=0)
		{
		 System.out.println(ch1+""+ch2+""+ch3+""+i);
		 ch1++;
		 ch2++;
		 ch3++;
		}
		else
			{
			 System.out.println(ch1+""+ch2+""+ch3+""+i);
		     ch1++;
		     ch2++;
		     ch3++;
			}
	}
}