import java.util.ArrayList;

public class SumArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(55);
        nums.add(45);
        nums.add(60);
        nums.add(70);

        System.out.println(addArrayList(nums));
    }

    public static int addArrayList(ArrayList<Integer> nums){
        int total = 0;
        for (Integer num: nums) {
            total += num;
        }
        return total;
    }
}
