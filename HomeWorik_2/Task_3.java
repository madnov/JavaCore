public class Task_3 {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 3, 6, 3, 8 };
        System.out.println(hasZeroNeighbors(nums));
    }

    public static boolean hasZeroNeighbors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
