
public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int[] result1 = s.intersect(new int[] {1, 2, 2, 1},  new int[] {2, 2});
		int[] result2 = s.intersect(new int[] {4, 9, 5},  new int[] {9, 4, 9, 8, 4});
	
		print(result1);
		print(result2);
	}

	private static void print(int[] result) {
		int len = result.length;
		
		for(int i=0; i<len; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}
}
