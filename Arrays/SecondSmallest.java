/*
Problem: Find the second smallest element in an array

Approach:
- Assume the first element is the smallest
- Keep another variable to track the second smallest
- Traverse the array and update both values when needed
- If a smaller element is found, shift smallest to second smallest
- Otherwise, update second smallest if the element lies between them

Time Complexity: O(n)
→ We traverse the array once

Space Complexity: O(1)
→ No extra space is used
*/

public class SecondSmallest {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }

            else if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second smallest element: " + secondSmallest);
    }
}
