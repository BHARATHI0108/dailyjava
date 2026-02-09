class Operatordemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic operator
        System.out.println("Arithmetic (a + b) = " + (a + b));

        // Relational operator
        System.out.println("Relational (a > b) = " + (a > b));

        // Logical operator
        System.out.println("Logical (a > 5 && b < 10) = " + (a > 5 && b < 10));

        // Assignment operator
        int x = 5;
        x += 3;
        System.out.println("Assignment (x += 3) = " + x);
    }
}
