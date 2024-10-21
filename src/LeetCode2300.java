import java.util.Arrays;

class LeetCode2300 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            long t=(success+spells[i]-1)/spells[i];
            int pos=binaryserach(potions,t);
            res[i]=potions.length-pos;
        }
        return res;

    }


    public int binaryserach(int[] nums,long target){
        int l=0;
        int r=nums.length-1;
        int mid=0;
        while(l<=r){
            mid=l+(r-l)/2;
            if(nums[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return l;
    }
       

    public static void main(String[] args) throws Exception {
        int[]spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        LeetCode2300 leetcode=new LeetCode2300();
        leetcode.successfulPairs(spells, potions, 7);
       
        
        
    }
}