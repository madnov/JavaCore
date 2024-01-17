//2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.

public class Task_2 {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 2, 7, 4 };
        System.out.println(getDifference(nums));
    }

    public static int getDifference(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max - min;
    }
}
