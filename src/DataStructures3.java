
public class DataStructures3 {// THE INSERTION SORT ALGORITHM
	
	public static int[] insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {// we are checking that item i is greater or lesser than all previous cards
			int temp = a[i];
			for (int j = i-1; j > -1; j--) {// we loop through all previous cards to i
				if (temp < a[j]) {// check if card i is less than the previous ones and if so, place the greater card one space in front and put card i in its place
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}// this approach will work because on each loop the array will be ordered
		return a;
	}
	
	// this algorithm does at most 3*(1 + 2 + 3 + ... + n-3 + n-2 + n-1) + n-1 ~ (3/2)*(n^2) + n-1 operations which is O(n^2)

	public static void main(String[] args) {
		System.out.println("DEMONSTRATING SELECTION SORT:");
		int[] a = { 21, 3, 41, 6, 12, 8, 9 };
		int[] b = { 2, 1, 1, 6, 2, 88, 9 };
		int[] c = { 210, 30, 410, 600, 102, 8, 5 };
		int[] d = { 2, 1, -3, -6, 12, 11, 9 };
		int[] e = { 9, 0 };
		int[] f = { 0 };
		int[][] G = {a, b, c, d, e, f};
		for (int k = 0; k < G.length; k++) {
			for (int l = 0; l < G[k].length; l++) {
				System.out.println(insertionSort(G[k])[l]);
			}
			System.out.println("Finished with array " + k);
		}
	}

}
