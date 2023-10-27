package java17;

import java.util.Scanner;

public class MaxSubArrayFinder {
	    public static void main(String[] args) {
	        
	    	Scanner scanner = new Scanner(System.in);

	        // Step 1: Accept an integer N input
	        System.out.print("Enter the total number of inputs n: ");
	        int N = scanner.nextInt();

	        // Step 2: Create an array to store N integer elements
	        int[] inputArray = new int[N];

	        System.out.println("Enter " + N + " integer elements:");
	        for (int i = 0; i < N; i++) {
	            inputArray[i] = scanner.nextInt();
	        }

	        // Call the function to find and print the largest contiguous subarray
	        findMaxSubArray(inputArray);

	        scanner.close();
	    }

	    public static void findMaxSubArray(int[] arr) {
	        int maxSum = Integer.MIN_VALUE;
	        int currentSum = 0;
	        int start = 0;
	        int end = 0;
	        int tempStart = 0;

	        for (int i = 0; i < arr.length; i++) {
	            currentSum += arr[i];
	            if (currentSum > maxSum) {
	                maxSum = currentSum;
	                start = tempStart;
	                end = i;
	            }
	            if (currentSum < 0) {
	                currentSum = 0;
	                tempStart = i + 1;
	            }
	        }

	        System.out.println("Largest contiguous subarray: ");
	        for (int i = start; i <= end; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println("\nMaximum sum: " + maxSum);
	    }
	}