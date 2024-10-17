
public class LeetCode198 {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        dp[0]=nums[0];dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-2]+nums[i], dp[i-1]);
        }
        return Math.max(dp[nums.length-1], dp[nums.length-2]);
    }



    public static void main(String[] args) throws Exception {
        int[]input={2,7,9,3,1};
        LeetCode198 leetcode=new LeetCode198();
        leetcode.rob(input);

        
        
    }
}


