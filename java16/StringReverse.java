package java16;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversedString = reverseString(input);

        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}