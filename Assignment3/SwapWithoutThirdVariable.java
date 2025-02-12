public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before Swap: str1 = " + str1 + ", str2 = " + str2);

        // Swapping logic using arithmetic operations on string lengths
        str1 = str1 + str2;
        str2 = str1.substring(0, (str1.length() - str2.length()));
        str1 = str1.substring(str2.length());

        System.out.println("After Swap: str1 = " + str1 + ", str2 = " + str2);
    }
}
