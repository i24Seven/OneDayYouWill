package i_WrapperClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharTest {
	public static void main(String[] args) throws IOException {
		// to accept a char from keyboard
		char ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) // execute repeatedly
		{
			System.out.println("Enter a character: ");
			ch = (char) br.read();
			// test and display the type of character
			System.out.println();
			if (Character.isDigit(ch)) {
				System.out.println("a digit");
			} else if (Character.isUpperCase(ch)) {
				System.out.println("An UpperCase letter");
			} else if (Character.isLowerCase(ch)) {
				System.out.println("a Lowercase letter");
			} else if (Character.isSpaceChar(ch)) {
				System.out.println("a spacebar character");
			} else if (Character.isWhitespace(ch)) {
				System.out.println("A Whitespace character.");
			}

			else {
				System.out.println("Sorry, I dont know that");
				br.skip(2); // to skip \n code from br.
			}
		}
	}
}