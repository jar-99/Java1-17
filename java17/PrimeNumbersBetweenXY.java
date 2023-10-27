package java17;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersBetweenXY {
    public static void main(String[] args) {
    	
    	 Scanner scanner = new Scanner(System.in);

         System.out.print("Enter number X: ");
         int x = scanner.nextInt();

         System.out.print("Enter number Y: ");
         int y = scanner.nextInt();

        ArrayList<Integer> primeNumbers = findPrimesBetweenXAndY(x, y);
        System.out.println(primeNumbers);
    }

    public static ArrayList<Integer> findPrimesBetweenXAndY(int x, int y) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = x; i <= y; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
		return false;
    }
}