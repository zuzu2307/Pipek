#include<stdio.h>
int main()
{
	int a,b,c;
	scanf("%d",&a);
	while(a>1)
	{
		b=2;
		c=0;
		while(c!=1)
		{
			if(a%b==0)
			{
				printf("%d ",b);
				a/=b;
				c++;
			}
			b++;
		}
		
	}
}
