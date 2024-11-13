
class LeetCode162{
   
    public int findPeakElement(int[] nums) {
        int length=nums.length;
        int left=0;int right=length-1;
        if(length==1){
            return 0;
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid==0||mid==length-1){
                if(mid==0&&nums[mid]>nums[mid+1]){
                    return mid;
                }else if(mid==0&&nums[mid]<nums[mid+1]){
                    left=mid+1;
                }else if(mid==length-1&&nums[mid]>nums[mid-1]){
                    return mid;
                }else if(mid==length-1&&nums[mid]<nums[mid-1]){
                    right=mid-1;
                }
            }else{
                if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                    return mid;
                }else if(nums[mid]>nums[mid-1]&&nums[mid]<nums[mid+1]){
                    left=mid+1;
                }else if(nums[mid]<nums[mid-1]&&nums[mid]>nums[mid+1]){
                    right=mid-1;
                }else{
                    right=mid-1;
                    //left=mid+1;
                }
            }
            
        }
        return left;
        
        
    }
    

 
    
    public static void main(String[] args) throws Exception {
        int[] input={1,2};
        LeetCode162 leetcode=new LeetCode162();
        leetcode.findPeakElement(input);
        System.out.println(leetcode.findPeakElement(input));
        
    }
}