public class MoreArrayFun {
    public static void main(String[] args) {
        int[] nums = new int[10];

        for(int i = 0; i < nums.length; i++){
            nums[i] = i + 1;
        }
        //enhanced for-loop
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}
