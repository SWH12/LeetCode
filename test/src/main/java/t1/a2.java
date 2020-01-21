package t1;

public class a2 {
    public int[] twoSum(int[] nums, int target) {
        int [] indexList = new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (nums[i] + nums[j] == target  && i!=j){
                    indexList[0]=i;
                    indexList[1]=j;
                    return indexList;
                }
            }
        }
        return indexList;
    }

    public static void main(String[] args){
        a2 a =new a2();
        int[] nums = new int[]{4, 7, 11, 15};
        int target = 8;
        int[] out = a.twoSum(nums,target);
        System.out.println(out[0]);
        System.out.println(out[1]);
    }
}