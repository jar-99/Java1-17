package java14;

public class FunctionsWithNoParametersAndReturnValuesPractice2 {

	    public static int globalVariable = 1;

	    public static void increment() {
	        globalVariable++;
	    }

	    public static void main(String[] args) {
	        while (globalVariable <= 15) {
	            increment();

	            if (globalVariable % 3 == 0) {
	                System.out.println("Cody!");
	            } else {
	                System.out.println(globalVariable);
	            }
	        }
	    }
	}