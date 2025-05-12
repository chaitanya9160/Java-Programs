class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = -10;

        System.out.println("Initial values: a = " + a + ", b = " + b);

        // ++ and -- operators
        System.out.println("a++ = " + (a++)); 
        System.out.println("Now a = " + a);   
        System.out.println("++a = " + (++a)); 

        System.out.println("b-- = " + (b--)); 
        System.out.println("Now b = " + b);   
        System.out.println("--b = " + (--b)); 

        // + and - to change sign
        int x = +a; 
        int y = -b; 

        System.out.println("+a = " + x);      
    }
}
