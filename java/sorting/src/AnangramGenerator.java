import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class AnangramGenerator {

	private static int size;
	private static int count;
	private static char[] arrChar;// = new char[100];

	public static void main(String[] str) throws IOException {
		System.out.print("Enter a word: ");
		String input = getString();
		size = input.length();
		count = 0;
		arrChar = input.toCharArray();
		doAnagram(size);

	}


	private static void doAnagram(int newSize) {
		if (newSize == 1)
			return;
		for (int j = 0; j < newSize; j++) {
			doAnagram(newSize - 1);
			if (newSize == 2)
				displayWord();
			rotate(newSize);
		}
	}

	private static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	private static void rotate(int newSize) {
		int j;
		int position = size - newSize;
		char temp = arrChar[position];
		for (j = position + 1; j < size; j++)
			arrChar[j - 1] = arrChar[j];
		arrChar[j - 1] = temp;

	}

	private static void displayWord() {	
		System.out.println(++count + " "+ new String(arrChar));	
	}
}
