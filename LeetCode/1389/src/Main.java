
public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		int nums1[] = {0, 1, 2, 3, 4};
		int index1[] = {0, 1, 2, 2, 1};
		
		print(s.createTargetArray(nums1, index1));
		
		int nums2[] = {1,2,3,4,0};
		int index2[] = {0,1,2,3,0};
		
		print(s.createTargetArray(nums2, index2));
	}

	private static void print(int result[]) {
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}
}
