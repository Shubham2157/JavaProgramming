package Array2D;

public class BubbleShort {
    // we are swapping the two no if right element is smaller then left
    //this is not so much optimise as it makes much swapping
    public static void main(String[] args) {
        int a[] = {1, 4, -2, -6, 3};
        int n = a.length;
        System.out.print("Unshorted Array is : ");
        for (int item: a)
        {
            System.out.print(item + " ");
        }

        for (int i = 0; i< n-1; i++)
        {
            boolean shorted = true; // for optimising as array is shorted then no need to run the loop
            for (int j = 0; j< n-1-i; j++)
            {
                if (a[j+1]<a[j])
                {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j]=temp;
                    shorted = false;
                }
            }
            if (shorted){
                break;
            }
        }
        System.out.print("\nThe Shorted Array is : ");

        for (int item: a) // enhanced for loop for arrays and list
        {
            System.out.print(item + " ");
        }
    }
}
