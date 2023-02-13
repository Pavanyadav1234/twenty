class Sample14
{
	public static void main(String[] args) 
	{
		char ch1='a';
		char ch2='A';
		for (int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
		     System.out.println(i+""+ch1+""+i);
		     ch1++;
			 ch2++;
			}else{
				System.out.println(i+""+ch2+""+i);
				ch1++;
				ch2++;
			}
		}
	}
}