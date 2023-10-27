package java17;

import java.util.ArrayList;

public class FunctionThatReturnsAnArrayQuiz {
	    public static ArrayList<Integer> fibonacciInRange(int X, int Y) {
	        ArrayList<Integer> result = new ArrayList<>();
	        int a = 0, b = 1;
	        while (a <= Y) {
	            if (a >= X) {
	                result.add(a);
	            }
	            int temp = a + b;
	            a = b;
	            b = temp;
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        int X = 5;
	        int Y = 50;
	        ArrayList<Integer> fibonacciNumbers = fibonacciInRange(X, Y);
	        System.out.println(fibonacciNumbers);
	    }
	}