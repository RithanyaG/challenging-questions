/*
	n=8  arr=[4,5,0,1,9,0,5,0]
	push 0s to the last
*/
#include <stdio.h>
main()
{
	int n,i,temp,j;
	printf("Enter array size:");
	scanf("%d",&n);
	int arr[n];
	for(i=0;i<n;i++)
	{
		printf("\n");
		scanf("%d",&arr[i]);
	}
	printf("\nArray elements:\n");
	for(i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
	for(i=0;i<n;i++)
	{
		if(arr[i]==0)
		{
			temp=arr[i];
			for(j=i+1;j<n;j++)
			{
				if(arr[j]!=0)
				{
					arr[i]=arr[j];
					arr[j]=temp;
					break;
				}
			}
		}
	}
	printf("\nFinal array:");
	for(i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
}
