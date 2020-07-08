package ArraysIntro;

public class Arrays {
    public static void main(String[] args) {

//        Introduction to Arrays declaration

//        Method 1 : ------
//        int[] marks , roll;
//        marks = new int[5];

//        Method 2 : -------
//        int[] marks = new int[5];

//        Method 3 : ---------
//        int marks[] , roll;
//        marks = new int[5];
//        here in method 3 we are initialising marks to be array(Data Structure) and
//        the roll be and primitive int type but in method 1 both roll and marks is Array(Data Structure)

//        int[] marks = new int[5];
//
//        for (int i =0; i<5; i++){
//            System.out.println(marks[i]);  // A shown output we got array is initialised with 0
//        }
//        System.out.println(marks[5]);
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
//        at ArraysIntro.Arrays.main(Arrays.java:26)

        int[] marks = {2, 3, 4, 45, 6};

        marks[2] =40;

        for (int i =0; i<marks.length; i++){
            System.out.println(marks[i]);  // A shown output we got array is directly initialised with no. given
        }

    }
}
