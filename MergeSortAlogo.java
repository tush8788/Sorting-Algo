class MergeSortAlgo
{
	public static void main(String[] args) {
		int arr[]={4,2,7,4,6,7,3};
		sort(arr);	
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	static void sort(int arr[])
	{
		if(arr.length<=1)
			return;
		int a[]=new int[arr.length/2];
		int b[]=new int[arr.length-a.length];

		for(int i=0;i<a.length;i++)
		{
			a[i]=arr[i];
		}

		for(int j=a.length;j<arr.length;j++)
		{
			b[j-a.length]=arr[j];
		}
		
		sort(a);
		sort(b);
		merge(a,b,arr);		
	}

	static void merge(int a[],int b[],int arr[])
	{
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				arr[k]=a[i];
				i++;
				k++;
			}
			else
			{
				arr[k]=b[j];
				j++;
				k++;
			}
		}

		while(i<a.length)
		{
			arr[k]=a[i];
			i++;
			k++;
		}

		while(j<b.length)
		{
			arr[k]=b[j];
			j++;
			k++;
		}
	}
}