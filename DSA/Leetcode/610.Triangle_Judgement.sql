/*
https://leetcode.com/problems/triangle-judgement/description/
610. Triangle Judgement
Report for every three line segments whether they can form a triangle.
Return the result table in any order.
The result format is in the following example.
Example 1:
Input: 
Triangle table:
+----+----+----+
| x  | y  | z  |
+----+----+----+
| 13 | 15 | 30 |
| 10 | 20 | 15 |
+----+----+----+
Output: 
+----+----+----+----------+
| x  | y  | z  | triangle |
+----+----+----+----------+
| 13 | 15 | 30 | No       |
| 10 | 20 | 15 | Yes      |
+----+----+----+----------+
*/
SELECT x,y,z,IF(x+y>z AND y+z>x AND x+z>y ,"Yes","No") as triangle
FROM Triangle;