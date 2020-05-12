package part2;

import java.util.Scanner;

public class Pra11 {
	
	public class YMD{
	int y; 
	int m; 
	int d; 
	
	YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}

	int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
	};

	int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	
	YMD after(int n) {
		YMD temp = new YMD(this.y, this.m, this.d);
		temp.d += n;

		while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
			temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
			if (++temp.m > 12) {
				temp.y++;
				temp.m = 1;
			}
		}
		return temp;
	}

	YMD before(int n) {
		YMD temp = new YMD(this.y, this.m, this.d);

		temp.d -= n;

		while (temp.d < 1) {
			if (--temp.m < 1) {
				temp.y--;
				temp.m = 12;
			}
			temp.d += mdays[isLeap(temp.y)][temp.m - 1];
		}
		return temp;
	}
	}
	
	
	public void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	
		int y = scan.nextInt();
	
		int m = scan.nextInt();
		
		int d = scan.nextInt();
		YMD date = new YMD(y,m,d);

		int n = scan.nextInt();

		YMD d1 = date.after(n);

		YMD d2 = date.before(n);
		
	}
	
}
