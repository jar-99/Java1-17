package java17;

import java.util.Scanner;
import java.util.Arrays;

	public class ArrayWithZeroes {
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int N = scanner.nextInt();
	        
	        int[] zeroArray = makeZeroes(N);
	        System.out.println(Arrays.toString(zeroArray));
	    }

	    public static int[] makeZeroes(int N) {
	        int[] zeroArray = new int[N];
	        Arrays.fill(zeroArray, 0);
	        return zeroArray;
	    }
	}