package dsa.com;

/*
===========================================================
Problem: Left Rotate Array by One Place
===========================================================

Problem Statement:
Given an array of integers, rotate the array to the left by
one position. The first element should move to the end,
and all other elements should shift one position to the left.

Example:
Input:  [1, 2, 3, 4, 5]
Output: [2, 3, 4, 5, 1]

-----------------------------------------------------------
Approach:
1. Store the first element of the array in a temporary variable.
2. Shift all remaining elements one position to the left.
3. Place the stored first element at the end of the array.
4. Print the updated array.

-----------------------------------------------------------
Time Complexity:
O(n) → We traverse the array once.

Space Complexity:
O(1) → No extra space is used (in-place rotation).
===========================================================
*/

public class LeftRotate {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Store first element
        int temp = arr[0];

        // Shift elements to the left
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        // Place first element at the end
        arr[n - 1] = temp;

        // Print rotated array
        System.out.print("Array after left rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
