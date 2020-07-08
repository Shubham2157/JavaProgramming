package JavaOperator;

public class SimpleOperator {

    public static void main(String[] args) {

        // Arithmatic Operator

        int a = 23;
        int b = 45;

        int c = a + b;
        System.out.println("a(23) + b(45) = " +c);

        int d = b/a;
        System.out.println("a(23) / b(45) = " +d);

        double e = b/a;
        System.out.println("a(23) / b(45) = (double) " +e);

        double f = (double) b/ (double) a;
        System.out.println("(double)a(23) / (double)b(45) = (double)" +f);

        int g = b % a;
        System.out.println("a(23) % b(45) = " +g);

        int h = b++;
        System.out.println(" (b++) " +" h = "+ h + " b = " + b);

        int i = ++b;
        System.out.println(" (++b) " +" i = "+ i + " b = " + b);


    }
}
