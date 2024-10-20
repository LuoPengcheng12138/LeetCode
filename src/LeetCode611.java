import java.util.Arrays;

class LeetCode611 {
    public int triangleNumber(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int count=0;
        for(int k=2;k<len;k++){
            int i=0;
            int j=k-1;
            while(i<j){
                if(nums[i]+nums[j]>nums[k]){
                    //意味着
                    //nums[i+1]+nums[j]必大于nums[k]
                    //···
                    //nums[i+*]+nums[j]必大于nums[k]
                    count+=(j-i);
                    j--;
                }else{
                    //意味着
                    //nums[i]+nums[j-1]必大于nums[k]
                    //···
                    //nums[i]+nums[j-*]必大于nums[k]
                    //i不可能是形成最短边
                    i++;
                }
            }
        }
        return count;
       
    }

    public static void main(String[] args) throws Exception {
        int[] input={2,3,4,4};
        LeetCode611 leetcode=new LeetCode611();
        leetcode.triangleNumber(input);
        
        
    }
}