class factorial {
    public static void main(String[] args) {
        int num = 5, fact = 1;
        do {
            fact *= num;
            num--;
        } while (num > 0);
        System.out.println("Factorial: " + fact);
    }
}
