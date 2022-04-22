import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray() {
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void changeArray() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            } else {
                arr2[i] = arr2[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void fillDiagonal() {
        int[][] arr3 = new int[9][9];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if (i == j || i == arr3.length - j - 1) {
                    arr3[i][j] = 1;
                } else {
                    arr3[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(arr3[i]));
        }
    }
}

