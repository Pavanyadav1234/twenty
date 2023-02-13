class Sample17
{
	public static void main(String[] args) 
	{
		char ch1='a';
		char ch2='b';
		char ch3='c';
		char ch4='d';
		for(int i=1;i<=4;i++)
		{
		 System.out.print(ch1+""+ch2+""+i+""+ch3+""+ch4+" ");
		 ch1+=2;
		 ch2+=2;
		 ch3+=2;
		 ch4+=2;
		}
	}
}