import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainClass {
	public static void main (String[] args) {
		//1 пункт
		ArrayList<Integer> c = new ArrayList<Integer>(); //объявление массива
		for (int i = 21; i > 4; i = i-2) {
			c.add(i);
		}

		//2 пункт
		ArrayList<Double> x = new ArrayList<Double>();
		Random r = new Random();
		double rmin = -13.0;
		double rmax = 4.0;
		for (int i = 1; i < 15; i++) {
			double randomValue = rmin + (rmax - rmin)*r.nextDouble(); //данная формула вычисляет случайное число в нужном диапазоне
			x.add(randomValue);
		}

		//3 пункт
		double[][] z = new double[9][14];
		int[] checklist = {9, 15, 19, 21};
		for (int i=0; i < c.size()-1; i++) {
			for (int j=0; j < x.size()-1; j++) {
				if (c.get(i) == 17) {
					z[i][j] = Math.sin(Math.cos(Math.pow(x.get(j), x.get(j))));

				}
				else if (Arrays.asList(checklist).contains(c.get(i))) {
					z[i][j] = Math.log(Math.pow(Math.E, Math.atan(Math.sin(x.get(j)))));
				}
				else {
					z[i][j] = Math.cos(Math.atan(0.5 * Math.sin(x.get(j))));
				}
			}
		}
		//4 пункт
		for (int row = 0; row < z.length; row++) {
			for (int col = 0; col < z[row].length; col++) {
				if (z[row][col] == 0) {
					System.out.print((int) z[row][col] + "\t");
				}
				else {
					System.out.printf("%.4f \t", z[row][col]);
				}

			}
			System.out.println();

		}
	}

}