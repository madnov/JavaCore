package HomeWork_2.src.main.java;

public class Tasks {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 4};
        System.out.println(countEvents(arr));
        System.out.println(getDifference(arr));
        System.out.println(hasZeroNeighbors(arr));
    }

    public static int countEvents(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int getDifference(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
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
