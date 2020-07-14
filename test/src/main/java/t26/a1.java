package t26;

public class a1 {
    public int removeDuplicates(int[] nums) {
        int len = 0;
        if (nums.length == 0){return len;}
        for (int i=1;i<nums.length;i++){
            if(nums[len] != nums[i]){
                len++;
                nums[len] = nums[i];
            }
        }
        return len+1;
    }

    public static void main(String[] args) {
        a1 a = new a1();
        int [] nums = {0,1,1,2};
        System.out.println(a.removeDuplicates(nums));
    }

}
