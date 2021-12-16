public class secondMaxIntArray {
	public static void main(String[] args) {
		int a[] = { 3, 2, 6, 7, 9, 1, 8 };
		int fmax = 0;
		int smax = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > fmax) {
				smax = fmax;
				fmax = a[i];
			} else if (a[i] > smax) {
				smax = a[i];
			}
		}
		System.out.println("Second max number in Array = "+ smax);
	}

}
