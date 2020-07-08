package Array2D;

public class SelectionShort {
    public static void main(String[] args) {
        //First it select smallest no and put in the first place

        int a[] = {1, 4, -2, -6, 3};
        int n = a.length;
        System.out.print("Unshorted Array is : ");
        for (int item: a)
        {
            System.out.print(item + " ");
        }

        for (int i = 0; i<n-1; i++)
        {
            int minInd = i;
            for (int j = i; j<n-1; j++)
            {
                if (a[j]<a[minInd])
                {
                    minInd = j;
                }
            }
            int temp = a[i];
            a[i]=a[minInd];
            a[minInd]=temp;
        }
        System.out.print("\nThe shorted Array is : ");
        for (int e: a)
        {
            System.out.print(e + " ");
        }
    }
}
