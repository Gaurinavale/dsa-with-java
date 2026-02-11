/*
Problem: Find the largest element in an array

Approach:
- Assume the first element is the largest
- Compare it with all other elements
- Update max if a bigger element is found

Time Complexity: O(n)
→ We traverse the array once

Space Complexity: O(1)
→ No extra space is used
*/

public class LargestElement {
    public static void main(String[] args) {

        int[] arr = {3, 7, 2, 9, 5};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element: " + max);
    }
}
