/*
Problem: Remove duplicates from a sorted array

Approach:
- Use two-pointer technique
- Assume the first element is unique and store its index in pointer i
- Traverse the array using pointer j
- If arr[j] is different from arr[i], increment i and copy arr[j] to arr[i]
- After traversal, elements from index 0 to i are unique

Time Complexity: O(n)
→ We traverse the array once

Space Complexity: O(1)
→ No extra space is used (in-place operation)
*/

package DSA.com;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 4};
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
