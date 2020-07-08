package StringData;

public class StringFunctions {
    public static void main(String[] args) {
        String name = "Shubham Kumar Jha";
        String name2 = new String("Shubham Kumar Jha");

        String emptyString = "";

        String firstName = "shubham";
        firstName = firstName + " kumar";

        String LastName = "     Jha     " ;

        String cars = "Hyundai,Maruti,Swift,Wagonr,Ferrari,Lamborghini";
        String allCars[] = cars.split(",");

        for (String car: allCars)
        {
            System.out.println(car);
        }

        System.out.println(cars.indexOf('M'));  // return the index of char
        System.out.println(cars.toLowerCase());
        System.out.println(firstName.toUpperCase());
        System.out.println(LastName.trim());

        System.out.println(name.charAt(2)); // First function it throw String index out of bound
        System.out.println(name.length()); // returns the lengths of strings
        System.out.println(name.substring(3)); // returns char or string from given index to last
        System.out.println(name.substring(3,8)); // returns char or string between two index
        System.out.println(name.contains("Jha")); // true or false
        System.out.println(name == name2); // false : if reference is different
        System.out.println(name.equals(name2)); // true : if values are same
        System.out.println(emptyString.isEmpty()); // true if empty
        System.out.println(firstName.concat(" Jha"));
        System.out.println(firstName.replace('s','S'));

    }
}
