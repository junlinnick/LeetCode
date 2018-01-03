import java.util.ArrayList;
import java.util.List;

public class Solution282 {
    public static List<String> addOperators(String num, int target) {
       List<String> result =  new ArrayList<String>();
       if(num == null || num.length() == 0){
    	   return result;
       }
       dfs(result,num,target,"",0,0);
       return result;
    }
    private static void dfs(List<String> result, String num, int target, String path, 
    		long currRes, long preNum) {
         if(currRes == target && num.length() == 0){
        	 String cand = new String(path);
        	 result.add(cand);
        	 return;
         }		
         for(int i = 1;i <= num.length();i++){
        	 String currStr = num.substring(0,i);
        	 if(currStr.length() > 1 && currStr.charAt(0) == '0'){
        		 return;
        	 }
        	 long currNum = Long.parseLong(currStr);
        	 String next = num.substring(i);
        	 if(path.length() != 0){
        		 dfs(result,next,target,path+'*'+currNum,(currRes - preNum)+currNum * preNum,
        				 currNum * preNum);
        		 dfs(result,next,target,path+'+'+currNum,currRes + currNum,  currNum);
        		 dfs(result,next,target,path+'-'+currNum,currRes - currNum, -currNum );
        		 
        	 }
        	 else{
        		 dfs(result,next,target,currStr,currNum,currNum);
        	 }
         }
	}
	public static void main(String[] args){
    	String num = "105";
    	int target  = 5;
    	List<String> result = addOperators(num,target);
    	for(String i : result){
    		System.out.println(i);
    	}
    	 
    	 
    }
}
