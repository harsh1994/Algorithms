/*
    Complexity:O(n*n)
    Max time when elements are sorted in reverse order.
*/
public class BubbleSort {

    public static void main(String[] args) {
        int swap=0;
        // int n = 5;
        int a[] = {5,4,3,2,1};
        
        
        for(int i=0;i<a.length;i++)
            {
            for(int j=0;j<a.length-1;j++)
                {
                if(a[j]>a[j+1])
                    {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swap++;
                }
            }
             
             if(swap==0)
                 break;
        }
        
        System.out.println("Array is sorted in "+swap+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
    }
}
