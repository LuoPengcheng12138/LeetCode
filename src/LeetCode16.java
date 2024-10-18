
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode16 {
//cmpmin=Math.min(cmpmin, nums[i]+nums[l]+nums[r]);
//r--;      先比较 再加减r/l

// 用if - else 语句 不要多个 if 嵌套
    public int threeSumClosest(int[] nums, int target) {
        int length=nums.length;
        Arrays.sort(nums);
        int cmpmax=Integer.MIN_VALUE;
        int cmpmin=Integer.MAX_VALUE;
        for(int i=0;i<length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=length-1;
            while(l<r){
                if (nums[i]+nums[l]+nums[r]>target){           
                    cmpmin=Math.min(cmpmin, nums[i]+nums[l]+nums[r]);
                    r--;
                }
                else if(nums[i]+nums[l]+nums[r]==target){
                    return target;
                }
                else{
                    cmpmax=Math.max(cmpmax, nums[i]+nums[l]+nums[r]);
                    l++;
                }
            }
        }
        if (cmpmin==Integer.MAX_VALUE){ //input={0,1,2} target=0
            return cmpmax;
        }
        if (cmpmax==Integer.MIN_VALUE){
            return cmpmin;
        }
        return cmpmin-target > target-cmpmax? cmpmax:cmpmin; 
    }
    public static void main(String[] args) throws Exception {
        int[] input={0,1,2};
        LeetCode16 leetcode=new LeetCode16();
        leetcode.threeSumClosest(input,0);
        
        
    }
    
   
}


