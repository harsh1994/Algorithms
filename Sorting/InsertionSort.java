/*
	Complexity:O(n*n)
	Max time when elements are sorted in reverse order.
	Uses: Insertion sort is used when number of elements is small. 
	It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.
*/


class InsertionSort{
	public static void main(String[] args)
	{
		int a[] = {5,4,3,2,1};

		for(int i=1;i<a.length;i++)
		{
			int element = a[i];
			int j=i-1;

			while(j>=0&&a[j]>element)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1]=element;
		}

		for(int x:a)
			System.out.print(x+" ");
	}
}