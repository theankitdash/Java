/*
41. Count Duplicate Elements     
Given an integer array, numbers, count the number of elements that occur more than once.

Example
numbers = [1, 3, 3, 4, 4, 4]
There are two non-unique elements: 3 and 4.

Function Description
Complete the function countDuplicate in the editor below.
countDuplicate has the following parameter(s):
int numbers[n] an array of integers

Returns:
int: an integer that denotes the number of non-unique values in the numbers array

Constraints
3≤n≤1000
1 ≤ numbers[i]<1000, 0si<n

► Input Format Format for Custom Testing
✓ Sample Case 0
Sample Input
8   Size of the list

1
3
1
4
5
6
3
2

Sample Output
2
Explanation
The values 1 and 3 occur more than once therefore answer is 2.
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class count_duplicates_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = input.nextInt();
        System.out.println("Enter the elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each element
        for (int number : a) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        int duplicateCount = 0;

        // Count the number of elements that occur more than once
        for (int count : countMap.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }

        System.out.println("There are " + duplicateCount + " non-unique elements.");
        System.out.println("Duplicate elements: ");
        displayDuplicates(countMap);
    }

    public static void displayDuplicates(Map<Integer, Integer> countMap) {
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }
}
