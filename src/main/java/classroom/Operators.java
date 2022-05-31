package classroom;

public class Operators {
    public static void main(String[] args) {

        // Equal to ==
        int a = 10;
        int b = 10;
        System.out.println(a == b);

        // Not equal to !=
        System.out.println(a != b);

        // Less than <
        int x = 30;
        int y = 50;
        System.out.println(x < y);

        // Greater than >
        x = 100;
        y = 101;
        System.out.println(x > y);

        boolean isGreater = 20 > 10;
        System.out.println(isGreater);

        // Less than or equal to

        a = 100;
        b = 100;
        System.out.println(a <= b);

        // Greater than or equal to

        a = 200;
        b = 100;
        System.out.println(a >= b);


        String name = new String("Elīna");
        String name2 = "Elīna";
        System.out.println(name.equals(name2));
        System.out.println(name == name2);

        // Logical operators
        x = 11;
        boolean result = x < 5 && x < 10;
        System.out.println(result); // false

        result = 3 < 5 && 4 > 5;
        System.out.println(result); // false

        result = 3 < 5 && 4 < 5;
        System.out.println(result); // true

        result = 3 < 5 || 4 > 5;
        System.out.println(result); // true

        a = 10;
        b = 20;
        result = !(a < b);
        System.out.println(result); // false
        result = !(a > b);
        System.out.println(result); // true




    }
}
