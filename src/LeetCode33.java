
class LeetCode33{
   
    public int search(int[] nums, int target) {
        int len=nums.length;
        int left=0;int right=len-1;
        if(len==1){return nums[0]==target?0:-1;}

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>=nums[0]){
                if(target>=nums[0]&&target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                if(target>nums[mid]&&target<=nums[len-1]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }

        }
        return -1;
        
    }
    


 
    
    public static void main(String[] args) throws Exception {
        int[] input={3,1};
        LeetCode33 leetcode=new LeetCode33();
        leetcode.search(input,1);
        System.out.println(leetcode.search(input,0));
        
    }
}