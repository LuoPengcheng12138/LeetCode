

//接雨水
public class LeetCode40 {
 
    // public int trap(int[] height) {
    //    int[] leftmax=new int[height.length];
    //    int[] rightmax=new int[height.length];
    //    leftmax[0]=0;
    //    for(int i=1;i<height.length;i++){
    //         leftmax[i]=Math.max(leftmax[i-1], height[i-1]);
    //    }
    //    rightmax[height.length-1]=0;
    //    for(int i=height.length-2;i>=0;i--){
    //         rightmax[i]=Math.max(rightmax[i+1], height[i+1]);
    //    }
    //    int capcity=0;
    //    for(int i=0;i<height.length;i++){
    //         if(leftmax[i]>height[i]&&rightmax[i]>height[i]){
    //             capcity+=Math.min(leftmax[i], rightmax[i])-height[i];
    //         }
    //     }
    //     return capcity;
    //}

    public int trap(int[] height) {
        int[] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];
        leftmax[0]=0;
        for(int i=1;i<height.length;i++){
             leftmax[i]=Math.max(leftmax[i-1], height[i-1]);
        }
        rightmax[height.length-1]=0;
        for(int i=height.length-2;i>=0;i--){
             rightmax[i]=Math.max(rightmax[i+1], height[i+1]);
        }
        int capcity=0;
        for(int i=0;i<height.length;i++){
             if(leftmax[i]>height[i]&&rightmax[i]>height[i]){
                 capcity+=Math.min(leftmax[i], rightmax[i])-height[i];
             }
         }
         return capcity;
 
     }
    public static void main(String[] args) throws Exception {
        int[] input={0,1,0,2,1,0,1,3,2,1,2,1};
        LeetCode40 leetcode=new LeetCode40();
        leetcode.trap(input);
        
    }
}


