package part2;

public class Pra8 {
	
	static int dayOfYear(int y, int m, int d) {
		while (--m != 0)
			d += mdays[isLeap(y)][m - 1];
		return (d);
	}
}
