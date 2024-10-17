
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
    //不能在两数之和之和的基础上写 调用两数之和函数，因为两数之和返回的不是答案的全集
    // public int[] twoSum(int[] nums, int target) {
    //     HashMap<Integer,Integer> hashMap= new HashMap<Integer,Integer>();
    //     hashMap.put(nums[0], 0);
    //     for(int i=1;i<nums.length;i++){
    //         if (hashMap.get(target-nums[i])!=null){
    //             int[] res ={hashMap.get(target-nums[i]),i};
    //             return res;
    //         }else{
    //             hashMap.put(nums[i],i );
    //         }
    //     }
    //     return null;

    // }
    // public List<List<Integer>> threeSum(int[] nums) {
    //     List<List<Integer>> res=new ArrayList<>();
    //     HashMap<Integer,Integer> hashMap= new HashMap<Integer,Integer>();
    //     hashMap.put(nums[0], 0);
    //     hashMap.put(nums[1], 1);
    //     for(int i=2;i<nums.length;i++){
    //         final int currentIndex = i; 
    //         Integer[] temp=hashMap.keySet().toArray(new Integer[hashMap.size()]);
    //         int op[]=Arrays.stream(temp).mapToInt(Integer::valueOf).toArray();
    //         if (twoSum(op, -nums[i])!=null){
    //             int [] receive=twoSum(op, -nums[i]);
    //             List<Integer> oneof=new ArrayList<>(){{
    //                 add(nums[receive[0]]);
    //                 add(nums[receive[1]]);
    //                 add(nums[currentIndex]);
    //             }
    //             };
    //             res.add(oneof);   
    //             hashMap.put(nums[i],i ); 
    //         }else{
    //             hashMap.put(nums[i],i );
    //         }
    //     }
    //     return null;
    // }


    // //还是不行 时间超时 O(N^3)
    // public List<List<Integer>> threeSum(int[] nums) {
    //     Arrays.sort(nums);
    //     List<List<Integer>> res=new ArrayList<>();
    //     HashMap<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
    //     for(int i=0;i<nums.length;i++){
    //         if(hashmap.containsKey(nums[i])){
    //             int num = hashmap.get(nums[i]);
	// 			hashmap.put(nums[i], num+1);
    //             continue;
    //         }
    //         hashmap.put(nums[i], 1);
    //     }

    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]>0){break;}
    //         for(int j=nums.length-1;j>=0;j--){
    //             if(nums[j]<0){break;}
    //             if(i==j){break;}
    //             int num1 = hashmap.get(nums[i]);
    //             int num2 = hashmap.get(nums[j]);
    //             if(nums[i]==nums[j]){
    //                 hashmap.put(nums[i], num1-2);
    //             }
    //             else{
    //                 hashmap.put(nums[i], num1-1);
    //                 hashmap.put(nums[j], num2-1);
    //             }

    //             if(hashmap.containsKey(-nums[i]-nums[j]) && hashmap.get(-nums[i]-nums[j])!=0 ){
    //                     List<Integer> temp=new ArrayList<>();
    //                     temp.add(nums[i]);
    //                     temp.add(-nums[i]-nums[j]);
    //                     temp.add(nums[j]);
    //                     Collections.sort (temp);
    //                     if(!res.contains(temp)){
    //                         res.add(temp);
    //                     }
                        
    //             }
    //             hashmap.put(nums[i], num1);
    //             hashmap.put(nums[j], num2);
    //             // for(int k=j-1;k>i;k--){
    //             //     if (nums[i]+nums[j]+nums[k]==0){
    //             //         List<Integer> temp=new ArrayList<>();
    //             //         temp.add(nums[i]);
    //             //         temp.add(nums[k]);
    //             //         temp.add(nums[j]);
    //             //         if(res.contains(temp)){
    //             //             continue;
    //             //         }
    //             //         res.add(temp);
    //             //     }
    //             // }
    //         }  
    //     }
    //     return res;
    // }



    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int third=nums.length-1;

            for(int second=i+1;second<third;second++){
                if (second > i + 1 && nums[second] == nums[second - 1]) {
                        continue;
                    }
                while(second < third && nums[i]+nums[second]+nums[third]>0){
                    third--;
                }
                if (second == third) {
                    break;
                }
                if(nums[i]+nums[second]+nums[third]==0){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[second]);
                    temp.add(nums[third]);
                    if(res.contains(temp)){
                        continue;
                    }
                    res.add(temp);
                }
            }
            
        }

        return res;
    }


    public static void main(String[] args) throws Exception {
        int[] input={1,2,-2,-1};
        LeetCode15 leetcode=new LeetCode15();
        leetcode.threeSum(input);
        
        
    }
    
   
}


