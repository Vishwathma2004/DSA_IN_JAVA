/*
180. Consecutive Numbers
SQL Schema
Pandas Schema
Table: Logs

 

Find all numbers that appear at least three times consecutively.

Return the result table in any order.

The result format is in the following example.
Example 1:

Input: 
Logs table:
+----+-----+
| id | num |
+----+-----+
| 1  | 1   |
| 2  | 1   |
| 3  | 1   |
| 4  | 2   |
| 5  | 1   |
| 6  | 2   |
| 7  | 2   |
+----+-----+
Output: 
+-----------------+
| ConsecutiveNums |
+-----------------+
| 1               |
+-----------------+
Explanation: 1 is the only number that appears consecutively for at least three times.
*/
SELECT DISTINCT l1.num as ConsecutiveNums 
FROM Logs l1
JOIN Logs l2 ON l1.id = l2.id - 1
JOIN Logs l3 ON l1.id = l3.id-2
WHERE l1.num = l2.num && l2.num = l3.num;