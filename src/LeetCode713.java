

public class LeetCode713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len=nums.length;
        int l=0;
        int r=0;
        int multi=1;
        int res=0;
        while(r<len){
            multi*=nums[r];
            while(multi>=k && l<=r){
                multi/=nums[l];
                l++;
            }
            res+=(r-l+1);
            r++;
        }
        return res;
        
    }
    public static void main(String[] args) throws Exception {
        // int[] input={2,7,11,15};
        // LeetCode713 leetcode=new LeetCode713();
     
        
        
        
    }
    
   
}


