import java.util.ArrayList;
import java.util.Arrays;

public class findDuplicates {
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        Arrays.sort(arr);  // Sort the array first

        // Iterate through the sorted array to find duplicates
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && !duplicates.contains(arr[i])) {
                duplicates.add(arr[i]);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 9, 3};
        ArrayList<Integer> duplicates = findDuplicates(arr);
        System.out.println("Duplicates: " + duplicates);
    }
}
