import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binary2decimal {

	public static void main(String[] args) {

		char a = 'A';

		List<Integer> binary = new ArrayList<Integer>();
		System.out.println(Character.getNumericValue(a));
		while (a != 0) {
			binary.add(a % 2);
			a /= 2;
		}
		System.out.println(binary);
		Collections.reverse(binary);
		System.out.println(binary);
	}

}
