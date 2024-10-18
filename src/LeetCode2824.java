import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
class LeetCode2824 {
    public int countPairs(List<Integer> nums, int target) {
        int length=nums.size();
        Collections.sort(nums);
        int l=0; int r=length-1;
        int count=0;
        while(l<r){
            if(nums.get(l)+nums.get(r)>=target){
                r--;
            }
            else{
                count+=(r-l);
                l++;

            }
        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        //int[] input={-6,2,5,-2,-7,-1,3};
        List<Integer> input=new ArrayList<Integer>();
        input.add(-1);
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(1);

        LeetCode2824 leetcode=new LeetCode2824();
        leetcode.countPairs(input,2);
        
        
    }
}