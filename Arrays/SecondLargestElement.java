/*
 Problem: Find the Second Largest Element in an Array

 Description:
 This program finds the second largest element in an integer array
 without sorting it. It scans the array once and keeps track of
 the largest and second largest elements.

 Time Complexity: O(n)
 Space Complexity: O(1)
*/

public class SlargestArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        int largest = arr[0];
        int slargest = -1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }

        System.out.println("Second largest element of the array is: " + slargest);
    }
}
