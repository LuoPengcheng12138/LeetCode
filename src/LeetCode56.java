import java.util.Arrays;
import java.util.Comparator;

public class LeetCode56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>() {
            @Override
            public int compare(int[]a,int[]b){
                return Integer.compare(a[0], b[0]);
            }
        });
        
        int curstart=intervals[0][0];
        int curend=intervals[0][1];
        int update=0;
        for(int i=0;i<intervals.length;i++){
            if (i+1<intervals.length && curend>=intervals[i+1][0]){
                
                curend=Math.max(curend,intervals[i+1][1]);

            }else{
                intervals[update][0]=curstart;
                intervals[update][1]=curend;
                update++;   
                if(i+1<intervals.length){
                    curstart= intervals[i+1][0];
                    curend=intervals[i+1][1];
                }
            }
        }
        int[][] result = new int[update][];
        for (int i = 0; i < update; i++) {
            result[i] = intervals[i];
            System.out.print(result[i][0]+"-");
            System.out.println(result[i][1]);
        }
        
        return result;


    }

    public static void main(String[] args) throws Exception {
        int[][] input={{15,18},{1,3},{2,6},{8,10}};
        LeetCode56 leetcode=new LeetCode56();
        leetcode.merge(input);
        
    }
}


