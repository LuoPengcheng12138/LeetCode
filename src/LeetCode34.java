
class LeetCode34 {
    // public int[] searchRange(int[] nums, int target) {
    //     if(nums.length==0){
    //         return new int[]{-1,-1};
    //     }
    //     int left=0;
    //     int right=nums.length-1;
    //     int flag=0;
    //     int mid=0;
    //     while(left<=right){
    //         mid=(left+right)/2;
    //         if (nums[mid]==target){
    //             flag=1;
    //             break;
    //         }else if(nums[mid]>target){
    //             right=mid-1;
    //         }else{
    //             left=mid+1;
    //         }
    //     }
    //     if(flag==0){
    //         int[] res=new int[]{-1,-1};
    //         return res;
    //     }
    //     int i=mid;
    //     int j=mid;
    //     while(i>=0 && nums[i]==target){
    //         i--;
    //     }
    //     while(j<nums.length && nums[j]==target){
    //         j++;
    //     }
    //     return new int[]{++i,--j}; 
    // }
    public int[] searchRange(int[] nums, int target) {
        int start = lowerBound(nums, target); // 选择其中一种写法即可
        if (start == nums.length || nums[start] != target) {
            return new int[]{-1, -1}; // nums 中没有 target
        }
        // 如果 start 存在，那么 end 必定存在
        int end = lowerBound(nums, target + 1) - 1;
        return new int[]{start, end};
    }

    // lowerBound 返回最小的满足 nums[i] >= target 的 i
    // 如果数组为空，或者所有数都 < target，则返回 nums.length
    // 要求 nums 是非递减的，即 nums[i] <= nums[i + 1]

    // 闭区间写法
    private int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1; // 闭区间 [left, right]
        while (left <= right) { // 区间不为空
            // 循环不变量：
            // nums[left-1] < target
            // nums[right+1] >= target
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1; // 范围缩小到 [mid+1, right]
            } else {
                right = mid - 1; // 范围缩小到 [left, mid-1]
            }
        }
        return left;
    }

        public static void main(String[] args) throws Exception {
        int[] input={1,2,3};
        LeetCode34 leetcode=new LeetCode34();
        leetcode.searchRange(input,2);
        
        
    }
}