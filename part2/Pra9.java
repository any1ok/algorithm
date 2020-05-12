package part2;

public class Pra9 {
	static int leftDayOfYear(int y, int m, int d) {
		int days = mdays[isLeap(y)][d-1]-d;
		
		for (int i = m; i <= 11; i++) 
			days += mdays[isLeap(y)][i - 1];
		return days;
	}
}
