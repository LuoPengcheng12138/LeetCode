import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap= new HashMap<Integer,Integer>();
        hashMap.put(nums[0], 0);
        for(int i=1;i<nums.length;i++){
            if (hashMap.get(target-nums[i])!=null){
                int[] res ={hashMap.get(target-nums[i]),i};
                return res;
            }else{
                hashMap.put(nums[i],i );
            }
        }
        return null;

    }
}