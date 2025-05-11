class ShiftOperators {
    public static void main(String[] args) {
        int a = 8;  
        int b = -8; 

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Left Shift <<
        System.out.println("a << 1 = " + (a << 1)); 
        System.out.println("a << 2 = " + (a << 2));  

        // Right Shift >>
        System.out.println("a >> 1 = " + (a >> 1));  
        System.out.println("b >> 1 = " + (b >> 1));  

        // Unsigned Right Shift >>> 
        System.out.println("a >>> 1 = " + (a >>> 1)); 
        System.out.println("b >>> 1 = " + (b >>> 1)); 
    }
}
