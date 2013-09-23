package arrays;


public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ret=0;
        while(left <right){
        	int min=height[left]>height[right]?height[right]:height[left];
        	if(min*(right-left)>ret)
        		ret=min*(right-left);
        	if(height[left]>height[right]){
        		int cur=right;
        		while(height[cur]>=height[right]&&right>left)
        			right--;
        	}
        	else{
        		int cur=left;
        		while(height[cur]>=height[left]&&right>left)
        			left++;	        		
        	}
        }
        return ret;
    }
}
