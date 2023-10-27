package java16;

import java.util.Scanner;

public class ReverseVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversedVowelsString = reverseVowels(input);

        System.out.println("Reversed Vowels String: " + reversedVowelsString);
    }

    public static String reverseVowels(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (isVowel(charArray[left]) && isVowel(charArray[right])) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            } else if (!isVowel(charArray[left])) {
                left++;
            } else {
                right--;
            }
        }

        return new String(charArray);
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}