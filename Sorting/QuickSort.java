/*CLRS implementation where pivot is the last element.*/

class QuickSort{

	public static int partition(int[] arr,int low,int high)
	{
		int pivot = arr[high];
		int i = low-1;

		for(int j=low;j<=high-1;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = arr[i];
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp; 

		return i+1;
	}

	public static void quickSort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			int pi = partition(arr,low,high);
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}

	public static void main(String[] args)
	{
		int[] arr = {5,4,3,2,1};

		quickSort(arr,0,arr.length-1);

		for(int x:arr)
			System.out.print(x+" ");
	}
}