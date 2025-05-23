class count_vowel{
    public static void main(String[] args) {
        String str = "Hello World";
        int i = 0, count = 0;
        do {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
            i++;
        } while (i < str.length());
        System.out.println("Vowel count: " + count);
    }
}
