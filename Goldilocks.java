package Goldilocks;

public class Goldilocks {

	public String Goldilocks1(int weight, int temperature) {

		String str = "";

		int w[] = { 297, 66, 257, 276, 280, 219, 254, 86, 206, 71, 104, 238, 52, 129, 144, 157, 210, 11, 268, 261, 12,
				186, 174, 77, 54, 174, 16, 59, 290, 248 };

		int t[] = { 90, 110, 113, 191, 129, 163, 193, 153, 147, 137, 40, 127, 146, 197, 59, 124, 59, 54, 119, 121, 189,
				108, 21, 18, 90, 52, 129, 181, 123, 132 };

		for (int n = 0; n < w.length; n++) {

			if (weight <= w[n] && temperature >= t[n])
				str += n + " ";
		}
		System.out.println(str);

		return str;

	}

}
