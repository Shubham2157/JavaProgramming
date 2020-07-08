package Loop;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++)
        {
            for (int j =1; j<=10; j++){
                System.out.print( " "+j);
            }
            System.out.println();
        }
    }
}
