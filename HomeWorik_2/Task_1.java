//1. Написать метод, возвращающий количество чётных элементов массива.
//
//countEvens([2, 1, 2, 3, 4]) → 3
//countEvens([2, 2, 0]) → 3
//countEvens([1, 3, 5]) → 0

public class Task_1 {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 2, 3, 4};
        System.out.println(countEvents(nums));
    }

    public static int countEvents(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
