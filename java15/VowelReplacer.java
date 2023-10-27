package java15;

import java.util.Scanner;

public class VowelReplacer {
		    public static void main(String[] args)
	{
		        Scanner s = new Scanner(System.in);

		        System.out.print("Enter a sentence: ");
		        String sentence = s.nextLine();

		        // Replace all vowels in the sentence with the letter 'x'.

		       
		 String modifiedSentence = "";
		        for (int i = 0; i < sentence.length(); i++) {
		            char c = sentence.charAt(i);
		            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		                modifiedSentence += 'x';
		            } else {
		                modifiedSentence += c;
		            }
		        }
		        System.out.println(modifiedSentence);
		    }
		}