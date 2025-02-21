public class operator {
    public static void main(String[] args) {
        int a = 10, b = 5;
        boolean x = true, y = false;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operations:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Relational Operators
        System.out.println("\nRelational Operations:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. Bitwise Operators
        System.out.println("\nBitwise Operations:");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));
        System.out.println("a >>> 1: " + (a >>> 1));

        // 4. Logical Operators
        System.out.println("\nLogical Operations:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // 5. Assignment Operators
        System.out.println("\nAssignment Operations:");
        int c = 20;
        System.out.println("c = " + c);
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 2; // c = c / 2
        System.out.println("c /= 2: " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3: " + c);

        // 6. Ternary Operator
        System.out.println("\nTernary Operator:");
        int min = (a < b) ? a : b;
        System.out.println("Minimum of a and b: " + min);

        // 7. Increment and Decrement Operators
        System.out.println("\nIncrement & Decrement Operations:");
        int num = 10;
        System.out.println("num++: " + (num++)); // Post-increment
        System.out.println("++num: " + (++num)); // Pre-increment
        System.out.println("num--: " + (num--)); // Post-decrement
        System.out.println("--num: " + (--num)); // Pre-decrement

        // 8. instanceof Operator
        System.out.println("\nInstanceof Operator:");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
    }
}
