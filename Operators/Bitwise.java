class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;    
        int b = 3;    

        System.out.println("a = " + a + " (binary: 0101)");
        System.out.println("b = " + b + " (binary: 0011)");

        System.out.println("a & b  = " + (a & b));  
        System.out.println("a | b  = " + (a | b)); 
        System.out.println("a ^ b  = " + (a ^ b)); 
        System.out.println("~a     = " + (~a));     

        System.out.println("a << 1 = " + (a << 1)); 
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1 = " + (a >>> 1)); 

        // For negative value demonstration
        int x = -8; // binary: 1111...1000 (32 bits)
        System.out.println("x = " + x);
        System.out.println("x >> 2  = " + (x >> 2));  
        System.out.println("x >>> 2 = " + (x >>> 2)); 
    }
}
