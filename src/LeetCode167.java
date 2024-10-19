
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode167 {
    public int[] twoSum(int[] numbers, int target) {
        int length=numbers.length;
        int l=0;
        int r=length-1;
        while(l<r){
            if(l>0&&numbers[l]==numbers[l-1]){
                l++;
                continue;
            }
            if(numbers[l]+numbers[r]<target){
                l++;
            }
            else if(numbers[l]+numbers[r]==target){
                int[] res=new int[2];
                res[0]=l+1;
                res[1]=r+1;
                return res;
            }
            else{
                r--;
            }
        }
        return null;
    }
    public static void main(String[] args) throws Exception {
        int[] input={2,7,11,15};
        LeetCode167 leetcode=new LeetCode167();
        leetcode.twoSum(input, 9);
        
        
        
    }
    
   
}


