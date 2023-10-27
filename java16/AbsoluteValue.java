package java16;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int absoluteValue = abs(number);

        System.out.println(absoluteValue);
    }

    public static int abs(int num) {
        return Math.abs(num);
    }
}