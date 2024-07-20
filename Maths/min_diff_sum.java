/*
40. Minimum Difference Sum :   
Given an array of n integers, rearrange them so that sum of the absolute differences of all elements is minimized. Then, compute aum of those absolute differences.

Example
n=5
arr = [1, 3, 3, 2, 4]
If the list is rearranged as arr' = [1, 2, 3, 3, 4], the absolute differences are [1-2]= 1, [2-3]=1, [3-3]=0, [3-4]=-1. The sum of those differences 1+1+0+1=3.

Function Description
Complete the function minDiff in the editor below.
minDiff has the following parameter
arr: an integer array
Returns:
int: the sum of the absolute differences of adjacent elements


Sample Input For Custom Testing
STDIN
arr[] size n = 5
5
1
3
7
3


Sample Output
6

Explanation
arr = [5, 1, 3, 7, 3]
if arr is represented as arr=[1,3,3,5,7] the differences are minimized
the final answer is [1-3]+[3-3]+[3-5]+[5-7]=6
*/
