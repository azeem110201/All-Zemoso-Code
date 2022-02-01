public class Arrays {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.println("Below is the enhanced version of for-loop");
        //enhanced for-loop
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}
