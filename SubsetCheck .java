import java.util.HashSet;
import java.util.Set;

public class SubsetCheck {
    public static boolean isSubset(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : array1) {
            set1.add(num);
        }

        for (int num : array2) {
            set2.add(num);
        }

        return set2.containsAll(set1);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4, 5};

        if (isSubset(array1, array2)) {
            System.out.println("Array1 is a subset of Array2");
        } else {
            System.out.println("Array1 is not a subset of Array2");
        }
    }
}
