/*
https://leetcode.com/problems/last-person-to-fit-in-the-bus/description/
Write a solution to find the person_name of the last person that can fit on the bus without exceeding the weight limit. The test cases are generated such that the first person does not exceed the weight limit.
Note that only one person can board the bus at any given turn.
The result format is in the following example.

Example 1:
Input: 
Queue table:
+-----------+-------------+--------+------+
| person_id | person_name | weight | turn |
+-----------+-------------+--------+------+
| 5         | Alice       | 250    | 1    |
| 4         | Bob         | 175    | 5    |
| 3         | Alex        | 350    | 2    |
| 6         | John Cena   | 400    | 3    |
| 1         | Winston     | 500    | 6    |
| 2         | Marie       | 200    | 4    |
+-----------+-------------+--------+------+
Output: 
+-------------+
| person_name |
+-------------+
| John Cena   |
+-------------+
Explanation: The folowing table is ordered by the turn for simplicity.
+------+----+-----------+--------+--------------+
| Turn | ID | Name      | Weight | Total Weight |
+------+----+-----------+--------+--------------+
| 1    | 5  | Alice     | 250    | 250          |
| 2    | 3  | Alex      | 350    | 600          |
| 3    | 6  | John Cena | 400    | 1000         | (last person to board)
| 4    | 2  | Marie     | 200    | 1200         | (cannot board)
| 5    | 4  | Bob       | 175    | ___          |
| 6    | 1  | Winston   | 500    | ___          |
+------+----+-----------+--------+--------------+
*/
SELECT q1.person_name
FROM Queue q1
INNER JOIN Queue q2
ON q1.turn>=q2.turn
GROUP BY q1.turn
HAVING sum(q2.weight)<=1000
ORDER BY  SUM(q2.weight) DESC
LIMIT 1;