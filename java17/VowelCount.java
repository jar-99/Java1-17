package java17;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();


        char[] charArray = inputString.toCharArray();
        
        int vowelCount = vowelCount(charArray);
        System.out.println("Number of vowels: " + vowelCount);

    }

    public static int vowelCount(char[] charArray) {
        int count = 0;

        for (char ch : charArray) {
            if (isVowel(ch)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isVowel(char ch) {
  
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}