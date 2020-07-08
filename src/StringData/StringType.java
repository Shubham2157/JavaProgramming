package StringData; // immutable non-primitive datatype

public class StringType {
    public static void main(String[] args) {

        String name = "Shubham"; //this is by litral method String pool  area
        // this is make by java developer to optimise as it reuses the String rather creating new

        String name2 = "Shubham";

        String anotherName = new String("shubham");  // by new keyword heap area ::
        // it initialises two times 1 in heap and another in String pool area if it is not present in that area


        System.out.println(name);
        System.out.println(anotherName);
        System.out.println(name == anotherName);
        System.out.println(name == name2);
    }
}
