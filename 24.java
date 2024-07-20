/*
24. Allie has bought a new apple orchard. The orchard has a single file of trees, numbered from 1 to N.
Each tree has a certain number of ripe apples. 
Allie has a rule she wants to follow. She wants to pluck
an equal amount apples from each tree from which
she collect apples.

Allie can start collecting apples from any tree, but
once she starts collecting, she collects from every
consecutive tree until she reaches the last tree she
wants to collect from. Find the maximum number of
apples she can fetch from the orchard.

Input format:
First line represents - N. number of trees

Second line represents an array of N elements
separated by space denoting the number of ripe
apples in each tree of the orchard

Output Format:
An integer output representing the number of
apples that allie can fetch.

Example 1:
Input:
3
80 48 82
Output:
144

Explanation: 
since allie is supposed to choose the same number of apples from each consecutive tree, 
she plucks 48 apples from each tree.
Therefore, the maximum number of apples that she can pluck will be 48+48+48 = 144 apples

Example 2:
ip1: 
3
8 40 77
op: 80


Explanation:
Allie starts collecting apples from the second tree onwards. Therefore, the maximum number of 
apples that she can pluck will be 40+40 = 80 apples from the second and third tree respectively.

ex3:
ip:
8
10 5 6 20 8 5 7 8
op:
40
*/

