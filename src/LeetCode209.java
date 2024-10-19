


public class LeetCode209 {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int sum=nums[0];
        int minlen=Integer.MAX_VALUE;
        while(l<=r){
            if(sum<target){
                r++;
                if(r==nums.length){
                    break;
                }
                sum+=nums[r];
            }else if(sum>=target){
                minlen=Math.min(minlen,r-l+1);
                sum-=nums[l];
                l++;
            }
        }

        return minlen==Integer.MAX_VALUE? 0:minlen;
    }

    public static void main(String[] args) throws Exception {
        int[] input={2,3,1,2,4,3};
        LeetCode209 leetcode=new LeetCode209();
        leetcode.minSubArrayLen(7, input);
        
    }
}


