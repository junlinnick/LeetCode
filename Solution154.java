
public class Solution154 {

	    public static int findMin(int[] nums) {
	                if(nums == null || nums.length == 0){
	            return -1;
	        }
	        int start = 0;
	        int end = nums.length -1;
	        while (start+1 < end){
	            while(start<nums.length-1){
	                if(nums[start] == nums[start+1]){
	                    start++;
	                }
	                else{
	                	break;
	                }
	            }
	               while(end > start && end > 0){
	                 if(nums[end] == nums[end-1] || nums[end] == nums[start]){
	                    end--;
	                }
	                 else{
		                	break;
		                }
	                }
	            int mid = start + (end - start) / 2;
	            if(nums[end] > nums[mid]){
	                end = mid;
	            }
	            else{
	                start = mid;
	            }
	        }
	        if(nums[start] <= nums[end]){
	            return nums[start];
	        }
	        else{
	            return nums[end];
	        }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,2,1};
		int result = findMin(nums);
		System.out.println(result);

	}

}
