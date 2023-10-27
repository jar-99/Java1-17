package java15;

import java.util.Scanner;

public class AskInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    	System.out.print("Enter a number: ");
    	int n = scanner.nextInt();
      
        System.out.println(n);
    }
}