import java.util.HashMap;

//接雨水
public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        if (len==0){
            return 0;
        }
        HashMap <Character,Integer> map=new HashMap<Character,Integer>();
        int l=0;
        int r=0;
        int maxlen=Integer.MIN_VALUE;
        while(r<len){
            while(map.containsKey(s.charAt(r))){
                map.remove(s.charAt(l));
                l++;
            }
            map.put(s.charAt(r), 1);
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
        
    }

  
    public static void main(String[] args) throws Exception {
        String a="pwwek";
        LeetCode3 leetcode=new LeetCode3();
        leetcode.lengthOfLongestSubstring(a);
        
    }
}


