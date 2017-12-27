
public class Solution477 {
    public static int totalHammingDistance(int[] nums) {
        int total = 0, n = nums.length;
        for (int j=0;j<32;j++) {
            int bitCount = 0;
            for (int i=0;i<n;i++) {
            	int k1 = nums[i] >> j;
            	int k2 = k1 & 1;
                bitCount +=k2;
            }
            total += bitCount*(n - bitCount);
        }
        return total;
	}
	public static void main(String args[]){
    	int []nums = {4,14,2};
    	int result = totalHammingDistance(nums);
    	System.out.print(result);
    	
    }
}
