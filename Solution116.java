import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution116 {
    public static void connect(TreeLinkNode root) {
        if(root == null){
            return;
        }
     
        Queue<TreeLinkNode> queue1 = new LinkedList<TreeLinkNode>();
        Queue<TreeLinkNode> queue2 = new LinkedList<TreeLinkNode>();
        queue1.offer(root);
      
        while(!queue1.isEmpty()){
            while(!queue1.isEmpty())
            {
                TreeLinkNode curr = queue1.poll();
                queue2.offer(curr);
                if(queue1.isEmpty()){
                	curr.next=null;
                }
                else{
                TreeLinkNode temp = queue1.peek();
                curr.next = temp;
                }
            }
           while(!queue2.isEmpty()){
            TreeLinkNode curr2 = queue2.poll();
            if(curr2.left == null){
            	continue;
            }
            else{queue1.offer(curr2.left);
            queue1.offer(curr2.right);}
           }
            
        }

    }
    private static TreeLinkNode buildTreeLinkNode(int[] nums){
    	List<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
    	for(int i=0;i<nums.length;i++){
    		TreeLinkNode curr = new TreeLinkNode(nums[i]);
    		list.add(curr);
    	}
    	for(int i = 0; i*2+2<list.size();i++){
    		list.get(i).left = list.get(i*2+1);
    		list.get(i).right = list.get(i*2+2);
    	}
    	return list.get(0);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums={1,2,3,4,5,6,7};
       TreeLinkNode root = buildTreeLinkNode(nums);
       connect(root);
	}

}
