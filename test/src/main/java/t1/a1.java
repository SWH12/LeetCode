package t1;

import java.util.HashMap;
import java.util.Map;

public class a1 {

    //用hashmap,时间复杂度o（n),空间o(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int con=0;
        for(int i=0;i<nums.length;i++){
            con=target-nums[i];
            if(map.containsKey(con)){
                return new int[]{map.get(con),i};//当找到，直接返回
            }
            map.put(nums[i],i);//没找到，且数组没有遍历完，继续添加
        }
        return null;
    }

//    public int[] twoSum(int[] nums, int target) {
//        int [] ans = new int[2];
//        if(nums==null||nums.length<2)
//            return ans;
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for(int i = 0; i < nums.length; i++){
//            if(!map.containsKey(target-nums[i])){
//                map.put(nums[i],i);
//            }else{
//                ans = new int[]{map.get(target-nums[i]),i};
//                return ans;
//            }
//        }
//        return ans;
//    }

    public static void main(String[] args){
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        a1 a = new a1();
        System.out.print(a.twoSum(nums,target)[0]);
        System.out.print(a.twoSum(nums,target)[1]);
    }

}
