class practice {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        ++a;  // a becomes 11

        int product = a * b;  // 11 * 15 = 165

        boolean condition = (product % 2 == 0) && (product > 100);
        // (165 % 2 == 0) → false
        // (165 > 100) → true
        // false && true → false

        String result = condition ? "Valid" : "Invalid";

        System.out.println("Updated a: " + a);
        System.out.println("Product: " + product);
        System.out.println("Condition Met: " + condition);
        System.out.println("Result: " + result);
    }
}
