class Sample13
{
	public static void main(String[] args) 
	{
		char ch1='a';
		char ch2='A';
		for (int i=1;i<=5;i++)
		{
			if(i%2!=0)
			{
		     System.out.println(ch1+""+i+""+ch2);
		     ch1++;
			 ch2++;
			}else{
				System.out.println(ch1+""+i+""+ch2);
				ch1++;
				ch2++;
			}
		}
	}
}