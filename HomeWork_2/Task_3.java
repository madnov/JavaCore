package HomeWork_2;

//3. Написать функцию, возвращающую истину, если в переданном массиве есть два
//соседних элемента, с нулевым значением.

public class Task_3 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 6, 3, 8};
        System.out.println(hasZeroNeighbors(arr));
    }

    public static boolean hasZeroNeighbors(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
