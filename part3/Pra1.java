package part3;

public class Pra1 {

	static int seqSearchSen(int[] a, int n, int key) {
		int i;

		a[n] = key; // 보초를 추가

		for (i = 0; a[i] != key; i++);
		
		return i == n ? -1 : i;
	}

	

}
