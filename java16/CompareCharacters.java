package java16;

import java.util.Scanner;

public class CompareCharacters {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first character: ");
        char firstValue = sc.next().charAt(0);
        
        System.out.print("Enter second character: ");
        char secondValue = sc.next().charAt(0);

        int compareResult = Character.compare(firstValue, secondValue);

        if (compareResult < 0) {
            System.out.println("The first character is less than the second character.");
        } else if (compareResult > 0) {
            System.out.println("The first character is greater than the second character.");
        } else {
            System.out.println("The two characters are equal.");
        }
    }
}