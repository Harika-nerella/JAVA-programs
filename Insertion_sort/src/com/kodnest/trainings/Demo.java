package com.kodnest.trainings;

 class Demo {
    static void fun(int a[])
	{
		int item;
		for(int i=1;i<a.length;i++)
		{
			item=a[i];
			int j=i-1;
			while(j>=0&&a[j]>item)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=item;
		}
		
	}

}
