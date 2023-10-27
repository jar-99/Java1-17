package java14;

import java.util.Scanner;

public class FunctionsWithNoParametersAndReturnValuesPracticeOne {
	    public static void main(String[] args) {
	        
	    	Scanner scanner = new Scanner(System.in);
	    	
	    	System.out.print("Call count: ");
	    	int n = scanner.nextInt();
	        for (int i = 1; i < n; i++) {
	            hello();
	        System.out.println("Call counter: " + i );
	        }
	    }

	    public static void hello() {

	    }
	}