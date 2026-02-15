/*
Problem: Check if an given array is sorted in ascending order

Approach:
- Assume the array is sorted
- Traverse the array from left to right
- Compare each element with the previous element
- If any element is smaller than the previous one,
  mark the array as not sorted and stop checking

Time Complexity: O(n)
→ We traverse the array once

Space Complexity: O(1)
→ No extra space is used
*/

public class SortedArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 3};
        boolean isSorted = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break; // stop early if unsorted
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
