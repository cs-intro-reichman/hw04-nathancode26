import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {

    }

    public static int findMissingInt(int[] array) {
        int sum_exepted = 0;
        int sum_actual = 0;
        int n = array.length;
        for (int i = 1; i <= n; sum_exepted += i, i++) ;
        for (int num : array) {
            sum_actual += num;
        }
        return sum_exepted - sum_actual;
    }


    public static int secondMaxValue(int[] array) {
        if (array.length == 1) {
            return array[0];
        }
        int max_prev = array[0];
        int max_next = array[1];
        for (int i = 0; i < array.length; i++) {
            if (max_next <= array[i]) {
                max_prev = max_next;
                max_next = array[i];
            } else if (max_prev < array[i] && max_next > array[i]) {
                max_prev = array[i];
            }
        }
        // Write your code here:
        return max_prev;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        boolean bool = true;

        if (array1.length >= array2.length) {
            for (int i = 0; i < array1.length; i++) {
                bool = false;
                for (int num : array2) {
                    if (array1[i] == num) {
                        bool = true;
                        break;
                    }
                }
                if (!bool) {
                    // Si l'élément de array2 n'est pas trouvé dans array1, retourne false
                    return false;
                }
            }
        } else {
            for (int i = 0; i < array2.length; i++) {
                bool = false;
                for (int num : array1) {
                    if (array2[i] == num) {
                        bool = true;
                        break;
                    }
                }
                if (!bool) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean isSorted(int[] array) {
        if (array[0] >= array[array.length - 1]) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    return false;
                }

            }
        } else {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
