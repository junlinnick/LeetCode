
public class Solution605 {
	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
	     
	        int sum = 0;
	        /*int len = flowerbed.length;
	        int[]temp = new int[len+2];
	        for(int i = 0; i < len+2;i++){
	        	if(i == 0 || i == len+1){
	        		temp[i] = -1;
	        	}
	        	else{
	        		temp[i] = flowerbed[i-1];
	        	}
	        }
	        for(int i = 0; i < temp.length;i++){
	          if(temp[i] == 1){
                 if(temp[i-1]!=1){
                	 temp[i-1] = -1;
                 }
                 if(temp[i+1]!=1){
                	 temp[i+1] = -1;
                 }
	          }
	        }
	         for(int i = 0; i < temp.length;i++){
	            if(temp[i] == 0){ 
	            	sum++;
	            	}
	         }
	       */
	        if(flowerbed == null || flowerbed.length == 0){
	            return false;
	        }
	         if(flowerbed.length == 1){
	            if( n == 0){
	                return true;
	            }
	             else if(flowerbed[0] == 0&&n == 1){
	                 return true;
	             }
	             else{
	                 return false;
	             }
	        }
	        for(int i = 0; i < flowerbed.length;i++){
	            if(flowerbed[i] == 1){
	                continue;
	            }
	            else{
	                int index = 1;
	                int start = i;
	                i++;
	                while(i < flowerbed.length&&flowerbed[i] == 0 ){
	                  
	                    if(flowerbed[i] == 0){
	                        index++;
	                    }
	                    i++;
	                }
	                int end = i;
	                if(start == 0){
	                   index++;
	                }
	                if(end-1 == flowerbed.length-1){
	                	index++;
	                }
	                sum+=(index-1) / 2;
	                
	            }
	        }
	        return (sum >= n);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={0,0,0};
		boolean result = canPlaceFlowers(nums,2);
		System.out.print(result);

	}

}
